package com.calso.juego.model;

import java.util.*;

public enum Direccion {
	ARRIBA, ABAJO, DERECHA, IZQUIERDA;

	private Random rnd = new Random();
	
	public Direccion opuesta(Direccion direccion) {
		switch (direccion) {
		case ARRIBA: return ABAJO;
		case ABAJO: return ARRIBA;
		case IZQUIERDA: return DERECHA;
		case DERECHA: return IZQUIERDA;
		default: return null;
		}
	}

	public Direccion aleatoria() {
		Direccion[] arrayDirecciones = Direccion.values();
		int indice = this.rnd.nextInt(4);

		return arrayDirecciones[indice];
	}

}
