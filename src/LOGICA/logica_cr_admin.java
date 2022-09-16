
package LOGICA;


import javax.swing.JOptionPane;
import CONEXION.conexion;
import java.sql.*;
import VISTAS.CRUD_ADMIN.jframe_main_cr_admin;
import VISTAS.CRUD_ADMIN.jframe_añadir;
import static VISTAS.CRUD_ADMIN.jframe_main_cr_admin.tabla;
import static VISTAS.CRUD_ADMIN.jframe_main_cr_admin.txt_buscar;
import static VISTAS.CRUD_ADMIN.jframe_añadir.txt_contraseña;
import VISTAS.CRUD_ADMIN.jframe_cr_editar_admin;
import java.awt.HeadlessException;

import javax.swing.table.DefaultTableModel;

/*Absolutamente toda la logica las hize declarando partes del  jframe como publicas para hacer la logica desde aqui mas 
comodamente  y evitar la acumulacion de codigo el cual puede ser inlegible en algunos casos */

/*en este caso declare partes publicas del jframe_cr_admin*/

public class logica_cr_admin {
  
    
    
    conexion con = new conexion();//objecto para la conexion
    Connection cn= con.conexion();
   

    
   // este metodo lo uso para agregar nuevos admintradores
    public void añadir(){
         
        try {
            boolean resultado=false;//creo una variable boleana para manejar mas comodamente los resultados
            int cc_admin =Integer.parseInt(jframe_añadir.txt_documento.getText());//creo una variable entera la cual parsea la caja de texto txt documento para poder hacer las cosultas dentro de este metodo
            //creo un consulta
            String sql="select * from validacion_administrador where cc_admin='"+ cc_admin+"'";
            Statement st =cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            //la recorro
            while(rs.next()){resultado=true;} //la inicialiso si incontre resultados
            //si encontre resultados muestro este mensaje
            if (resultado ==true) {JOptionPane.showMessageDialog(null,"el usuario que intentas añadir ya encuentra registrado");}

            //si no ejecuto las lineas de codigo que esta en su interior
            if (resultado == false){

                try {
                    //prepero un estamento en este caso un insert
                    PreparedStatement pss = cn.prepareStatement("insert into validacion_administrador (cc_admin,contraseña)values (?,?)");
                    pss.setInt(1, cc_admin);
                    pss.setString(2,jframe_añadir.txt_contraseña.getText());
                    pss.executeUpdate();
                    //llamamos al metodo de limpiar despues de haber ejecutado con exito la consulta
                    this.limpiar();
                    JOptionPane.showMessageDialog(null, "operacion cargada con exito");}
                catch (HeadlessException | SQLException e) {System.out.println("erro en " + e);}}//si hay un error lo mostramos por consola
        }catch (HeadlessException | SQLException e) {System.out.println("erro en " + e);}}//si hay un error lo mostramos por consola
  
    
    
    //creacion de metodo para la logica de la edicion de los  usuario en este caso los instructores
    public void editar(){
            /*traigo el txt_oculto el cual al cliquear sobre el jtable se va automaticamente para alla
            esto lo hago con la intencion de que ala cliquear sobre la tabla me agarre la pocion en la cual estan los campos id
            y haci poder editar la informacion con comodidad y editarla sobre todo en la tabla y en la base de datos respectivament
            */
             int id =Integer.parseInt(jframe_cr_editar_admin.txt_id_admin.getText());
             int documento = Integer.parseInt(jframe_cr_editar_admin.txt_documento.getText());
             
            try {
                //preparo el estamento
                PreparedStatement pss = cn.prepareStatement("UPDATE validacion_administrador SET cc_admin=?,contraseña=? WHERE id_admin=?");
                pss.setInt(1,documento );
                pss.setString(2,jframe_cr_editar_admin.txt_contraseña.getText());
                pss.setInt(3, id);
                pss.executeUpdate();
                //llamo el metodo limpiar despues de la ejecucion de este metodo
                this.limpiar();
                JOptionPane.showMessageDialog(null, "registro modificado con Exito!");}
            catch (HeadlessException | SQLException e) {System.out.println("erro en " + e);}}//si algo sale mal muestro un error
        

    // con este metodo realizo una eliminacion en cascada de todos lo datos del usuario que yo ya no desee en mi sistema
    public void eliminar(){
       
        int id =Integer.parseInt(jframe_main_cr_admin.txt_id.getText());//conversion de texto a entero jtexfiel de id de admin
        try {
             //preparo el estamento para deletear a la persona como tal
            PreparedStatement pss = cn.prepareStatement("DELETE FROM validacion_administrador WHERE id_admin=?");
            pss.setInt(1, id);
            pss.executeUpdate();
            JOptionPane.showMessageDialog(null, "registro Eliminado con Exito!");}
        catch (HeadlessException | SQLException e) {System.out.println("erro en " + e);}}//si hay un error lo muestro por consola
    
    
    //este metodo lo uso para la mayoria de eventos como  eliminar o editar   y funciona de la siguiente manera
    public void cliquear(){
    
        try {
            //estas variables las declaro y le digos que cada vez que cliequee sobre una fila me va a traer la ciolumna cero de la fila cero osea me traera el id del usuario con el que hare una consulta para cada evento como eliminar desactivar o eliminar o editar
            int fila =jframe_main_cr_admin.tabla.getSelectedRow();
            int id =Integer.parseInt(jframe_main_cr_admin.tabla.getValueAt(fila, 0).toString());
            //preparo la consulta
            PreparedStatement ps ;
            ResultSet rs;
            ps = cn.prepareStatement("select  cc_admin, contraseña  from validacion_administrador where  id_admin =? ");
            ps.setInt(1, id);
            rs=ps.executeQuery();
            
            
            while(rs.next()){
                //para activar desactivar y eliminar filas en la tabla y en la base de datos 
                jframe_main_cr_admin.txt_id.setText(String.valueOf(id));
                jframe_cr_editar_admin.txt_id_admin.setText(String.valueOf(id));
                jframe_cr_editar_admin.txt_documento.setText(rs.getString("cc_admin"));
                jframe_cr_editar_admin.txt_contraseña.setText(rs.getString("contraseña"));
            }
   
        } catch (NumberFormatException | SQLException e) {System.out.println("erro en " + e);}}//si hay un error lo muestro por consola
 
    
    // con este metodo buscar lo que hago es hacer consultas para mostrarlas en la tabla del jframe
    public void buscar() {
        
        DefaultTableModel modelo =  (DefaultTableModel) tabla.getModel();//creo un modelo para poder interactuar con mi jtable 
         //con este while cuento y remueo la fila 0 para no sobreponer resultados uno encima de otro
        while (modelo.getRowCount()>0) {modelo.removeRow(0);}
        //con este condicional le digo que si la caja de texto en el jframe esta vacia hare una consulta la cual me traera todos los datos de x persona
        if (txt_buscar.getText().equals("")) {
            int columnas;//declaro una varible de tipo entera que usare mas adelante para contar la columna que tenga la consulta
            try {
                //preparo la consulta
                PreparedStatement ps=cn.prepareStatement("select * from validacion_administrador");
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
            catch (SQLException e) {System.out.println("error en  " + e);}  //si hay un error lo muestro por consola
        }
            
  

        else  {
           int columnas;//declaro otra varible de tipo entera que usare mas adelante para contar la columna que tenga la consulta        
            try {
                 //hago la consulta
                //tomando lo que el usuario escribio por la caja de texto para los resultados buscados mostrandolos si los encuentra
                String sql ="SELECT * FROM validacion_administrador  where ("
                +"id_admin LIKE '"+jframe_main_cr_admin.txt_buscar.getText()+"%' OR "
                +"cc_admin LIKE '"+ jframe_main_cr_admin.txt_buscar.getText()+"%'"
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
            } catch (SQLException e) {System.out.println("erro en " + e);}}//si hay un error lo muestro por consola
    }
 
    //metodo para limpiar los campos de texto
    private void limpiar(){ 
        jframe_añadir.txt_documento.setText("");
        jframe_añadir.txt_contraseña.setText("");}
    
    
}
    

     

     


