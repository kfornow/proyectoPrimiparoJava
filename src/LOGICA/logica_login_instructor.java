
package LOGICA;
import CONEXION.conexion;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import VISTAS.LOGIN.jframe_login;
/*Absolutamente toda la logica las hize declarando partes del  jframe como publicas para hacer la logica desde aqui mas 
comodamente  y evitar la acumulacion de codigo el cual puede ser inlegible en algunos casos */

/*en este caso declare partes publicas del jframe_login */


public class logica_login_instructor {
    
    conexion con = new conexion();//objecto conexion para las consultas
    Connection cn =con.conexion();
    
    
   

    //creacion de este metodo para manejar la entrada en el registro de la asistencia de instructores
    public void  entrada(){

        try {
            boolean resultado1 = false;//declaracion de una variable boleana para manejar los condicionales de  la consulta 
            int documento =Integer.parseInt(jframe_login.txt_documento.getText());//parceo,del txt_documento que esta en el jframe_login

            /*cosulta haciendo uso del txt_documento y el estado  para verificar si el usuario se encuentra inactivo */
            String sql1=  //hago la respectivamente consulta
            "SELECT   cc_instruc , estado  from persona_instructor"
            +" where   estado='I'  and   cc_instruc='"+ documento+"'";
            Statement st1 =cn.createStatement();
            ResultSet rs1 = st1.executeQuery(sql1);

            //recoremos los resultados con un while
            while (rs1.next()){resultado1=true;}//se inicialisa la variable si encuentra resultados

            //si encuentra  algun usuario inactivo va a retornar el siguiente mensaje
            if (resultado1 ==true){JOptionPane.showMessageDialog(null,"!El instructor se encuestra desactivado por el momento , por favor hable con el administrador del sistema¡");}

            if (resultado1 ==false ) {//si no encuentras el usuario ingresado como inactivo va a retornar la lineas de codigo dentro de este condicional

                try {
                    boolean resultado2 =false;//creo otra variable bolleana para poder manejar los condicionales de la otra consulta 
                    
                    String sql2= "SELECT cc_instruc_fk ,contraseña from validacion_instructor where cc_instruc_fk='"+ documento+"' and contraseña='"+  jframe_login.txt_contraseña.getText()+"'";
                    Statement st2 =cn.createStatement();
                    ResultSet rs2 = st2.executeQuery(sql2);

                    //recoremos los resultados con un while
                    while (rs2.next()) {resultado2=true;}//se inicialisa la variable si encuentra resultados


                    /*si la variable boleana se a inicialisado en true procedera a realizar otra consulta */
                    if (resultado2==true) {
                        boolean resultado3=false;
                        //en esta cosulta lo que decimos es que si incontramos a x usuario con un estado de asistencia imcompleta no dejara registrar otra entrada almenos de que realiza otra salida
                        String sql3= "SELECT cc_instruc_fk, estado_asistencia from asistencia_instructor where  cc_instruc_fk='"+documento+"' and estado_asistencia='ASISTENCIA INCOMPLETA'";
                        Statement st3 =cn.createStatement();
                        ResultSet rs3 = st3.executeQuery(sql3);

                        //recoremos los resultados con un while
                        while (rs3.next()) {resultado3=true;}
                        //si incuentra resultados  devolvera este mensaje
                        if (resultado3==true) {JOptionPane.showMessageDialog(null, "no puede registrar  entrada por que no ha registrado una salida  ");}

                        //si no entonces returnara el registro de la asistencia del instructor al centro como tal
                        if (resultado3==false) {

                            /*instaceo estas clases dentro de este condicional para que netamente ala hora de 
                            el registro se mucho mas preciso la forma en la que toma la hora 
                            y fecha ya que usare nada mas estos objectos cuando algun instructor realise una entrada al centro*/

                            LocalTime tiempo= LocalTime.now(); //objecto para el la hora
                            LocalDate fecha =LocalDate.now();//objecto para la fecha

                            //preparo la inserccion de los datos pertinentes ala entrada de ese usuario al centro
                            PreparedStatement pss1 = cn.prepareStatement("insert into asistencia_instructor ( cc_instruc_fk , fecha_inicio , hora_inicio , estado_asistencia) values(?,?,?,?)");
                            pss1.setInt(1,documento);
                            pss1.setString(2,fecha.toString()); //llamamos el objecto fecha que inicialiamos para mandarlo como estring al campo fecha de la base de datos
                            pss1.setString(3,tiempo.toString());//llamamos el objecto tiempo que inicialiamos para mandarlo como estring al campo tiempo de la base de datos
                            pss1.setString(4,"ASISTENCIA INCOMPLETA");//mandamos ala olumna estado asistencia de la base de datos este estado como estring lo cual me servira para intectuar entre entrada y salida
                            pss1.executeUpdate();
                            //si todo salio bien en el registro de la entrada del instructor al centro entoces llamo este metodo para limpiar campos
                            this.limpiar_campos();
                            jframe_login.txt_documento.grabFocus();//llamo al caja de txt documento del login y con el grab focus posisionamos el intermitente de teclado dentro de este tefield
                            JOptionPane.showMessageDialog(null, "Se ha registrado tu entrada al centro exitosamente!!");} //si todo esta ok mandara este mensaje     
                        }

                        else{ //si las credenciales introducidas no son correctas retunara este mensaje
                            JOptionPane.showMessageDialog(null, "credenciales incorrectas");
                            jframe_login.txt_contraseña.setText("");
                        }
                } catch (Exception e) {System.out.println("erro en " + e);}//en caso de error mostrara este mensaje por consolda

            }
       } catch (Exception e) {System.out.println("erro en " + e);}//en caso de error mostrara este mensaje por consolda

    }     

        
    public void  salida(){
        
     
        try {
            boolean resultado1 = false;//declaracion de una variable boleana para manejar los condicionales de  la consulta 
            int documento =Integer.parseInt(jframe_login.txt_documento.getText());//parceo,del txt_documento que esta en el jframe_login
             
            /*cosulta haciendo uso del txt_documento y el estado  para verificar si el usuario se encuentra inactivo */
            String sql1=  //hago la respectivamente consulta
            "SELECT   cc_instruc , estado  from persona_instructor"
            +" where   estado='I'  and   cc_instruc='"+ documento+"'";
            Statement st1 =cn.createStatement();
            ResultSet rs1 = st1.executeQuery(sql1);

            //recoremos los resultados con un while
            while (rs1.next()){resultado1=true;}//se inicialisa la variable si encuentra resultados

            //si encuentra  algun usuario inactivo va a retornar el siguiente mensaje
            if (resultado1 ==true){JOptionPane.showMessageDialog(null,"!El instructor se encuestra desactivado por el momento , por favor hable con el administrador del sistema¡");}

            if (resultado1 ==false ) {//si no encuentras el usuario ingresado como inactivo va a retornar la lineas de codigo dentro de este condicional
                
                try {
                   
                    
                    boolean resultado2 =false;//creo otra variable bolleana para poder manejar los condicionales de la otra consulta 
                    
                    //preparo otra consulta
                    String sql2= "SELECT cc_instruc_fk ,contraseña from validacion_instructor where cc_instruc_fk='"+ documento+"' and contraseña='"+  jframe_login.txt_contraseña.getText()+"'";
                    Statement st2 =cn.createStatement();
                    ResultSet rs2 = st2.executeQuery(sql2);

                    //recoremos los resultados con un while
                    while (rs2.next()) {resultado2=true;}//se inicialisa la variable si encuentra resultados


                    /*si la variable boleana se a inicialisado en true procedera a registrar la asistencia del instructor 
                    centro */
                    if (resultado2==true) {
                        
                        
                        
                        boolean resultado3=false;
                        String sql3= "SELECT cc_instruc_fk from asistencia_instructor where  cc_instruc_fk='"+documento+"'";
                        Statement st3 =cn.createStatement();
                        ResultSet rs3 = st3.executeQuery(sql3);
                        while (rs3.next()) {resultado3=true;}
                        
                        if (resultado3==true) {
                            
                            boolean resultado4=false;
                            //en esta cosulta lo que decimos es que si incontramos a x usuario con un estado de asistencia completa no dejara registrar otra salida almenos de que realiza una entrada
                            String sql4= "SELECT cc_instruc_fk, estado_asistencia from asistencia_instructor where  cc_instruc_fk='"+documento+"' and estado_asistencia='ASISTENCIA COMPLETA ' ";
                            Statement st4 =cn.createStatement();
                            ResultSet rs4 = st4.executeQuery(sql4);

                            //recoremos los resultados con un while
                            while (rs4.next()) {resultado4=true;}
                            //si incuentra resultados  devolvera este mensaje
                            if (resultado4==true) {JOptionPane.showMessageDialog(null, "no puede registrar  otra salida sin haber registrado otra entrada ");}

                            if (resultado4==false) {

                                /*instaceo estas clases dentro de este condicional para que netamente ala hora de 
                                el registro se mucho mas preciso la forma en la que toma la hora 
                                y fecha ya que usare nada mas estos objectos cuando algun instructor realise una entrada al centro*/

                                LocalTime tiempo= LocalTime.now(); //objecto para el la hora
                                LocalDate fecha =LocalDate.now();//objecto para la fecha

                                //preparo la inserccion de los datos pertinentes ala entrada de ese usuario al centro
                                PreparedStatement pss = cn.prepareStatement("update asistencia_instructor  SET   fecha_fin=? ,hora_fin=?   WHERE cc_instruc_fk=? and  estado_asistencia=? ");
                                pss.setString(1, fecha.toString());//llamamos el objecto fecha que inicialiamos para mandarlo como estring al campo fecha de la base de datos
                                pss.setString(2, tiempo.toString());//llamamos el objecto tiempo que inicialiamos para mandarlo como estring al campo tiempo de la base de datos
                                pss.setInt(3, documento);
                                pss.setString(4, "ASISTENCIA INCOMPLETA");//le decimos que si incuentra una columna que tenga la asistencia imcompleta con x documento de identidad hara un update de la columnas decididas
                                pss.executeUpdate();

                                PreparedStatement pss1 = cn.prepareStatement("update asistencia_instructor  SET   estado_asistencia=?   WHERE cc_instruc_fk=?");
                                pss1.setString(1, "ASISTENCIA COMPLETA");
                                pss1.setInt(2, documento);
                                pss1.executeUpdate();
                                this.limpiar_campos();
                                jframe_login.txt_documento.grabFocus();
                                JOptionPane.showMessageDialog(null, "Se ha registrado tu salida  exitosamente!!"); //si todo esta ok mandara este mensaje     

                            }

                        }else{JOptionPane.showMessageDialog(null, "no hay ninguna entrada registrada de este instructor no puede registrar una salida si no hay una entrada");}
                        
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "credenciales incorrectas");
                        jframe_login.txt_contraseña.setText("");}
         
                } catch (Exception e) {System.out.println("error en "+ e);}//en caso de error mostrara este mensaje por consolda

            }
            
        } catch (Exception e) {System.out.println("error en "+ e);}//en caso de error mostrara este mensaje por consolda

    }     
    
    
    //metodo para limpiar los campos de texto
    private void limpiar_campos(){
        jframe_login.txt_documento.setText("");
        jframe_login.txt_contraseña.setText("");}
    
    

}

