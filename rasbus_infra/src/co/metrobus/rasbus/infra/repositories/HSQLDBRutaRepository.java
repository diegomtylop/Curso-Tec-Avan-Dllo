package co.metrobus.rasbus.infra.repositories;

import java.util.List;

import rasbus_infra.dao.IRecorridoDAO;
import rasbus_infra.dao.IRutaDAO;
import rasbus_infra.dao.ITramoDAO;
import co.metrobus.rasbus.core.exception.RepositoryException;
import co.metrobus.rasbus.ruta.entities.Ruta;
import co.metrobus.rasbus.ruta.entities.Tramo;
import co.metrobus.rasbus.ruta.repositories.RutaRepository;

/**
 * Clase que implementa el verdadero acceso a datos
 */
public class HSQLDBRutaRepository implements RutaRepository {

	@Override
	public Ruta adicioniarNuevaRuta(Ruta aCrear) throws RepositoryException {
		// TODO Auto-generated method stub
		IRutaDAO dao = DAOFactory.getInstance().getRutaDAO("HSQL");// = new RutaDAO();
		
		
		List<Tramo> tramos = aCrear.getRecorrido();
		
		ITramoDAO tramodAO = DAOFactory.getInstance().getTramoDAO("MEMORY");
		
		IRecorridoDAO recorridoDAO = DAOFactory.getInstance().getRecorridodAO("INMEMORY");
		
		for( Tramo t: tramos ){
			tramodAO.create( t );
			recorridoDAO.create( aCrear.getId(), t.getId() );
		}
		dao.create( aCrear);
		return null;
	}

	@Override
	public Ruta obtenerRuta(Ruta parametro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarRuta(Ruta ruta) {
		// TODO Auto-generated method stub
		
	}

}
