package co.metrobus.rasbus.ruta.entities;

public class Posicion {
	private String latitud;
	private String longitud;
	public String getLatitud() {
		return latitud;
	}
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		Posicion pos = (Posicion) obj;
		if(this.latitud.equals(pos.latitud) && this.longitud.equals(pos.longitud)){
			return true;
		}
		return false;
	}
}
