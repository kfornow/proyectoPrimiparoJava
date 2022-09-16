
package LOGICA;


import CONEXION.conexion;
import VISTAS.CRUD_INSTRUCTOR.jframe_instructores_inactiv;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*Absolutamente toda la logica las hize declarando partes del  jframe como publicas para hacer la logica desde aqui mas 
comodamente  y evitar la acumulacion de codigo el cual puede ser inlegible en algunos casos */


/*en este caso declare partes publicas del jframe_instructores_inactiv*/
public class logica_cr_instruc_inactiv {
    
    conexion con = new conexion();//objecto conexion para las consultas
    Connection cn =con.conexion();
    
    
    //este metodo es para hacer un cambio en el estado del instructor de inactivo a activo
    public void activar(){
        int cc_instruc =Integer.parseInt(jframe_instructores_inactiv.txt_id_edit.getText());//conversion de texto a entero jtexfiel de id de admin
        
        try {
            boolean resultado = false;//creacion de variable boleana  para recibir la consulta
            //preparo la consulta
            String sql ="SELECT cc_instruc estado from persona_instructor where estado= 'I' and cc_instruc='"+cc_instruc+"'";
            Statement st = cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
             //recorro la consulta
            while(rs.next()){resultado =true;}
            
            //si encuentra resultados se executa el codigo dentro del condicional
            if (resultado ==true) {
                try {
                    //preparo otro estamento en este caso un update  para activar el estado de la persona
                    PreparedStatement pss = cn.prepareStatement("UPDATE persona_instructor SET  estado='A'  WHERE cc_instruc=?");
                    pss.setInt(1, cc_instruc);
                    pss.executeUpdate();
                    JOptionPane.showMessageDialog(null, "registro Activado con Exito!");

                } catch (HeadlessException | SQLException e) {System.out.println("error en " + e);}}//si hay un error lo muestro por consola

             // si no encuentra resultado retornara este mensaje
            if (resultado==false) {JOptionPane.showMessageDialog(null,"este registro no se puede activar por que esta activo!!");}
            
        } catch (HeadlessException | SQLException e) {System.out.println("error en " + e);}//si hay un error lo muestro por consola
    }

     

     // con este metodo realizo una eliminacion en cascada de todos lo datos del usuario que yo ya no desee en mi sistema
    public void eliminar(){
        
        int id_edit =Integer.parseInt(jframe_instructores_inactiv.txt_id_edit.getText());//conversion de texto a entero jtexfiel de id de admin
        try {
            //preparo el estamento para deletear a la persona como tal
            PreparedStatement pss = cn.prepareStatement("delete from  persona_instructor   WHERE cc_instruc=?");
            pss.setInt(1, id_edit);
            pss.executeUpdate();
            JOptionPane.showMessageDialog(null, "registro Eliminado con Exito!");}
        catch (Exception e) {System.out.println("error en " + e);}}//si hay un error lo muestro por consola
       
    
    
    //este metodo lo uso para la mayoria de eventos como  activar o eliminar  y funciona de la siguiente manera
    public void cliquear(){
        
        try {
            //estas variables las declaro y le digos que cada vez que cliequee sobre una fila me va a traer la ciolumna cero de la fila cero osea me traera el id del usuario con el que hare una consulta para cada evento como eliminar desactivar o eliminar o editar
            int fila =jframe_instructores_inactiv.tabla.getSelectedRow();
            int id_edit_rows =Integer.parseInt(jframe_instructores_inactiv.tabla.getValueAt(fila, 0).toString());
            //preparo la consulta
            PreparedStatement ps ;
            ResultSet rs;
            ps = cn.prepareStatement
            ("SELECT  cc_instruc , nombre_instruc , apellido , edad ,telfon,email,contraseña,estado ,nombre "
            + " from conctacto_instructor , persona_instructor ,validacion_instructor, tipos_de_contrato   "
            + "WHERE   cc_instruc=? AND persona_instructor.id_contrato_fk =tipos_de_contrato.id_contrato ");
            
            ps.setInt(1, id_edit_rows);
            rs=ps.executeQuery();
            
            
            while(rs.next()){
                //para activar desactivar y eliminar filas en la tabla y en la base de datos
                jframe_instructores_inactiv.txt_id_edit.setText(String.valueOf(id_edit_rows));
            }
   
         } catch (NumberFormatException | SQLException e) {System.out.println("error en " + e);}}//si hay un error lo muestro por consola
    
    
    
    // con este metodo buscar lo que hago es hacer consultas para mostrarlas en la tabla del jframe
    public void buscar() {
 
        DefaultTableModel modelo =  (DefaultTableModel) jframe_instructores_inactiv.tabla.getModel();//creo un modelo para poder interactuar con mi jtable 
        //con este while cuento y remueo la fila 0 para no sobreponer resultados uno encima de otro
        while (modelo.getRowCount()>0) {modelo.removeRow(0);}
        //con este condicional le digo que si la caja de texto en el jframe esta vacia hare una consulta la cual me traera todos los datos de x persona
        if (jframe_instructores_inactiv.txt_buscar.getText().equals("")) {
            
            int columnas;//declaro una varible de tipo entera que usare mas adelante para contar la columna que tenga la consulta
            try {
                 //preparo la consulta
                PreparedStatement ps=cn.prepareStatement(
                  "SELECT DISTINCT cc_instruc , nombre_instruc , apellido , edad , telfon , email , contraseña,  nombre as tipo_contrato ,estado "
                  + "from  conctacto_instructor, persona_instructor,validacion_instructor,tipos_de_contrato WHERE "
                  +"estado='I' AND  "
                  + "persona_instructor.cc_instruc= conctacto_instructor.cc_instruc_fk"
                  + " AND  persona_instructor.cc_instruc=validacion_instructor.cc_instruc_fk AND  persona_instructor.id_contrato_fk =tipos_de_contrato.id_contrato;");

                ResultSet rs=ps.executeQuery();
                ResultSetMetaData rsmd=rs.getMetaData();//declaro resulsetmetada que me ayudara con la funcion de contar las columnas del arreglo
                columnas=rsmd.getColumnCount();//ala variable columnas antes mensionada le declaro lo que contendra que es el get column cout que como su abreviatura lo dice cuenta columnas
                 //lo recorro con un while
                while (rs.next()) {
                    //creo un objecto llamado filas y le paso lo la variable columnas 
                    Object[] filas=new Object[columnas];
                    //lo recorro con un for y a filas le agrego el indice de cada consulta 
                    //creando asi una matriz la cual añada filas y columnas dependiendo del volumen de datos a mostrar
                    for (int index=0 ; index<columnas;index++){
                        filas[index]=rs.getObject(index + 1);}
                        modelo.addRow(filas);}}//añado el objecto de tipo arreglo al modelo para traerme los resultados y mostrarlos
            catch (SQLException e) {System.out.println("error en " + e);}  //si hay un error lo muestro por consola
        }
            
        
        else  {
           int columnas; //declaro otra varible de tipo entera que usare mas adelante para contar la columna que tenga la consulta 
            try {
                //hago la consulta
                //tomando lo que el usuario escribio por la caja de texto para los resultados buscados mostrandolos si los encuentra
                String sql ="SELECT DISTINCT cc_instruc , nombre_instruc , apellido , edad ,telfon,email ,contraseña ,nombre as nombre_contrato ,estado from conctacto_instructor,persona_instructor,validacion_instructor,tipos_de_contrato "
                 + "WHERE estado='I' and persona_instructor.cc_instruc= conctacto_instructor.cc_instruc_fk AND persona_instructor.cc_instruc=validacion_instructor.cc_instruc_fk  and persona_instructor.id_contrato_fk = tipos_de_contrato.id_contrato  and ("
                +"  cc_instruc  LIKE '"+jframe_instructores_inactiv.txt_buscar.getText()+"%' OR "
                +"  nombre_instruc      LIKE '"+jframe_instructores_inactiv.txt_buscar.getText()+"%' OR "
                +"  apellido    LIKE '"+jframe_instructores_inactiv.txt_buscar.getText()+"%' OR "
                +"  edad LIKE '"+       jframe_instructores_inactiv.txt_buscar.getText()+"%' OR "
                +"  telfon      LIKE '"+jframe_instructores_inactiv.txt_buscar.getText()+"%' OR "
                +"  nombre      LIKE '"+jframe_instructores_inactiv.txt_buscar.getText()+"%' OR "
                +"  email       LIKE '"+ jframe_instructores_inactiv.txt_buscar.getText()+"%'"
                +")";
                        
                //preparo el estamento 
                Statement st =cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                ResultSetMetaData rsmd=rs.getMetaData();
                columnas=rsmd.getColumnCount();
                
                //lo recorro con un while
                while(rs.next()){
                    //creo un objecto llamado filas y le paso lo la variable columnas 
                    Object filas[]= new Object[columnas];
                    //lo recorro con un for y a filas le agrego el indice de cada consulta 
                    //creando asi una matriz la cual añada filas y columnas dependiendo del volumen de datos a mostrar
                    for (int index=0 ; index<columnas;index++){
                        filas[index]=rs.getObject(index +1);}
                    modelo.addRow(filas);//añado el objecto de tipo arreglo al modelo para traerme los resultados y mostrarlos
                }
            } catch (SQLException e) {System.out.println("error en " + e); }}//si hay un error lo muestro por consola
        }
    
     
    
    
}
