package CONEXION;
import java.sql.*;//importo todas las librerias de sql
public class conexion {
    public Connection cn;
    //creo ete metodo
    public Connection conexion(){
        //pongo las direcciones pertinentes de donde se hubica mi base de datos y con que privilegeos quiero ingresar
        String usuario="root";
        String clave="";
        String url="jdbc:mysql://localhost:3306/db";
        //hago un try cath para manejga la conexion
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//con el class forname llamo la driver 
            cn=DriverManager.getConnection(url,usuario,clave);
            System.out.println("copnectada correctamente");//si todo estuvo ok se mostrara este mensaje por consola
        } catch (Exception e) {
            System.out.println("error en conexion " + e); //si algo anda mal con la conexion mostra este mensaje por consola
        }
        return cn;//aqui retornamos la conexion
    } 
 } 

