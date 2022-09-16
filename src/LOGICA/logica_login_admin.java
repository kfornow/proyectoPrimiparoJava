
package LOGICA;

import java.sql.*;
import CONEXION.conexion;
import javax.swing.JOptionPane;
import VISTAS.LOGIN.jframe_login;
import VISTAS.AJUSTES.jframe_ajustes;
import java.awt.HeadlessException;

/*Absolutamente toda la logica las hize declarando partes del  jframe como publicas para hacer la logica desde aqui mas 
comodamente  y evitar la acumulacion de codigo el cual puede ser inlegible en algunos casos */

/*en este caso declare partes publicas del jframe_login */



public class logica_login_admin {
    
    conexion con = new conexion();// instanceamos objecto conexion para las consultas
    Connection cn =con.conexion();
    //instanceamos  el jfram_ajustes que nos servira en el caso de  que  las credenciales del administrador sean correctas
    jframe_ajustes ajustes =new jframe_ajustes(); 
    
   

    public void  login_admin(){
        boolean resultado = false;// declaracion de una variable boleana para manejar los condicionales de  la consulta 
        int documento = Integer.parseInt(jframe_login.txt_documento.getText());//parceo,del txt_documento que esta en el jframe_login

        try {
            /*cosulta haciendo uso del txt_documento y la txt_contraseña  para verificar si el usuario se encuentra en la base de datos */
            String sql=//hago la respectivamente consulta       
             "select * from validacion_administrador where cc_admin='"+documento+"' and contraseña='"+ jframe_login.txt_contraseña.getText() +"'";
            Statement st =cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            //recoremos los resultados con un while
            while (rs.next()){resultado=true;}//se inicialisa la variable si encuentra resultados

            //si encuentra algun usuario que tenga las credenciales correctamente va visualisarse el jframe ajustes
            if (resultado ==true){
                ajustes.setVisible(true);}
            //si no encuentra algun usuario que no tenga las credenciales correctamente va visualisarse el siguiente mensaje
            if (resultado ==false ) {
                JOptionPane.showConfirmDialog(null, "!Las credenciales de administrador ingresadas no son correctas por favor verifica nuevamente");
            }

        } catch (HeadlessException | SQLException e) {System.out.println("error " + e);}} //si hay errores se imprimira este mensaje por consola  

   
}
