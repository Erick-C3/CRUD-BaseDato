/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crud.c3;

import controlador.JugadorDAO;
import modelos.BaseDato;
import modelos.Jugador;

/**
 *
 * @author Katsuo
 */
public class CrudC3 {

    /**
     * 
     * Proyecto para entender CRUD
     * - Insertar / Crear
     * - Obtener / leer
     * - Actualizar
     * - Eliminar
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JugadorDAO controladorJugador = new JugadorDAO();
        
        controladorJugador.insertarJugador(new Jugador("Erick", 1,3,2));
    }
    
}
