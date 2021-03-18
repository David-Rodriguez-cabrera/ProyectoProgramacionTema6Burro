package com.davidrodriguezcabrera.brisca;

import java.net.URISyntaxException;
import java.net.URL;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;

/**
 * JavaFX App
 */
public class App extends Application {
    //TIPO DE PANEL
BorderPane paneRoot = new BorderPane();
    //MUSICA FONDO
AudioClip musicaFondo;

        
    @Override
    public void start(Stage stage) {
        //ESCENA
        var scene = new Scene(paneRoot, 900, 600);
        stage.setScene(scene);
        stage.show();
        //FONDO ESCENA
        paneRoot.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        //TITULO ESCENA
        stage.setTitle("Burro");
        
        //INICIR OBJETO BARAJA CON EL NOMBRE MAZO
        Baraja mazo = new Baraja();
        //BARAJAR CARTAS
        mazo.barajarCartas();
        //MOSTRAR BARAJA ENTERA
        mazo.mostrarBaraja();
     
        //INICIR OBJETO CartasJ1View CON EL NOMBRE cartasJ1View 
        CartasJ1View cartasJ1View = new CartasJ1View(mazo);
        //PONER LAS CARTAS DE J1 ABAJO DE LA ESCENA
        paneRoot.setBottom(cartasJ1View);
        
        //INICIR OBJETO CartasJ2View CON EL NOMBRE cartasJ2View 
        CartasJ2View cartasJ2View = new CartasJ2View(mazo);
        //PONER LAS CARTAS DE J2 ARRIBA DE LA ESCENA
        paneRoot.setTop(cartasJ2View);
        
        //INICIR OBJETO Botones CON EL NOMBRE botones PARA ROBAR CARTAS
        Botones botones = new Botones(mazo, cartasJ1View);
        //PONER BOTON PARA ROBAR CARTAS A LA DERECHA DE LA ESCENA
        paneRoot.setRight(botones.button);
        
        //SONIDO FONDO JUEGO
        URL urlmusicaFondo = getClass().getResource("/audio/MusicaFondo.mp3");
        if(urlmusicaFondo != null) {
            try {
                musicaFondo = new AudioClip(urlmusicaFondo.toURI().toString());
                musicaFondo.play();
            } catch (URISyntaxException ex) {
            }            
        } else {
        System.out.println("No se ha encontrado el archivo de audio");
        }
        
        
    }
    
    public static void main(String[] args) {
        launch();
    }

}