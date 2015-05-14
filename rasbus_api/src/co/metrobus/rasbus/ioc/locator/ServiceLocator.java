package co.metrobus.rasbus.ioc.locator;

import java.util.HashMap;
import java.util.Map;

import co.metrobus.rasbus.infra.repositories.HSQLDBRutaRepository;


/**
 * Clase que implementa el service locator para lcoalizar los repositorios
 * mediante Inversión de control e inyectarselos a los Casos de uso
 */
public class ServiceLocator {
	private static ServiceLocator instance;
	
	private Map<String,Object> objetos;
	
	private ServiceLocator(){
		objetos = new HashMap<String,Object>();
		
		objetos.put("HDBSQLRutaRepository", new HSQLDBRutaRepository());
	}
	
	public static ServiceLocator getInstance(){
		if( instance == null ){
			instance = new ServiceLocator();
		}
		
		return instance;
	}
	
	public Object getObject(String objectName ){
		return objetos.get( objectName  );
	}
}
