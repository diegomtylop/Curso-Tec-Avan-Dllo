package co.metrobus.rasbus.ruta.repositories;

import co.metrobus.rasbus.core.exception.RepositoryException;
import co.metrobus.rasbus.ruta.entities.Ruta;

/**
 * Implementación del patrón repository
 * @author Aula Movil
 *
 */
public interface RutaRepository {
	
	/*
	 * No llevan nombre de crear sino de persistir
	 * Todos los métodos deben retornar y recibir algo
	 */
	public Ruta adicioniarNuevaRuta( Ruta aCrear)throws RepositoryException;

	public Ruta obtenerRuta(Ruta parametro);

	public void actualizarRuta(Ruta ruta);
}
