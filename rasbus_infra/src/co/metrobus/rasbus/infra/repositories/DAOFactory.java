package co.metrobus.rasbus.infra.repositories;

import rasbus_infra.dao.HSQLDBRutaDAO;
import rasbus_infra.dao.IRecorridoDAO;
import rasbus_infra.dao.IRutaDAO;
import rasbus_infra.dao.ITramoDAO;
import rasbus_infra.dao.InMemoryRecorrido;
import rasbus_infra.dao.InMemoryTramoDAO;

/**
 * Clase encargada de crear las instancias de los daos
 * y mantener una referencia de los DAOS
 * @author Aula Movil
 *
 */
public class DAOFactory {
	private static DAOFactory singleton; 
	
	//Mantiene la referencia a todos los DAOS
	private IRutaDAO rutaDAO;
	private ITramoDAO tramoDAO;
	private IRecorridoDAO recorridoDAO;
	
	private DAOFactory(){
		
	}
	
	/**
	 * Si tuviera varios origenes de datos este método recibiría un argunmento
	 * para identificar cual es el tipo de daO que se está consultando
	 * @return
	 */
	public IRutaDAO getRutaDAO( String tipo ) {
		switch( tipo ){
			case  "HSQLDB":
				if( rutaDAO == null ){
					rutaDAO = new HSQLDBRutaDAO();
				}
			default:
				rutaDAO = new HSQLDBRutaDAO();
		}
		return rutaDAO;
	}
	
	public ITramoDAO getTramoDAO( String tipo ) {
		switch( tipo ){
			case  "INMEMORY":
				if( tramoDAO == null ){
					tramoDAO = new InMemoryTramoDAO();
				}
			default:
				tramoDAO = new InMemoryTramoDAO();
		}
		return tramoDAO;
	}

	public static DAOFactory getInstance(){
		if( singleton == null ){
			singleton = new DAOFactory();
		}
		return singleton;
	}

	public IRecorridoDAO getRecorridodAO(String tipo) {
		switch( tipo ){
			case  "INMEMORY":
				if( recorridoDAO == null ){
					recorridoDAO = new InMemoryRecorrido();
				}
			default:
				recorridoDAO = new InMemoryRecorrido();
		}
	return recorridoDAO;
	}
}
