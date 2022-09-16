
package LOGICA;

import javax.swing.table.DefaultTableModel;
import CONEXION.conexion;
import VISTAS.LOGIN.jframe_historico_asistencia;
import VISTAS.LOGIN.jframe_login;
import java.sql.*;
import javax.swing.JOptionPane;

/*Absolutamente toda la logica las hize declarando partes del  jframe como publicas para hacer la logica desde aqui mas 
comodamente  y evitar la acumulacion de codigo el cual puede ser inlegible en algunos casos */

/*en este caso declare partes publicas del jframe_historico_asistencia */
public class logica_jframe_historico_asistencia {
    
    
    
    conexion con = new conexion ();//objecto para la conexion
    Connection cn = con.conexion();
    
    
    
    //declaro este metodo buscar  el cual contedra la funcion de traerme toda la consultas que realizo ala tabla como tal
    public void buscar() { 
 
        DefaultTableModel modelo =  (DefaultTableModel) jframe_historico_asistencia.tabla.getModel();//creo un modelo para poder interactuar con mi jtable 
        
        
        //con este while cuento y remueo la fila 0 para no sobreponer resultados uno encima de otro
        while (modelo.getRowCount()>0) { modelo.removeRow(0);}
         
        //con este condicional le digo que si la caja de texto en el jframe esta vacia hare una consulta la cual me traera todos los datos de x persona
        if (jframe_historico_asistencia.txt_buscar.getText().equals("")) {
            
            int documento=Integer.parseInt(jframe_historico_asistencia.txt_documento.getText());//parceo el txt documento del jframe historico asistencia
            
            int columnas;//declaro una varible de tipo entera que usare mas adelante para contar la columna que tenga la consulta a traer
                
            
            try {
                //preparo la consulta
                PreparedStatement ps=cn.prepareStatement("SELECT cc_instruc_fk,fecha_inicio , hora_inicio ,fecha_fin , hora_fin, estado_asistencia FROM asistencia_instructor where cc_instruc_fk='"+documento+"'");
                ResultSet rs=ps.executeQuery();
                ResultSetMetaData rsmd=rs.getMetaData();//declaro resulsetmetada que me ayudara con la funcion de contar las columnas del arreglo
                columnas=rsmd.getColumnCount();//ala variable columnas antes mensionada le declaro lo que contendra que es el get column cout que como su abreviatura lo dice cuenta columnas
                
                //la recorro con un while
                while (rs.next()) {
                    //creo un objecto llamado filas y le paso lo la variable columnas 
                    Object[] filas=new Object[columnas];
                    //lo recorro con un for y a filas le agrego el indice de cada consulta 
                    //creando asi una matriz la cual añada filas y columnas dependiendo del volumen de datos a mostrar
                    for (int index=0 ; index<columnas;index++){filas[index]=rs.getObject(index + 1);}
                    modelo.addRow(filas);}//añado el objecto de tipo arreglo al modelo para traerme los resultados y mostrarlos
                }
                 catch (SQLException e) {System.out.println("error en  " + e);}  //si hay un error lo muestro por consola
            }
            

        //si la caja de texto de este jframe que es la caja llamada txt_buscar esta llena eso significa que hay una busqueda por lo que  hare contra consulta
        else  {
            int documento=Integer.parseInt(jframe_historico_asistencia.txt_documento.getText());//parceo el txt documento del jframe historico asistencia

            int columnas;
   
            try { 
                //hago la consulta
                //tomando lo que el usuario escribio por la caja de texto
                String sql ="SELECT  cc_instruc_fk, fecha_inicio, hora_inicio ,fecha_fin, hora_fin, estado_asistencia  FROM asistencia_instructor where cc_instruc_fk='"+documento+"'and ("
                +"  fecha_inicio       LIKE '"+jframe_historico_asistencia.txt_buscar.getText()+"%' OR "
                +"  hora_inicio        LIKE '"+jframe_historico_asistencia.txt_buscar.getText()+"%' OR "
                +"  fecha_fin          LIKE '"+jframe_historico_asistencia.txt_buscar.getText()+"%' OR "
                +"  hora_fin           LIKE '"+jframe_historico_asistencia.txt_buscar.getText()+"%' OR "
                +"  estado_asistencia  LIKE '"+jframe_historico_asistencia.txt_buscar.getText()+"%'"
                +")";

                 //preparo el estamento 
                Statement st =cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                ResultSetMetaData rsmd=rs.getMetaData();//declaro resulsetmetada que me ayudara con la funcion de contar las columnas del arreglo
                columnas=rsmd.getColumnCount();//y como hize antes le asigno ala variable columnas get column count el cual cuenta columans de lo que va hacer mi arreglo
                
                //lo recorro con un while

                while(rs.next()){
                    //creo un objecto llamado filas y le paso lo la variable columnas 
                    Object filas[]= new Object[columnas];
                    //lo recorro con un for y a filas le agrego el indice de cada consulta 
                    //creando asi una matriz la cual añada filas y columnas dependiendo del volumen de datos a mostrar
                    for (int index=0 ; index<columnas;index++){ filas[index]=rs.getObject(index +1);}
                    modelo.addRow(filas);//añado el objecto de tipo arreglo al modelo para traerme los resultados y mostrarlos
                }
            } catch (SQLException e) {System.out.println("error en " + e);}}//si hay un error lo muestro por consola
        
        }
    
    
    
    
    // con este metodo lo que hago es prepara una consulta despues de que el usuario digite sus credenciales en las caja txt documento y txt contraseña
    public void logeo_buscar(){
    
        boolean resultado1 = false;//declaracion de una variable boleana para manejar los condicionales de  la consulta 
        int documento =Integer.parseInt(jframe_historico_asistencia.txt_documento.getText());//parceo,del txt_documento que esta en el jframe_historico_asistencia

        try {
             /*cosulta haciendo uso del txt_documento y el estado  para verificar si el usuario se encuentra inactivo */
            String sql1="SELECT   cc_instruc , estado  from persona_instructor"
            +" where   estado='I'  and   cc_instruc='"+ documento+"'";
            Statement st1 =cn.createStatement();
            ResultSet rs1 = st1.executeQuery(sql1);

            //recoremos los resultados con un while
            while (rs1.next()){resultado1=true;}//se inicialisa la variable si encuentra resultados
            
            //si encuentra  algun usuario inactivo va a retornar el siguiente mensaje
            if (resultado1 ==true){JOptionPane.showMessageDialog(null,"!la persona se encuestra desactivada por el momento , por favor hable con el administrador del sistema¡");}
            
            
            
            if (resultado1 ==false ) {//si no encuentras el usuario ingresado como inactivo va a retornar la lineas de codigo dentro de este condicional
     
                try {
                    boolean resultado2 =false;//creo otra variable bolleana para poder manejar los condicionales de la otra consulta
                    String sql2="SELECT cc_instruc_fk ,contraseña from validacion_instructor where cc_instruc_fk='"+ documento+"' and contraseña='"+  jframe_historico_asistencia.txt_contraseña.getText()+"'";
                     /*esta consulta   lo que permite es la validacion de credenciales del instructor que se encuentra activo */
                   
                    Statement st2 =cn.createStatement();
                    ResultSet rs2 = st2.executeQuery(sql2);
                     
                      //recoremos los resultados con un while
                     while (rs2.next()) {resultado2=true;}//se inicialisa la variable si encuentra resultados
                     
                     
                     /*si la variable boleana se a inicialisado en true realisare dentro de este condicional otra consulta*/
                    if (resultado2==true) { 
                     
                        boolean resultado3= false;//creo otra variable boleana para manejar otra consulta 

                        //creo la consulta 
                        String sql3="Select cc_instruc_fk from asistencia_instructor where cc_instruc_fk='"+documento+"'";
                        Statement st3 =cn.createStatement();
                        ResultSet rs3 = st3.executeQuery(sql3);
                        //la recorro 
                        while (rs3.next()) {resultado3=true;}//y si se inicialisa significa que incontro resultados

                        //si incontro resultados traigo el metodo buscar 
                        if(resultado3==true){this.buscar();}

                        //si no  encuentro al usuario pero no encuentro ningun contenido de asistencia retornamo este mensaje
                        else{JOptionPane.showMessageDialog(null,"!!vaya parece que no hemos encontrado tu Historial de asistencia al centro");}

                    }
                     
                    else{JOptionPane.showMessageDialog(null, "!!las credenciales ingresadas no son correctas");}//si la credenciales no son correctas mandara este mensaje
                }
               catch (Exception e) {System.out.println("error " + e );}//si hay errores se imprimira este mensaje por consola     
            }
        } catch (Exception e) {System.out.println("error " + e);}//si hay errores se imprimira este mensaje por consola
    }
    
   
}
