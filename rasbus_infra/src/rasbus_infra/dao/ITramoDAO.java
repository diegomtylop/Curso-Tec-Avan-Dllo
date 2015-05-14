package rasbus_infra.dao;

import java.util.List;

import co.metrobus.rasbus.ruta.entities.Tramo;;

public interface ITramoDAO {
	public Tramo create( Tramo Tramo );
	public Tramo update( Tramo Tramo );
	public Tramo retreive( Tramo Tramo );
	public List<Tramo> listy();
	
	public int delete(Tramo Tramo );
}
