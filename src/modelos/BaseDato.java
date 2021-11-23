/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * Tenemos que agregar SOLO lo necesario para manejar la conexion con la base de datos
 * 
 *  IMPORTANTE
 * - Cada vez que establecemos la conexion y operamos los comandos en SQL, una vez finalizado, tenemos que cerrar la conexion
 *
 * @author Katsuo
 */
public class BaseDato {    
    
    private static BaseDato instanciaBaseDato = null;//inicialmente la base dato no esta conectada
    
    private static final String USUARIO = "root";//nombre del usuario en su equipo
    private static final String CONTRASENIA = "";//contrasenia del usuario que ingresamos arriba
    private static final String BASE_DATO = "juego";//nombre de la base de datos a usar
    private static final String URL = "jdbc:mysql://localhost/"+BASE_DATO+"?autoReconnect=true&useSSL=false";//la direccion para la conexion a la base de datos
    
    
    
    
    
    /**
     * Solo se llama al constructor en caso de que no se haya asignado nada a instanciaBaseDato
     * - Si no se creo un objeto de Base Dato entonces  se usa el constructor
     */
    private BaseDato(){
        
    }
   
    
    
    /**
     * Devuelve la instancia la Base Dato y la crea en caso de no existir
     * -IMPORTANTE- Nos aseguramos de que no exista más de una instancia de esta clase
     * @return 
     */
    public static BaseDato obtenerInstanciarBaseDato(){
        if(instanciaBaseDato == null){
            instanciaBaseDato = new BaseDato();
        }
        return instanciaBaseDato;
    }
    
    
    
    /**
     * Realiza la conexion a la Base Datos con las credenciales proporcionadas en esta clase
     * @return la conexion a la Base Datos
     */
    public Connection  conectarABaseDato(){        
        Connection conexionBaseDato = null;
        try {//intenta conectarte a la base de datos
            conexionBaseDato = DriverManager.getConnection(URL, USUARIO, CONTRASENIA);
            System.out.println("Conexion correcta a la base de datos");        
        } catch (SQLException ex) {// y si sale mal, acá lo manejamos
            System.out.println("Algo malio sal"+ ex);
        }
        return conexionBaseDato;
    }
    
    public void desconectarDB(){
        //los pasos para desconectar correctamente la Base de dato
        System.out.println("Base de dato desconectada");
    }

    
    /**
     * Desconecta la base de dato para insertar
     * @param conexionBD la conexion a la base de dato obtenida previamente
     * @param comandoPreparado usado durante la conexion actual
     */
    public void desconectarDB(Connection conexionBD, PreparedStatement comandoPreparado) {
        
        try{
            comandoPreparado.close();
        }catch(SQLException ex){
            System.out.println("Fallo al cerrar el comando preparado");
        }finally{
            try{
                conexionBD.close();
            }catch(SQLException ex){
                System.out.println("Fallo al cerrar la conexionBD");
            }
        }
        System.out.println("Desconecto la base de dato luego de insertar");
    }
}
