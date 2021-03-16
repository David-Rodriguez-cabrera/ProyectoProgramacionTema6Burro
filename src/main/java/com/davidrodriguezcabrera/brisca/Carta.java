/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davidrodriguezcabrera.brisca;

//import java.util.Random;

import javafx.scene.image.ImageView;



/**
 *
 * @author 1DAW06
 */
public class Carta {
    int numero;
    String palo;
    int puntos;
    //ImageView imagen;

public Carta (int numero, String palo, int puntos){
        
        this.numero = numero;
        this.palo = palo;
        this.puntos = puntos;
        //this.imagen = imagen;
    }

/*public int getCartaAleatoria(int min, int max) {
        Random random = new Random();
        int num = random.nextInt(max-min+1) + min;
        return num;
    }*/

}

