/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davidrodriguezcabrera.brisca;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author 1DAW06
 */
public class Imagenes extends VBox{
     
    public Imagenes(Baraja mazo){
    Image asEspadas = new Image(getClass().getResourceAsStream("/images/as_espadas.jpg"));
        ImageView asEspadasView = new ImageView(asEspadas);
        this.getChildren().add(asEspadasView);
        asEspadasView.setImage(asEspadas);
        //this.setMinWidth(50);
        //this.setMinHeight(80);
        this.setAlignment(Pos.CENTER);
    }
}
