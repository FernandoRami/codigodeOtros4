package com.generation;

import java.util.Scanner;

public class Codigo4 {
    public static void main(String[] args) { // se agrego main
        Scanner s = new Scanner(System.in); // system.in
        

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
  	    //Scanner s2 = new Scanner(System.in);  Se comenta el scanner s2
        String j2 = s.nextLine();


	    if (j1 == j2) {      //Tenia un parentesis mas
	      System.out.println("Empate");
	    } else {	    	
	      int g = 2;	      
	      switch(j1) {	      
	        case "piedra":
	          if (j2 == "tijeras") {
	            g = 1;
	          }
	          
	        case "papel":
	          if (j2 == "piedra") {
	            g = 1;
	          }

	        case "tijeras"://mal escrito tijeras
	          if (j2 == "papel") {//se puso el == como en los cases de arriba
	            g = 1;
	          }          
	          break;
	        default:
	        	System.out.println("Elige un opcion válida");
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	    s.close();//se cierra el scanner
    }    
}
