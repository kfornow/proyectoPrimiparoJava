
package LOGICA;
import java.sql.*;
import CONEXION.conexion;
import javax.swing.JOptionPane;
import VISTAS.CRUD_INSTRUCTOR.jframe_añadir;


/*Absolutamente toda la logica las hize declarando partes del  jframe como publicas para hacer la logica desde aqui mas 
comodamente  y evitar la acumulacion de codigo el cual puede ser inlegible en algunos casos */

/*en este caso declare partes publicas del jframe_añadir en vistas crud instructor*/


public class logica_añadir_instructor {
    conexion con = new conexion();// declaracion de objecto conexion para las consultas
    Connection cn =con.conexion();
    
    
    public int  id_tipo_contrato;

    
    //con este metodo cargamos el combobox que contiene los tipos de contrato del instructor
    public void cargar_combo(){
   
        try {
            //preparo la consulta
            String sql = "SELECT  nombre FROM tipos_de_contrato ";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            //añado un item para cuando el usario execute el jframe
            jframe_añadir.cb_tipo_d_contrato.addItem("tipo de contrato");
            while(rs.next()){jframe_añadir.cb_tipo_d_contrato.addItem(rs.getString("nombre"));}
        } catch (Exception e) {System.out.println("error en " + e);}
   }
    
  
    public void registro (){//creacion de metodo para la logica del registro del usuario en este caso el instructor
        
        try {
            boolean resultado=false;//declaracion de una variable boleana para manejar los condicionales de  la consulta
            int documento=Integer.parseInt(jframe_añadir.txt_documento.getText());//parceo,del txt_documento que esta en el jframe registro
   
            //cosulta haciendo uso del txt_documento para verificar si se encuentra el usuario en la base de datos
            String sql="select * from persona_instructor where cc_instruc='"+ documento+"'";
            //preparacion de logica sql para ejecutar la consulta
            Statement st =cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            //recoremos los resultados con un while
            while (rs.next()){resultado=true;}//si se encuentran resultado la variable resultados cambiara su estado

            //si encuentra algun resultado considiente con lo que escribio el usuario mostrara el mensaje 
            if (resultado==true){JOptionPane.showMessageDialog(null, "!!El instructor que intentas registrar ya esta registrado¡¡");}
              
              
            //si no encuentra coincidencias significa que el usuario no esta registrado por lo que procedera a registrarlo
            if (resultado == false){
 
            
                try {
                    
                    /*esta consulta es para que cuando se  seleccione un item del combo box tipos de contrato pueda
                    verificar por el nombre el id que tiene en la base de datos */
                    String sql2 ="Select id_contrato from tipos_de_contrato where nombre='"+ jframe_añadir.cb_tipo_d_contrato.getSelectedItem()+"'";
                    Statement st2 = cn.createStatement();
                    ResultSet rs2 = st2.executeQuery(sql2);

                    while (rs2.next()) {id_tipo_contrato=rs2.getInt(1);}
                     
  

                    //preparamos el estamento con incongnitas para luego llamarlas y otorgarles un dicho valor
                    PreparedStatement pss1 = cn.prepareStatement(
                    "insert persona_instructor (cc_instruc, nombre_instruc, apellido , edad ,id_contrato_fk, estado) values(?,?,?,?,?,?) ");
                    pss1.setInt(1,documento);
                    pss1.setString(2, jframe_añadir.txt_nombre.getText());  
                    pss1.setString(3, jframe_añadir.txt_apellido.getText());
                    pss1.setString(4, jframe_añadir.cb_edad.getSelectedItem().toString());
                    pss1.setInt(5, id_tipo_contrato);//aqui utilisamos la variable antes declarada para usarla y con el valor obtenido , insertar la informacion en el campo id_contrato_fk
                    pss1.setString(6, "A");//el estado siempre cuando se registre va a hacer activo amenos de que lo desactivemos manualmente
                    pss1.executeUpdate();

                    PreparedStatement pss2 =cn.prepareStatement("INSERT INTO validacion_instructor (cc_instruc_fk , contraseña ) values (?,?)");
                    pss2.setInt(1, documento);
                    pss2.setString(2,jframe_añadir.txt_contraseña.getText());
                    pss2.executeUpdate();

                    PreparedStatement pss3 = cn.prepareStatement("INSERT INTO  conctacto_instructor(id_conct, telfon, email, cc_instruc_fk) values (?,?,?,?)");
                    pss3.setInt(1, 0);
                    pss3.setString(2, jframe_añadir.txt_telefono.getText());
                    pss3.setString(3,jframe_añadir.txt_email.getText());
                    pss3.setInt(4, documento);
                    pss3.executeUpdate();
                    this.limpiar();
                    JOptionPane.showMessageDialog(null, "te has registrado sactisfactoriamente");//si todo salio ok mostraremos este mesaje

                }catch (Exception e) {System.out.println("error " + e);}}//encaso de un error se imprimira un mesaje con dicho error

            }
            catch (Exception e) {System.out.println("error  " + e );}//encaso de un error se imprimira un mesaje con dicho error
        
       
         
        
        }
    
        //metodo para limpiar las cajas de texto
        private void limpiar(){
        
        jframe_añadir.txt_documento.setText("");
        jframe_añadir.txt_nombre.setText("");
        jframe_añadir.txt_apellido.setText("");
        jframe_añadir.txt_telefono.setText("");
        jframe_añadir.txt_email.setText("");
        jframe_añadir.txt_contraseña.setText("");
        jframe_añadir.txt_confirmContr.setText("");
        jframe_añadir.cb_edad.setSelectedItem("Edad");
        jframe_añadir.cb_tipo_d_contrato.setSelectedItem("tipo de contrato");
           
        
    }
}
