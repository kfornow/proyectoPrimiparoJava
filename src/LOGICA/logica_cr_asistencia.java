
package LOGICA;

import CONEXION.conexion;
import VISTAS.CRUD_INSTRUCTOR.jframe_asisten_cr_instr;
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*Absolutamente toda la logica las hize declarando partes del  jframe como publicas para hacer la logica desde aqui mas 
comodamente  y evitar la acumulacion de codigo el cual puede ser inlegible en algunos casos */

/*en este caso declare partes publicas del jframe_asisten_cr_instr */




public class logica_cr_asistencia {

    conexion con = new conexion ();//objecto para la conexion
    Connection cn = con.conexion();


    
    
    // con este metodo buscar lo que hago es hacer consultas para mostrarlas en la tabla del jframe
    public void buscar() {
 
        DefaultTableModel modelo =  (DefaultTableModel) jframe_asisten_cr_instr.tabla.getModel();//creo un modelo para poder interactuar con mi jtable 
        //con este while cuento y remueo la fila 0 para no sobreponer resultados uno encima de otro
        while (modelo.getRowCount()>0) {modelo.removeRow(0);}
        //con este condicional le digo que si la caja de texto en el jframe esta vacia hare una consulta la cual me traera todos los datos de x persona
        if (jframe_asisten_cr_instr.txt_buscar.getText().equals("")) {
            
            int columnas;//declaro una varible de tipo entera que usare mas adelante para contar la columna que tenga la consulta
            try {
                //preparo la consulta
                PreparedStatement ps=cn.prepareStatement("SELECT * FROM asistencia_instructor");
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
            catch (SQLException e) {System.out.println("error en " + e);} //si hay un error lo muestro por consola 
        }
            

        else  {
            int columnas; //declaro otra varible de tipo entera que usare mas adelante para contar la columna que tenga la consulta 
        
            try {
                //hago la consulta
                //tomando lo que el usuario escribio por la caja de texto para los resultados buscados mostrandolos si los encuentra
                String sql ="SELECT id_asisten, cc_instruc_fk, fecha_inicio,hora_inicio ,fecha_fin ,hora_fin ,estado_asistencia "
                + " FROM asistencia_instructor where ("
                +"  id_asisten           LIKE '"+jframe_asisten_cr_instr.txt_buscar.getText()+"%' OR "
                +"  cc_instruc_fk        LIKE '"+jframe_asisten_cr_instr.txt_buscar.getText()+"%' OR "
                +"  fecha_inicio         LIKE '"+jframe_asisten_cr_instr.txt_buscar.getText()+"%' OR "
                +"  hora_inicio          LIKE '"+jframe_asisten_cr_instr.txt_buscar.getText()+"%' OR "
                +"  fecha_fin            LIKE '"+jframe_asisten_cr_instr.txt_buscar.getText()+"%' OR "
                +"  hora_fin             LIKE '"+jframe_asisten_cr_instr.txt_buscar.getText()+"%' OR "
                +"  estado_asistencia    LIKE '"+jframe_asisten_cr_instr.txt_buscar.getText()+"%'"
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
            } catch (SQLException e) {System.out.println("error en " + e);}}//si hay un error lo muestro por consola
            }
    
    
 }
    

    
    
    
    
