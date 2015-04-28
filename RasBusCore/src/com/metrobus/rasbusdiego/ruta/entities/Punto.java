package com.metrobus.rasbusdiego.ruta.entities;

public class Punto {
	private Long x;
	private Long y;
	
	public Punto(Long x, Long y){
		this.x = x;
		this.y = y;
	}
	
	public Long getX() {
		return x;
	}
	public void setX(Long x) {
		this.x = x;
	}
	public Long getY() {
		return y;
	}
	public void setY(Long y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
}
