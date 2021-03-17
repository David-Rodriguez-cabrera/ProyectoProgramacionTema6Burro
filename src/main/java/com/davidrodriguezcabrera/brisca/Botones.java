/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davidrodriguezcabrera.brisca;

import java.net.URISyntaxException;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;

/**
 *
 * @author 1DAW06
 */
public class Botones {
   int contadorPosCarta;
   AudioClip musicaRobarCarta;
//Image imageOk = new Image(getClass().getResourceAsStream("baraja.png"));
Button button = new Button("Robar");
    //Button button = new Button("Robar", new ImageView(imageOk));
    public Botones(Baraja mazo, CartasJ1View cartasJ1View){
        //this.cartasJ1View = cartasJ1View;
        button.setScaleX(2);
        button.setScaleY(2);
        //button.setAlignment(Pos.BOTTOM_CENTER);
        button.setTranslateX(-100);
        button.setTranslateY(300);
//A button with an empty text caption.
//Button button1 = new Button();
//A button with the specified text caption.
//Button button2 = new Button("Accept");
//A button with the specified text caption and icon.
//this.botonesController();
button.setOnAction (new EventHandler <ActionEvent> () { 
    @Override 
    public void handle (ActionEvent e) {
        
        System.out.println("holaMundo");
       
        if (mazo.cartasJ1[cartasJ1View.colClic] == null && mazo.posCartaACoger<20){
            
            //SONIDO TIRA CARTA
        URL urlmusicaFondo = getClass().getResource("/audio/cuckoo.wav");
        if(urlmusicaFondo != null) {
            try {
                musicaRobarCarta = new AudioClip(urlmusicaFondo.toURI().toString());
                musicaRobarCarta.play();
            } catch (URISyntaxException ex) {
            }            
        } else {
        System.out.println("No se ha encontrado el archivo de audio");
        }
        
            cartasJ1View.numCartasPantalla = mazo.cogerCarta();
            System.out.println(mazo.posCartaACoger);
        mazo.cartasJ1[cartasJ1View.colClic] = cartasJ1View.numCartasPantalla;
       cartasJ1View.strNumJ1 = String.valueOf(cartasJ1View.numCartasPantalla.numero + " " + cartasJ1View.numCartasPantalla.palo + " = " + cartasJ1View.numCartasPantalla.puntos + " puntos");
        cartasJ1View.labelJ1 = new Label(cartasJ1View.strNumJ1);
        cartasJ1View.labelJ1.setPrefWidth(cartasJ1View.TAM_X);
        System.out.println(contadorPosCarta);
        contadorPosCarta= cartasJ1View.contador + cartasJ1View.calcularContador;
        cartasJ1View.add(cartasJ1View.labelJ1, contadorPosCarta, 0);
        
            System.out.println(contadorPosCarta);
        //mazo.cogerCarta();
        }else{
            System.out.println("No quedan cartas en la baraja o no puedes robar mas cartas");
        }
        
    }

});

        
}

    
}


