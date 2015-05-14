package co.metrobus.rasbus.ruta.usecases;

import co.metrobus.rasbus.core.exception.RepositoryException;
import co.metrobus.rasbus.core.exception.UseCaseException;
import co.metrobus.rasbus.core.usecase.IUseCase;
import co.metrobus.rasbus.core.usecase.IUseCaseParam;
import co.metrobus.rasbus.core.usecase.IUseCaseResult;
import co.metrobus.rasbus.ruta.dto.RutaDTO;
import co.metrobus.rasbus.ruta.entities.Ruta;
import co.metrobus.rasbus.ruta.repositories.RutaRepository;


/**
 * Interface general sin el uso de generics
 * @author Aula Movil
 *
 */
public class CrearRutaUseCase implements IUseCase{

	private Ruta ruta;
	
	//Interfaz del repositorio
	private RutaRepository repo;
	
	public CrearRutaUseCase(Ruta ruta) {
		this.ruta = ruta;
	}
	
	public CrearRutaUseCase( RutaRepository repo) {
		this.repo = repo;
	}

	@Override
	public IUseCaseResult execute(IUseCaseParam parametro)
			throws UseCaseException {
		RutaDTO rutaDTO = (RutaDTO)parametro;
		
		Ruta ruta = rutaDTO.getRuta();
		
		if( ruta.validarRuta() ){
			//Acá ya debo persistir la ruta
			try {
				repo.adicioniarNuevaRuta( ruta );
			} catch (RepositoryException e) {
				// TODO Auto-generated catch block
				throw new UseCaseException( e );
			}
		}
		return null;
	}
	
}
