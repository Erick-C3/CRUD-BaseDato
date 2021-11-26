/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelos.BaseDato;
import modelos.Jugador;
import modelos.JugadorCRUD;

/**
 *
 * @author Katsuo
 */
public class JugadorDAO implements JugadorCRUD {
    
    private static final String NOMBRE_TABLA = "jugadores";
    
    private Connection conexionBD;
    private PreparedStatement comandoPreparado;
    private ResultSet resultadoComando;
    
    // COMANDO para CRUD necesarios a usar con esta tabla
    
    private static final String COMANDO_INSERTAR_SQL = "INSERT INTO " + NOMBRE_TABLA + " (nombre, victorias, derrotas, empates) values(?,?,?,?)";
    private static final String COMANDO_OBTENER_SQL = "SELECT * FROM " + NOMBRE_TABLA;
    private static final String COMANDO_ACTUALIZAR_SQL = "UPDATE " + NOMBRE_TABLA + " SET"
            + " nombre = ?,"
            + " victorias = ?,"
            + " derrotas = ?,"
            + " empates = ?"
            + " WHERE nombre = ?";
    private static final String COMANDO_ELIMINAR_SQL = "DELETE FROM " + NOMBRE_TABLA + " WHERE nombre = ?";
    
    
    @Override
    public void insertarJugador(Jugador nuevoJugador) {        
        realizarConexion();                
        try {
            comandoPreparado = conexionBD.prepareStatement(COMANDO_INSERTAR_SQL);
            comandoPreparado.setString(1, nuevoJugador.comoTeLlamas());//reemplazo el  ? para el campo nombre     
            comandoPreparado.setInt(2, nuevoJugador.cuantasCopasTenes());
            comandoPreparado.setInt(3, nuevoJugador.cuantasDerrotasTenes());
            comandoPreparado.setInt(4, nuevoJugador.cuantosEmpatesTenes());
            
            comandoPreparado.executeUpdate();//realiza la creacion del registro en la tabla
            System.out.println("Jugador agregado a la tabla");
        } catch (SQLException ex) {
            System.out.println("Problema al insertar " + ex );
        }
        
        desconectarBaseDatoSinResultSet();
    }

    @Override
    public Jugador obtenerJugador(String conEsteNombre) {
        Jugador jugadorBuscado = new Jugador("jugador por defecto");// le damos a jugadorBuscado un objeto por defecto
        realizarConexion();// conexionBD obtiene la conexion de la BASE DE DATO
        boolean encontrado = false;
        
        try {
            comandoPreparado = conexionBD.prepareStatement(COMANDO_OBTENER_SQL);//preparar el comando con la conexion obtenida
            resultadoComando = comandoPreparado.executeQuery();
            
            while( resultadoComando.next() && !encontrado ){
                System.out.println("Entrando a leer el siguiente registro");
                if( resultadoComando.getString("nombre").equals(conEsteNombre)){
                    jugadorBuscado = new Jugador( //le damos a jugadorBuscado una instancia con los valores del registro buscado
                            resultadoComando.getString("nombre"),
                            resultadoComando.getInt("victorias"),
                            resultadoComando.getInt("derrotas"),
                            resultadoComando.getInt("empates")                  
                    );
                    encontrado = true;
                }
            }
            
        } catch (SQLException ex) {
            System.out.println("Algo malio sal " + ex );
        }
        
        desconectarBaseDato();
        
        return jugadorBuscado;
    }

    
    
    @Override
    public void actualizarJugador(Jugador conEstaInfo, String conEsteNombre) {
        realizarConexion();
                
        try {
            //preparo el comando para actualizar
            comandoPreparado = conexionBD.prepareStatement(COMANDO_ACTUALIZAR_SQL);
            comandoPreparado.setString(1, conEstaInfo.comoTeLlamas());
            comandoPreparado.setInt(2, conEstaInfo.cuantasCopasTenes());
            comandoPreparado.setInt(3, conEstaInfo.cuantasDerrotasTenes());
            comandoPreparado.setInt(4, conEstaInfo.cuantosEmpatesTenes());
            comandoPreparado.setString(5, conEsteNombre);// el nombre del jugador a actualizar
            //termino de preparar el comando para actualizar
            
            //ejecuto el comando para actualizar
            comandoPreparado.executeUpdate();
            System.out.println("Jugador actualizado");
            
            
        } catch (SQLException ex) {
            System.out.println("Algo salio mal al actualizar " + ex);
        }
        
        
        desconectarBaseDatoSinResultSet();
    }

    
    
    @Override
    public void darBajaJugador(Jugador jugadorDarBaja) {
        realizarConexion();
        
        try {
            comandoPreparado = conexionBD.prepareStatement(COMANDO_ELIMINAR_SQL);
            comandoPreparado.setString(1, jugadorDarBaja.comoTeLlamas());
            
            comandoPreparado.executeUpdate();
            System.out.println("Jugador " + jugadorDarBaja.comoTeLlamas()+" fue dado de baja");
            
        } catch (SQLException ex) {
            System.out.println("Error al eliminar el jugador " + jugadorDarBaja.comoTeLlamas());
        }
        
        desconectarBaseDatoSinResultSet();
    }

    /**
     * Obtiene la conexion a la base de dato y lo guarda en conexionBD
     */
    private void realizarConexion() {
        conexionBD = BaseDato.obtenerInstanciarBaseDato().conectarABaseDato();
    }

    private void desconectarBaseDato() {
        BaseDato.obtenerInstanciarBaseDato().desconectarDB(conexionBD, comandoPreparado, resultadoComando);
    }

    private void desconectarBaseDatoSinResultSet() {
        BaseDato.obtenerInstanciarBaseDato().desconectarDB(conexionBD, comandoPreparado);
    }
    
    
    
    
}
