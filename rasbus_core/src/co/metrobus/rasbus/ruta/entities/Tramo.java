package co.metrobus.rasbus.ruta.entities;

import java.util.List;

public class Tramo {
	private String id;
	
	private Posicion inicio;
	private Posicion destino;
	private double distancia;
	
	public Tramo(Posicion inicio, Posicion destino, double distancia) throws TramoInvalidoException {
		if(distancia == 0){
			throw new TramoInvalidoException();
		}
	}
	
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	private List<Parada> paradas;
	
	public Posicion getInicio() {
		return inicio;
	}
	public void setInicio(Posicion inicio) {
		this.inicio = inicio;
	}
	public Posicion getDestino() {
		return destino;
	}
	public void setDestino(Posicion destino) {
		this.destino = destino;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) return false;
		
		Tramo tr = (Tramo) obj;
		if(tr.getId().equals(this.id)) return true;
		
		return false;
	}
	
	public boolean validarTramo(){
		if(inicio.equals(destino)){
			return false;
		}
		return true;
	}
	public List<Parada> getParadas() {
		return paradas;
	}
	public void setParadas(List<Parada> paradas) {
		this.paradas = paradas;
	}
	
	
}
