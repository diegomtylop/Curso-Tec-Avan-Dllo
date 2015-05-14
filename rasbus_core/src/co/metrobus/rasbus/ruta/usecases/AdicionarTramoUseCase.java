package co.metrobus.rasbus.ruta.usecases;

import co.metrobus.rasbus.core.exception.RepositoryException;
import co.metrobus.rasbus.core.exception.UseCaseException;
import co.metrobus.rasbus.core.usecase.GenericUseCase;
import co.metrobus.rasbus.ruta.entities.Ruta;
import co.metrobus.rasbus.ruta.entities.Tramo;
import co.metrobus.rasbus.ruta.repositories.RutaRepository;


/**
 * Caso de uso ficticio para mostrar como sería el uso de los generics
 * @author Aula Movil
 *
 */
public class AdicionarTramoUseCase implements GenericUseCase<Ruta, Ruta> {
	RutaRepository repo;
	
	@Override
	public Ruta execute(Ruta parametro) throws UseCaseException {
		Tramo nuevoTRamo = parametro.getRecorrido().get( 0 );
		
		Ruta ruta = repo.obtenerRuta( parametro );
		
		ruta.adicionarTramo( nuevoTRamo );
		
		repo.actualizarRuta( ruta );
		
		return ruta;
	}

}
