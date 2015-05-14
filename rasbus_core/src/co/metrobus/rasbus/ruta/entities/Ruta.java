package co.metrobus.rasbus.ruta.entities;

import java.util.ArrayList;
import java.util.List;

public class Ruta {
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Bus> getBuses() {
		return buses;
	}
	public void setBuses(List<Bus> buses) {
		this.buses = buses;
	}
	public List<Tramo> getRecorrido() {
		return recorrido;
	}
	public void setRecorrido(List<Tramo> recorrido) {
		this.recorrido = recorrido;
	}
	private String id;
	private String nombre;
	private List<Bus> buses;
	private List<Tramo> recorrido; //Lista ordenada
	
	public Ruta(Tramo inicial) {
		recorrido = new ArrayList<Tramo>();
		recorrido.add(1, inicial);
	}
	
	public boolean adicionarTramo(Tramo nuevoTramo){
		if(validarTramoAdyacente(nuevoTramo)){
			recorrido.add(recorrido.size(),nuevoTramo);
		}else{
			return false;
		}
		return true;
	}
	private boolean validarTramoAdyacente(Tramo nuevoTramo) {
		Tramo ultimoTramo = recorrido.get(recorrido.size());
		return ultimoTramo.getDestino().equals(nuevoTramo.getInicio());
	}
	
	
	public boolean validarRuta(){
		boolean retorno = true;
		return retorno;                                  
	}

}
