package com.davidrodriguezcabrera.brisca;

import java.util.Random;

public class Baraja {
    //ARRAY BARAJA ESPAÑOLA
    Carta[] barajaEspanola = new Carta[20];
    //ARRAY CARTAS DE J1
    Carta[] cartasJ1 = new Carta[7];
    //ARRAY CARTAS DE J2
    Carta[] cartasJ2 = new Carta[7];
    //VARIABLE QUE SIRVE PARA CONTAR LA SIGUIENTE CARTA QUE TIENE QUE COGER LOS JUGADOR
    int posCartaACoger;
    //VARIABLE AYUDA A QUE LA BARAJA QUE IGUAL QUE AL MOSTRARLA
    int numCartas;
    //VARIABLE QUE SIRVE PARA CONTAR LA SIGUIENTE CARTA QUE TIENE QUE COGER EL JUGADOR J1
    int posCartaACogerJ1;
    //VARIABLE QUE SIRVE PARA CONTAR LA SIGUIENTE CARTA QUE TIENE QUE COGER EL JUGADOR J2
    int posCartaACogerJ2;
        
    public Baraja(){
        //ESPADAS   

    barajaEspanola[0] = new Carta(1, "Espada", 11);
    
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
    
    // METODO PARA BARAJAR CARTAS
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
    
    // METODO PARA MOTRAR CARTAS POR CONSOLA
    public void mostrarBaraja(){
        for(int x=0; x<20; x++){
        System.out.println(barajaEspanola[x].numero + " " + barajaEspanola[x].palo + " = " + barajaEspanola[x].puntos + " puntos");
        
        }
        System.out.println("");
    }
    
    // METODO PARA COGER CARTA
    public Carta cogerCarta(){
        numCartas = posCartaACoger;
        Carta cartaCogida = barajaEspanola[posCartaACoger];
        posCartaACoger += 1;
        return cartaCogida;
    }
    
    // METODO PARA DEFINIR AL J1
    public void jugador1(){
        Carta cogerUnaCarta = cogerCarta();
        cartasJ1[posCartaACogerJ1] = cogerUnaCarta;
        System.out.println(cartasJ1[posCartaACogerJ1].numero + " " + cartasJ1[posCartaACogerJ1].palo + " = " + cartasJ1[posCartaACogerJ1].puntos + " puntos");
    }
    
    // METODO PARA DEFINIR AL J2
    public void jugador2(){
        Carta cogerUnaCarta = cogerCarta();
        cartasJ2[posCartaACogerJ2] = cogerUnaCarta;
        System.out.println(cartasJ2[posCartaACogerJ2].numero + " " + cartasJ2[posCartaACogerJ2].palo + " = " + cartasJ2[posCartaACogerJ2].puntos + " puntos");
    }
   
    // METODO PARA RETORNAR UN NUMERO RANDOM
    public int getCartaAleatoria(int min, int max) {
        Random random = new Random();
        int num = random.nextInt(max-min+1) + min;
        return num;
    }

    

    
    

}  
