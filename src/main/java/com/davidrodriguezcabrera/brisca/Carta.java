/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davidrodriguezcabrera.brisca;
/**
 *
 * @author 1DAW06
 */
public class Carta {
    //VARIABLE PARA EL NUMERO DE LA CARTA
    int numero;
    //VARIABLE PARA EL PALO DE LA CARTA
    String palo;
    //VARIABLE PARA LOS PUNTOS DE LA CARTA
    int puntos;
  
    // METODO CONSTRUCTOR PARA CREAR UNA CARTA
public Carta (int numero, String palo, int puntos){
        
        this.numero = numero;
        this.palo = palo;
        this.puntos = puntos;
       
    }
}

