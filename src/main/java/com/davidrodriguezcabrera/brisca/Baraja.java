package com.davidrodriguezcabrera.brisca;

import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Baraja {

    Carta[] barajaEspanola = new Carta[20];
    Carta[] cartasJ1 = new Carta[7];
    Carta[] cartasJ2 = new Carta[7];
    int posCartaACoger;
    int numCartas;
    int posCartaACogerJ1;
    int posCartaACogerJ2;
        //Image asEspadas = new Image(getClass().getResourceAsStream("/images/as_espadas.jpg"));
        //ImageView asEspadasView = new ImageView(asEspadas);
        
    public Baraja(){
        //ESPADAS   

    barajaEspanola[0] = new Carta(1, "Espada", 11);
    //barajaEspanola[0].imagen=(asEspadasView);
   //paneRoot.getChildren().add(asEspadasView);
    barajaEspanola[1] = new Carta(3, "Espada", 10);
   
    barajaEspanola[2] = new Carta(10, "Espada", 2);
  
    barajaEspanola[3] = new Carta(11, "Espada", 3);
    
    barajaEspanola[4] = new Carta(12, "Espada", 4);
    
        
        //BASTOS
    barajaEspanola[5] = new Carta(1, "Basto", 11);
    
    barajaEspanola[6] = new Carta(3, "Basto", 10);
    
    barajaEspanola[7] = new Carta(10, "Basto", 2);
    
    barajaEspanola[8] = new Carta(11, "Basto", 3);
    
    barajaEspanola[9] = new Carta(12, "Basto", 4);
    
        //ORO
    barajaEspanola[10] = new Carta(1, "Oro", 11);
    
    barajaEspanola[11] = new Carta(3, "Oro", 10);
    
    barajaEspanola[12] = new Carta(10, "Oro", 2);
    
    barajaEspanola[13] = new Carta(11, "Oro", 3);
    
    barajaEspanola[14] = new Carta(12, "Oro", 4);
    
        //COPA
    barajaEspanola[15] = new Carta(1, "Copa", 11);
    
    barajaEspanola[16] = new Carta(3, "Copa", 10);
    
    barajaEspanola[17] = new Carta(10, "Copa", 2);
    
    barajaEspanola[18] = new Carta(11, "Copa", 3);
    
    barajaEspanola[19] = new Carta(12, "Copa", 4);
    
    }
    
    public void barajarCartas(){
        
        for(int x=0; x<100; x++){
        int pos1 = getCartaAleatoria(0, 19);
        int pos2 = getCartaAleatoria(0, 19);
        Carta carta1 = barajaEspanola[pos1];
        Carta carta2 = barajaEspanola[pos2];
        barajaEspanola[pos1] = carta2;
        barajaEspanola[pos2] = carta1; 
    }
    }
    //MOTRAR CARTAS POR CONSOLA
    public void mostrarBaraja(){
        for(int x=0; x<20; x++){
        System.out.println(barajaEspanola[x].numero + " " + barajaEspanola[x].palo + " = " + barajaEspanola[x].puntos + " puntos");
        
        }
        System.out.println("");
    }
    
    public Carta cogerCarta(){
        numCartas = posCartaACoger;
        //System.out.println(posCartaACoger);
        Carta cartaCogida = barajaEspanola[posCartaACoger];
        posCartaACoger += 1;
        
        //System.out.println(numCartas);
        return cartaCogida;
        
        //System.out.println(barajaEspanola[numCartas].numero + " " + barajaEspanola[numCartas].palo + " = " + barajaEspanola[numCartas].puntos + " puntos");
    }
    
    public void jugador1(){
        
        
        //Carta cogerUnaCarta;
        Carta cogerUnaCarta = cogerCarta();
        //cogerCarta();
        
        cartasJ1[posCartaACogerJ1] = cogerUnaCarta;
        //Carta cartaCogidaJ1 = cartasJ1[posCartaACoger];
        
        //System.out.println(barajaEspanola[numCartas].numero + " " + barajaEspanola[numCartas].palo + " = " + barajaEspanola[numCartas].puntos + " puntos");
         System.out.println(cartasJ1[posCartaACogerJ1].numero + " " + cartasJ1[posCartaACogerJ1].palo + " = " + cartasJ1[posCartaACogerJ1].puntos + " puntos");
         
         //return cogerUnaCarta;
    }
    
   /*public void mostrarJ1(){
        for(int x=0; x<7; x++){
        System.out.println("");
   System.out.println(cartasJ1[posCartaACogerJ1].numero + " " + cartasJ1[posCartaACogerJ1].palo + " = " + cartasJ1[posCartaACogerJ1].puntos + " puntos");
               }
    }*/
    public void jugador2(){
        
        //Carta cogerUnaCarta;
        Carta cogerUnaCarta = cogerCarta();
        //cogerCarta();
        
        cartasJ2[posCartaACogerJ2] = cogerUnaCarta;
        //Carta cartaCogidaJ1 = cartasJ1[posCartaACoger];
        
        //System.out.println(barajaEspanola[numCartas].numero + " " + barajaEspanola[numCartas].palo + " = " + barajaEspanola[numCartas].puntos + " puntos");
         System.out.println(cartasJ2[posCartaACogerJ2].numero + " " + cartasJ2[posCartaACogerJ2].palo + " = " + cartasJ2[posCartaACogerJ2].puntos + " puntos");
        
    }
    
    /*public Carta posCartas(int posx){
        //numCartas = posx;
        //try {            
        
         Carta cartaCogidaPantalla = cogerCarta();
        //cogerCarta();
        
        barajaEspanola[posx] = cartaCogidaPantalla;
        //System.out.println(barajaEspanola[posx].numero + " " + barajaEspanola[posx].palo + " = " + barajaEspanola[posx].puntos + " largarto");
            return cartaCogidaPantalla;
        //} //catch(Exception ex) {
            //System.out.println(ex.getMessage());
            //return -1;
        //}
    }*/
    
    
    public int getCartaAleatoria(int min, int max) {
        Random random = new Random();
        int num = random.nextInt(max-min+1) + min;
        return num;
    }

    

    
    

}  
