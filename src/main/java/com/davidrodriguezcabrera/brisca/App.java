package com.davidrodriguezcabrera.brisca;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

/**
 * JavaFX App
 */
public class App extends Application {
BorderPane paneRoot = new BorderPane();
BorderPane borderPane = new BorderPane();
//HBox pane1 = new HBox();
//HBox pane2 = new HBox();
//StackPane pane3 = new StackPane();
//StackPane pane4 = new StackPane();
//StackPane pane5 = new StackPane();

        
    @Override
    public void start(Stage stage) {
        //Pane paneRoot = new Pane();
        //var scene = new Scene(paneRoot, 640, 480);
        //stage.setScene(scene);
        //stage.show();
        
                
        var scene = new Scene(paneRoot, 900, 600);
        stage.setScene(scene);
        stage.show();
        
       paneRoot.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));

        this.rellenarPaneles();
        
        stage.setTitle("Burro");
        rellenarBorderPane();
       
        Baraja mazo = new Baraja();
        //GridPane barajaGridPane = new GridPane();
        
        //Label label = new Label("5");
        //barajaView.add(label, 0, 0);
        mazo.barajarCartas();
        mazo.mostrarBaraja();
        //mazo.jugador1();
        //BarajaView barajaView = new BarajaView(mazo);
        //paneRoot.setCenter(barajaView);
        CartasJ1View cartasJ1View = new CartasJ1View(mazo);
        paneRoot.setBottom(cartasJ1View);
        //mazo.mostrarJ1();
        CartasJ2View cartasJ2View = new CartasJ2View(mazo);
        paneRoot.setTop(cartasJ2View);
        
        Botones botones = new Botones(mazo);
        paneRoot.setRight(botones.button);
        
        //mazo.jugador2();
        //mazo.jugador2();
        //mazo.cogerCarta();
        //mazo.cogerCarta();
        //mazo.cogerCarta();
        
        
        
        
        
        //paneRoot.setCenter(fondoView);
    }
    
    /*public void mostrarNum(int barajaEspanola) {
        if(barajaEspanola != -1) {
            System.out.println(barajaEspanola);
        } else {
            System.out.println("La posición es incorrecta");
        }
    }*/
                    
    
     public void rellenarPaneles() {
            
        //pane1.setStyle("-fx-border-color: red; -fx-border-insets: 2px; -fx-border-width:2px");
        //pane1.getChildren().add(new Label("Zona 1"));
        
        //pane2.setStyle("-fx-border-color: green; -fx-border-insets: 2px; -fx-border-width:2px");
        //pane2.getChildren().add(new Label("Zona 2"));

        //pane3.setStyle("-fx-border-color: blue; -fx-border-insets: 2px; -fx-border-width:2px");
        //pane3.getChildren().add(new Label("Zona 3"));
        
        //pane4.setStyle("-fx-border-color: orange; -fx-border-insets: 2px; -fx-border-width:2px");
        //pane4.getChildren().add(new Label("Zona 4"));
        
        //pane5.setStyle("-fx-border-color: purple; -fx-border-insets: 2px; -fx-border-width:2px");
        //pane5.getChildren().add(new Label("Zona 5"));
        
    }
    public void rellenarBorderPane() {
        /*borderPane.setCenter(pane1);
        borderPane.setTop(pane2);
        borderPane.setRight(pane3);
        borderPane.setBottom(pane4);*/
        //borderPane.setLeft(pane5);        
        //paneRoot.getChildren().clear();
        //paneRoot.setCenter(pane1);
        //paneRoot.setTop(pane2);
        //paneRoot.setRight(pane3);
        //paneRoot.setBottom(pane4);
        
    }
        
    

    public static void main(String[] args) {
        launch();
    }

}