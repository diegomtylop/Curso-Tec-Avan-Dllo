package com.metrobus.rasbusdiego.ruta.entities;

import java.util.ArrayList;
import java.util.List;

public class Recorrido {
	
	private List<Linea> trazada;
	
	public Recorrido() {
		super();
		this.trazada = new ArrayList<Linea>();
	}
	
	public Recorrido(List<Linea> trazada) {
		super();
		this.trazada = trazada;
	}



	public boolean addLinea(Linea l ){
		trazada.add( l );
		return true;
	}



	public List<Linea> getTrazada() {
		return trazada;
	}



	public void setTrazada(List<Linea> trazada) {
		this.trazada = trazada;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "Recorrido: {[";
		for( Linea l : trazada ){
			s+=l;
		}
		s+="]}";
		return s;
	}
	
	
}
