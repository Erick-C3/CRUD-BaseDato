/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Katsuo
 * Created: 23-nov-2021
 */

/*Solamente deberia usarlo cuando quiero reiniciar la base de dato a lo establecido por defecto en este archivo*/
DROP DATABASE IF EXISTS juego; /*Si existe la base de dato juego entonces lo elimina*/

CREATE DATABASE juego;

USE juego;

CREATE TABLE jugadores(
    id_jugador INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(30) NOT NULL,
    victorias INT DEFAULT 0,
    derrotas INT DEFAULT 0,
    empates INT DEFAULT 0,
    PRIMARY KEY (id_jugador)
);