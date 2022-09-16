
package LOGICA;


import java.sql.ResultSetMetaData;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import CONEXION.conexion;
import VISTAS.CRUD_INSTRUCTOR.jframe_main_cr_instr;
import VISTAS.CRUD_INSTRUCTOR.jframe_editar_cr_instr;
import java.awt.HeadlessException;

/*Absolutamente toda la logica las hize declarando partes del  jframe como publicas para hacer la logica desde aqui mas 
comodamente  y evitar la acumulacion de codigo el cual puede ser inlegible en algunos casos */

/*en este caso declare partes publicas del jframe_main_cr_instr y  jframe_editar_instr */



public class logica_cr_main_instructor {

    conexion con = new conexion();// declaracion de objecto conexion para las consultas
    Connection cn =con.conexion();
    
     public int  id_tipo_contrato;

    
    //cargo el combo box para los tipos de contrato 
    public void cargar_combo(){
   
        try {
            //preparo la consulta
            String sql = "SELECT  nombre FROM tipos_de_contrato ";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            //añado un item para cuando el usario execute el jframe
            jframe_editar_cr_instr.cb_tipo_d_contrato.addItem("tipo de contrato");
            while(rs.next()){
            
                jframe_editar_cr_instr.cb_tipo_d_contrato.addItem(rs.getString("nombre"));
            }
        } catch (Exception e) {System.out.println("error en " + e);}}//si hay un error lo muestro por consola
    
    
    
    //creacion de metodo para la logica de la edicion de los  usuario en este caso los instructores
    public void editar(){
        /*traigo el txt_oculto el cual al cliquear sobre el jtable se va automaticamente para alla
          esto lo hago con la intencion de que ala cliquear sobre la tabla me agarre la pocion en la cual estan los campos id
           y haci poder editar la informacion con comodidad y editarla sobre todo en la tabla y en la base de datos respectivament
        */
        int id_edit_rows =Integer.parseInt(jframe_editar_cr_instr.txt_id_edit.getText());
        int documento = Integer.parseInt(jframe_editar_cr_instr.txt_cc_instruc.getText());//parceo,del txt_documento que esta en el jframe_editar_cr_instr

        try {
            
            /*esta consulta es para que cuando se  seleccione un item del combo box tipos de contrato pueda
            verificar por el nombre el id que tiene en la base de datos */
            String sql2 ="Select id_contrato from tipos_de_contrato where nombre='"+ jframe_editar_cr_instr.cb_tipo_d_contrato.getSelectedItem()+"'";
            Statement st2 = cn.createStatement();
            ResultSet rs2 = st2.executeQuery(sql2);

            while (rs2.next()) {id_tipo_contrato=rs2.getInt(1);}
            
            //preparamos lo cambios a realizar y los executamos segun el estamento de cada consulta
            PreparedStatement pss = cn.prepareStatement("UPDATE  persona_instructor   SET cc_instruc=? , nombre_instruc=?, apellido=? ,edad=? ,id_contrato_fk=?   WHERE cc_instruc=?");
            pss.setInt(1,documento );
            pss.setString(2, jframe_editar_cr_instr.txt_nombre.getText());
            pss.setString(3, jframe_editar_cr_instr.txt_apellido.getText());        
            pss.setString(4,jframe_editar_cr_instr.cb_edad.getSelectedItem().toString());
            pss.setInt(5, id_tipo_contrato);
            pss.setInt(6, id_edit_rows);
          
            pss.executeUpdate();

            PreparedStatement pss1 = cn.prepareStatement("UPDATE conctacto_instructor   SET cc_instruc_fk=? , email=? , telfon=?   WHERE cc_instruc_fk=?");
            pss1.setInt(1,documento);
            pss1.setString(2,jframe_editar_cr_instr.txt_email.getText());
            pss1.setString(3,jframe_editar_cr_instr.txt_telefono.getText());
            pss1.setInt(4, id_edit_rows);
            pss1.executeUpdate();

            PreparedStatement pss2 = cn.prepareStatement("UPDATE validacion_instructor   SET cc_instruc_fk=? , contraseña=?    WHERE cc_instruc_fk=?");
            pss2.setInt(1,documento );
            pss2.setString(2, jframe_editar_cr_instr.txt_contraseña.getText());
            pss2.setInt(3, id_edit_rows);
            pss2.executeUpdate();


        JOptionPane.showMessageDialog(null, "registro modificado con Exito!");}
        catch (HeadlessException | SQLException e) {System.out.println("error en " + e);}}//si hay un error lo muestro por consola

    
    
    //este metodo es para hacer un cambio en el estado del instructor de activo a inactivo
    public void desactivar(){
            
        int cc_instruc =Integer.parseInt(jframe_main_cr_instr.txt_id_edit.getText());//conversion de texto a entero jtexfiel de id de admin
      
        try {
            boolean resultado = false;//creacion de variable boleana  para recibir la consulta
            //preparo la consulta
            String sql ="SELECT cc_instruc estado from persona_instructor where estado= 'A' and cc_instruc='"+cc_instruc+"'";
            Statement st = cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            //recorro la consulta
            while(rs.next()){resultado =true;}//activo la variable boleana si incuentra resultados
            //si encuentra resultados se executa el codigo dentro del condicional
            if (resultado==true) {
                try {
                    //preparo otro estamento en este caso un update  para desactivar el el estado de la persona
                    PreparedStatement pss = cn.prepareStatement("UPDATE persona_instructor SET  estado='I'  WHERE cc_instruc=?");
                    pss.setInt(1, cc_instruc);
                    pss.executeUpdate();
                    JOptionPane.showMessageDialog(null, "registro desactivado con Exito!");

                } catch (Exception e) {System.out.println("error en " + e );}}//si hay un error lo muestro por consola


            if (resultado==false) {JOptionPane.showMessageDialog(null,"este registro no se puede desactivar por que ya esta desactivado !!");}

        } catch (Exception e) {System.out.println("error en " + e );}//si hay un error lo muestro por consola
            
    }
    
    
    //este metodo lo uso para la mayoria de eventos como desactivar activar o eliminar  y funciona de la siguiente manera
    public void cliquear(){
        
        try {
            //estas variables las declaro y les digo que cada vez que cliequee sobre una fila me va a traer la ciolumna cero de la fila cero osea me traera el id del usuario con el que hare una consulta para cada evento como eliminar desactivar o eliminar o editar
            int fila =jframe_main_cr_instr.tabla.getSelectedRow();
            int id_edit_rows =Integer.parseInt(jframe_main_cr_instr.tabla.getValueAt(fila, 0).toString());
            //preparo la consulta
            PreparedStatement ps ;
            ResultSet rs;
            ps = cn.prepareStatement
            ("SELECT  cc_instruc , nombre_instruc , apellido , edad ,telfon,email,contraseña,estado ,nombre "
            + " from conctacto_instructor , persona_instructor ,validacion_instructor, tipos_de_contrato   "
            + "WHERE  persona_instructor.id_contrato_fk =tipos_de_contrato.id_contrato AND  cc_instruc=?");
            
            ps.setInt(1, id_edit_rows);
            rs=ps.executeQuery();
            
            
            while(rs.next()){
                //para activar desactivar y eliminar filas en la tabla y en la base de datos
                jframe_main_cr_instr.txt_id_edit.setText(String.valueOf(id_edit_rows));

                
                
                //para editar en el formulario principal y en la base de datos
                jframe_editar_cr_instr.txt_id_edit.setText(String.valueOf(id_edit_rows));
                jframe_editar_cr_instr.txt_cc_instruc.setText(rs.getString("cc_instruc"));
                jframe_editar_cr_instr.txt_nombre.setText(rs.getString("nombre_instruc"));
                jframe_editar_cr_instr.txt_apellido.setText(rs.getString("apellido"));
                jframe_editar_cr_instr.txt_telefono.setText(rs.getString("telfon"));            
                jframe_editar_cr_instr.txt_email.setText(rs.getString("email"));
                jframe_editar_cr_instr.cb_edad.setSelectedItem(rs.getString("edad"));
                jframe_editar_cr_instr.cb_tipo_d_contrato.setSelectedItem(rs.getString("nombre"));
                jframe_editar_cr_instr.txt_contraseña.setText(rs.getString("contraseña"));
 
  
            }
   
         } catch (NumberFormatException | SQLException e) {System.out.println("error en " + e );}}//si hay un error lo muestro por consola
    
    // con este metodo buscar lo que hago es hacer consultas para mostrarlas en la tabla del jframe
    public void buscar() {
 
        DefaultTableModel modelo =  (DefaultTableModel) jframe_main_cr_instr.tabla.getModel();//creo un modelo para poder interactuar con mi jtable 
        //con este while cuento y remueo la fila 0 para no sobreponer resultados uno encima de otro
        while (modelo.getRowCount()>0) {modelo.removeRow(0);}
         
        //con este condicional le digo que si la caja de texto en el jframe esta vacia hare una consulta la cual me traera todos los datos de x persona
        if (jframe_main_cr_instr.txt_buscar.getText().equals("")) {
            
            int columnas;//declaro una varible de tipo entera que usare mas adelante para contar la columna que tenga la consulta
            
            try {
                //preparo la consulta
                PreparedStatement ps=cn.prepareStatement(
                "SELECT DISTINCT cc_instruc , nombre_instruc , apellido , edad , telfon , email , contraseña,  nombre as tipo_contrato ,estado "
                + "from  conctacto_instructor, persona_instructor,validacion_instructor,tipos_de_contrato WHERE "
                +"estado='A' AND  "
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
           int columnas;//declaro otra varible de tipo entera que usare mas adelante para contar la columna que tenga la consulta
  
            try {
                 //hago la consulta
                //tomando lo que el usuario escribio por la caja de texto para los resultados buscados mostrandolos si los encuentra
                String sql ="SELECT DISTINCT cc_instruc , nombre_instruc , apellido , edad ,telfon,email ,contraseña ,nombre as nombre_contrato ,estado from conctacto_instructor,persona_instructor,validacion_instructor,tipos_de_contrato "
                + "WHERE estado='A' and persona_instructor.cc_instruc= conctacto_instructor.cc_instruc_fk AND persona_instructor.cc_instruc=validacion_instructor.cc_instruc_fk  and persona_instructor.id_contrato_fk = tipos_de_contrato.id_contrato  and ("
                +"  cc_instruc  LIKE '"+jframe_main_cr_instr.txt_buscar.getText()+"%' OR "
                +"  nombre_instruc      LIKE '"+jframe_main_cr_instr.txt_buscar.getText()+"%' OR "
                +"  apellido    LIKE '"+jframe_main_cr_instr.txt_buscar.getText()+"%' OR "
                +"  edad LIKE '"+       jframe_main_cr_instr.txt_buscar.getText()+"%' OR "
                +"  telfon      LIKE '"+jframe_main_cr_instr.txt_buscar.getText()+"%' OR "
                +"  nombre      LIKE '"+jframe_main_cr_instr.txt_buscar.getText()+"%' OR "
                +"  email       LIKE '"+ jframe_main_cr_instr.txt_buscar.getText()+"%'"
                +")";
                        
                //preparo el estamento 
                Statement st =cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                ResultSetMetaData rsmd=rs.getMetaData();//declaro resulsetmetada que me ayudara con la funcion de contar las columnas del arreglo
                columnas=rsmd.getColumnCount();//ala variable columnas antes mensionada le declaro lo que contendra que es el get column cout que como su abreviatura lo dice cuenta columnas
                //lo recorro con un while
                while(rs.next()){
                    //creo un objecto llamado filas y le paso lo la variable columnas 
                    Object filas[]= new Object[columnas];
                    //lo recorro con un for y a filas le agrego el indice de cada consulta 
                    //creando asi una matriz la cual añada filas y columnas dependiendo del volumen de datos a mostrar
                    for (int index=0 ; index<columnas;index++){
                        filas[index]=rs.getObject(index +1);}
                    modelo.addRow(filas);}//añado el objecto de tipo arreglo al modelo para traerme los resultados y mostrarlos
            } catch (SQLException e) {System.out.println("error en " + e);}}//si hay un error lo muestro por consola
        }
    
    
    

}
