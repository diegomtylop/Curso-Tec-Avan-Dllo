package com.metrobus.rasbusdiego.ruta.entities;

public class Linea {
	@Override
	public String toString() {
		return "Linea [p1=" + p1 + ", p2=" + p2 + ", distancia=" + distancia
				+ "]";
	}
	private Punto p1;
	private Punto p2;
	
	
	private double distancia;
	
	public double getDistancia() {
		return distancia;
	}
	public Linea(Punto p1, Punto p2, double distancia) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.distancia = distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public Punto getP1() {
		return p1;
	}
	public void setP1(Punto p1) {
		this.p1 = p1;
	}
	public Punto getP2() {
		return p2;
	}
	public void setP2(Punto p2) {
		this.p2 = p2;
	}

	
}
