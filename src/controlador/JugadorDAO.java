/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        desconectarBaseDatoLuegoDeInsertar();
    }

    @Override
    public Jugador obtenerJugador(String conEsteNombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarJugador(Jugador conEstaInfo, String conEsteNombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void darBajaJugador(Jugador jugadorDarBaja) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Obtiene la conexion a la base de dato y lo guarda en conexionBD
     */
    private void realizarConexion() {
        conexionBD = BaseDato.obtenerInstanciarBaseDato().conectarABaseDato();
    }

    private void desconectarBaseDato() {
        BaseDato.obtenerInstanciarBaseDato().desconectarDB();
    }

    private void desconectarBaseDatoLuegoDeInsertar() {
        BaseDato.obtenerInstanciarBaseDato().desconectarDB(conexionBD, comandoPreparado);
    }
    
    
    
    
}
