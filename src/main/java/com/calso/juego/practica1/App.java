package com.calso.juego.practica1;

import com.calso.juego.model.*;


public class App {
	public static void main(String args[]) {
	      Punto punto1 = new Punto();

	      Punto puntos[] = new Punto[2]; 
	      puntos[0] = punto1;
	      
	      String info = ""; 

	      for (Punto punto : puntos)
	          info.concat(punto.toString());

	     String mensaje = (info == "") ? "no hay puntos" : info; 

	     System.out.println(mensaje);
	    }
}
