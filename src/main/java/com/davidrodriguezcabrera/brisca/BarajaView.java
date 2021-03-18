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
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;



public class BarajaView extends GridPane {
    
    // METODO CONSTRUCTOR PARA MOSTRAR LA BARAJA COMPLETA POR PANTALLA
    public BarajaView(Baraja mazo) {  
       for(int y=0; y<1; y++){
        for(int x=0; x<10; x++){
        Carta numCartasPantalla = mazo.cogerCarta();
        String strNum = String.valueOf(numCartasPantalla.numero + " " + numCartasPantalla.palo + " = " + numCartasPantalla.puntos + " puntos      ");
        Label labelBaraja = new Label(strNum);
        this.add(labelBaraja, x, y);
        System.out.println(x);
        }
       }
    }
}
