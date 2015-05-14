package rasbus_infra.dao;

import java.util.List;

import co.metrobus.rasbus.ruta.entities.Ruta;
import co.metrobus.rasbus.ruta.entities.Tramo;

public interface IRecorridoDAO {
	public Ruta create( String idRuta, String idTramo );
	public Ruta update( Ruta ruta, Tramo tramo );
	public Ruta retrieve( Ruta ruta, Tramo tramo );
	public List<Ruta> list();
	
	public int delete(String idRuta, String idTramo );
}
