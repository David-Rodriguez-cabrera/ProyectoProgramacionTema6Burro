/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davidrodriguezcabrera.brisca;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author 1DAW06
 */
public class Botones {
//Image imageOk = new Image(getClass().getResourceAsStream("baraja.png"));
Button button = new Button("Robar");
    //Button button = new Button("Robar", new ImageView(imageOk));
    public Botones(Baraja mazo){
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
        //mazo.cogerCarta();
         //Label labelbotton = new Label("Robar");
        //labelbotton.setText ("Robar"); 
    }

});
}


}
