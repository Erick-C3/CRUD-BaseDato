/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos;

/**
 *
 * @author Katsuo
 */
public interface JugadorCRUD {
    
    /**
     * agrega un nuevo jugador a la tabla de jugadores
     * @param nuevoJugador 
     */
    public void insertarJugador(Jugador nuevoJugador);
    
    /**
     * Obtiene un jugador de la tabla de jugadores
     * @param conEsteNombre para buscar al jugador en la tabla
     * @return el jugador buscado si existe, sino devuelve jugador nulo por defecto
     */
    public Jugador obtenerJugador(String conEsteNombre);
    
    /**
     * Actualiza informacion del jugador correspondiente al nombre recibido
     * @param conEstaInfo para actualizar la informacion del jugador en la tabla
     * @param conEsteNombre del jugador a actualizar
     */
    public void actualizarJugador(Jugador conEstaInfo, String conEsteNombre);
    
    
    /**
     * Eliminar un registro jugador de la tabla segun el criterio que corresponda
     * @param jugadorDarBaja informacion para el criterio al eliminar en la tabla
     */
    public void darBajaJugador(Jugador jugadorDarBaja);
}
