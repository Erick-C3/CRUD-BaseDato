/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Katsuo
 */
public class Jugador {
    private String nombre;
    private int victorias;
    private int derrotas;
    private int empates;

    public Jugador(String nombre, int victorias, int derrotas, int empates) {
        this.nombre = nombre;
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String comoTeLlamas() {
       return nombre;
    }

    public int cuantasCopasTenes() {
        return victorias;
    }

    public int cuantasDerrotasTenes() {
        return derrotas;
    }

    public int cuantosEmpatesTenes() {
        return empates;
    }
}
