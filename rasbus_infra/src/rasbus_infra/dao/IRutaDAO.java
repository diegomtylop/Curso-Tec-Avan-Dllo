package rasbus_infra.dao;

import java.util.List;

import co.metrobus.rasbus.ruta.entities.Ruta;

public interface IRutaDAO {
	public Ruta create( Ruta ruta );
	public Ruta update( Ruta ruta );
	public Ruta retreive( Ruta ruta );
	public List<Ruta> listy();
	
	public int delete(Ruta ruta );
}
