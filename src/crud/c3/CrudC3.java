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
        
        //controladorJugador.insertarJugador(new Jugador("bob", 1,1,1));//agrega un nuevo jugador a tabla
        /*Jugador jugadorEncontrado = controladorJugador.obtenerJugador("Claudio");
        System.out.println(jugadorEncontrado.comoTeLlamas());
        System.out.println(jugadorEncontrado.cuantasCopasTenes());// 1
        System.out.println(jugadorEncontrado.cuantasDerrotasTenes());// 3
        System.out.println(jugadorEncontrado.cuantosEmpatesTenes());// 2*/
        
        //controladorJugador.actualizarJugador(new Jugador("Katsuo", 4,2,5), "Erick");
        
        /*Jugador jugadorEncontrado = controladorJugador.obtenerJugador("bob");
        System.out.println(jugadorEncontrado.comoTeLlamas());
        System.out.println(jugadorEncontrado.cuantasCopasTenes());// 1
        System.out.println(jugadorEncontrado.cuantasDerrotasTenes());// 3
        System.out.println(jugadorEncontrado.cuantosEmpatesTenes());// 2*/
        controladorJugador.darBajaJugador(new Jugador("Katsuo"));
    }
    
}
