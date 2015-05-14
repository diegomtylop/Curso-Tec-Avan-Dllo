package co.metrobus.rasbus.ruta.entities;

public class Parada {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Posicion getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Posicion ubicacion) {
		this.ubicacion = ubicacion;
	}
	private Posicion ubicacion;
}
