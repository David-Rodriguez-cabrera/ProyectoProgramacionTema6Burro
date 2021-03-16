/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davidrodriguezcabrera.brisca;

import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author 1DAW06
 */
public class CartasJ2View extends GridPane{
    Baraja mazo;
    
final int TAM_X = 130;
    final int TAM_Y = 40;
    
    public CartasJ2View(Baraja mazo) {  
        this.mazo = mazo;
        //this.mazo.jugador2();
        
       this.setStyle("-fx-grid-lines-visible: true; -fx-background-color : white");
        for(int x=0; x<7; x++){
           
        Carta numCartasPantalla = mazo.cogerCarta();
        mazo.cartasJ2[x] = numCartasPantalla;
        String strNumJ2 = String.valueOf(numCartasPantalla.numero + " " + numCartasPantalla.palo + " = " + numCartasPantalla.puntos + " puntos      ");
        Label labelJ2 = new Label(strNumJ2);
        labelJ2.setPrefWidth(TAM_X);
        this.add(labelJ2, x, 0);
         
            
       }
        this.mouseController();
    }
    private void mouseController() {
        this.setOnMouseClicked((MouseEvent mouseEvent) -> {
            System.out.println("X: " + mouseEvent.getX() + ", Y: "+ mouseEvent.getY() );
            int colClic = (int)(mouseEvent.getX() / TAM_X);
            
            System.out.println("Col: " + colClic);
            Carta num = mazo.cartasJ2[colClic];
            System.out.println(num.numero + " " + num.palo + " = " + num.puntos + " puntos");
        });
    }
}
