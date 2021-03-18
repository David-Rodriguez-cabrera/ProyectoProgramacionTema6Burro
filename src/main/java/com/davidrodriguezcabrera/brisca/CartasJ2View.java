/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davidrodriguezcabrera.brisca;

import java.net.URISyntaxException;
import java.net.URL;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.media.AudioClip;
/**
 *
 * @author 1DAW06
 */
public class CartasJ2View extends GridPane{
    Baraja mazo;
    // VARIABLE PARA PONER UN TAMAÑO X A LAS CARTAS
    final int TAM_X = 130;
    // VARIABLE  PARA PONER UN TAMAÑO Y A LAS CARTAS
    final int TAM_Y = 40;
    // VARIABLE STRING PARA DECIR LO QUE QUIERES MOSTRAR POR PANTALLA
    String strNumJ2;
    // VARIABLE DEL LABEL DE J2
    Label labelJ2 = new Label();
    // VARIABLE QUE DETERMINA EL NUMERO DE CARTAS POR PANTALLA
    Carta numCartasPantalla;
    // VARIABLE PARA CALCULAR DONDE DAMOS CLICK CON EL RATON
    int colClic;
    // MUSICA O SONIDO AL TIRAR UNA CARTA
    AudioClip musicaTirarCarta;
    
    // CREAR Y VER CARTAS DEL J2 POR PANTALLA
    public CartasJ2View(Baraja mazo) {  
        this.mazo = mazo;
        
       this.setStyle("-fx-grid-lines-visible: true; -fx-background-color : white");
        for(int x=0; x<7; x++){
           
        numCartasPantalla = mazo.cogerCarta();
        mazo.cartasJ2[x] = numCartasPantalla;
        
        strNumJ2 = String.valueOf(numCartasPantalla.numero + " " + numCartasPantalla.palo + " = " + numCartasPantalla.puntos + " puntos");
        labelJ2 = new Label(strNumJ2);
        labelJ2.setPrefWidth(TAM_X);
        labelJ2.setPrefHeight(TAM_Y);
        this.add(labelJ2, x, 0);
        
       }
        this.mouseController();
    }
    
    // METODO PARA DETECTAR PULSACIONES DEL RATO
    public void mouseController() {
        
        this.setOnMouseClicked((MouseEvent mouseEvent) -> {
            System.out.println("X: " + mouseEvent.getX() + ", Y: "+ mouseEvent.getY() );
            colClic = (int)(mouseEvent.getX() / TAM_X);
            System.out.println("Col: " + colClic);
            
            //SONIDO TIRA CARTA
        URL urlmusicaFondo = getClass().getResource("/audio/draw.wav");
        if(urlmusicaFondo != null) {
            try {
                musicaTirarCarta = new AudioClip(urlmusicaFondo.toURI().toString());
                musicaTirarCarta.play();
            } catch (URISyntaxException ex) {
            }            
        } else {
        System.out.println("No se ha encontrado el archivo de audio");
        }
          
            this.getChildren().remove(colClic);
            mazo.cartasJ2[colClic] = null;
            
                
      if (mazo.cartasJ2[colClic] != null){
          for(int x=0; x<7; x++){
            System.out.println("");
            System.out.print(mazo.cartasJ2[x].numero + " " + mazo.cartasJ2[x].palo + " = " + mazo.cartasJ2[x].puntos + " puntos");
            }
      }else{
          
            System.out.println("No se puede imprimir");  
      }
        });
    }
    
    public void mostrarJ2(){
        for(int x=0; x<7; x++){
            if (mazo.cartasJ2[x] != null){
               System.out.println("");
               System.out.println(mazo.cartasJ2[x].numero + " " + mazo.cartasJ2[x].palo + " = " + mazo.cartasJ2[x].puntos + " puntos");
               }
            else{
               System.out.println("No hay cartas en la posicion " + x);
            }
        }
}
    
}