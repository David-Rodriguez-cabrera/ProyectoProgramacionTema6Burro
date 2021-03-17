/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davidrodriguezcabrera.brisca;

import java.util.Arrays;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


/**
 *
 * @author 1DAW06
 */
public class CartasJ1View extends GridPane{
    Baraja mazo;
    final int TAM_X = 130;
    final int TAM_Y = 40;
    String strNumJ1;
    Label labelJ1 = new Label();
    Carta numCartasPantalla;
    Label labelJ1Vacio = new Label("Vacio");
    Carta vacio = new Carta(0, "KPASA", 0);
    HBox hboxCartaPersonajeJugador;
    int colClic;
    int contador = 7;
    int calcularContador = 1;
    public CartasJ1View(Baraja mazo) {  
        this.mazo = mazo;
        //this.mazo.jugador1();
       
       this.setStyle("-fx-grid-lines-visible: true; -fx-background-color : white");
        for(int x=0; x<7; x++){
           
        numCartasPantalla = mazo.cogerCarta();
        mazo.cartasJ1[x] = numCartasPantalla;
        
        strNumJ1 = String.valueOf(numCartasPantalla.numero + " " + numCartasPantalla.palo + " = " + numCartasPantalla.puntos + " puntos");
        labelJ1 = new Label(strNumJ1);
        labelJ1.setPrefWidth(TAM_X);
        labelJ1Vacio.setPrefWidth(TAM_X);
        this.add(labelJ1, x, 0);
        
       }
        this.mouseController();
        //this.mostrarJ1();
    }
    public void mouseController() {
        
        this.setOnMouseClicked((MouseEvent mouseEvent) -> {
            System.out.println("X: " + mouseEvent.getX() + ", Y: "+ mouseEvent.getY() );
            colClic = (int)(mouseEvent.getX() / TAM_X);
            System.out.println("Col: " + colClic);
            //System.out.println(mazo.posCartaACogerJ1);
            //Carta num = mazo.cartasJ1[colClic];
            //System.out.println(num.numero + " " + num.palo + " = " + num.puntos + " puntos");
            //strNumJ1 = num;
            //this.getChildren().get(colClic).setVisible(false);
            this.getChildren().remove(colClic);
            mazo.cartasJ1[colClic] = null;
            
            contador = contador-calcularContador;
            System.out.println(contador);
            //System.arraycopy(this.mazo.cartasJ1,  colClic, this.mazo.cartasJ1, colClic, 1);
            //mazo.cartasJ1.remove(colClic);
            //System.arraycopy(arrayObjetos, i + 1, objeto,i, arrayObjetos.length - 1 - i);
      //return arrayObjetos; 
                
      if (mazo.cartasJ1[colClic] != null){
          for(int x=0; x<7; x++){
            System.out.println("");
            System.out.print(mazo.cartasJ1[x].numero + " " + mazo.cartasJ1[x].palo + " = " + mazo.cartasJ1[x].puntos + " puntos");
            //this.add(labelJ1Vacio, colClic, 0);
            }
      }else{
          
            System.out.println("No se puede imprimir");
            
            //this.add(labelJ1Vacio, colClic, 0);
            
      }
      
          
            
            //numCartasPantalla = num;
            //labelJ1.setVisible(false);
             //System.out.println(labelJ1);
            //System.out.println(mazo.cartasJ1[colClic].numero + " " + mazo.cartasJ1[colClic].palo + " = " + mazo.cartasJ1[colClic].puntos + " puntos");
            //System.out.println(colClic + "colClic");
        });
    }
    
    /*public void mostrarCartaJugador(){
        
        hboxCartaPersonajeJugador = new HBox();
        hboxCartaPersonajeJugador.setMaxWidth(300*300);
        hboxCartaPersonajeJugador.setMaxHeight(300*300);
        hboxCartaPersonajeJugador.setMinWidth(50);
        hboxCartaPersonajeJugador.setMinHeight(50);
        hboxCartaPersonajeJugador.setAlignment(Pos.BOTTOM_CENTER);
        hboxCartaPersonajeJugador.setSpacing(150);
        hboxCartaPersonajeJugador.setStyle("-fx-border-color: white");
        hboxCartaPersonajeJugador.getChildren().add(this);
        this.getChildren().add(hboxCartaPersonajeJugador);
        imagenes vista1 = new imagenes(mazo);
        hboxCartaPersonajeJugador.getChildren().add(vista1);
    }*/
    
    public void mostrarJ1(){
        for(int x=0; x<7; x++){
            if (mazo.cartasJ1[x] != null){
        System.out.println("");
               
    System.out.println(mazo.cartasJ1[x].numero + " " + mazo.cartasJ1[x].palo + " = " + mazo.cartasJ1[x].puntos + " puntos");
               }
            else{
                System.out.println("No hay cartas en la posicion " + x);
            }
        }
}
    
}