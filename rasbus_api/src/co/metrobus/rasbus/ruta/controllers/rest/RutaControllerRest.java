package co.metrobus.rasbus.ruta.controllers.rest;

//import javax.
import co.metrobus.rasbus.core.usecase.IUseCase;
import co.metrobus.rasbus.core.usecase.IUseCaseParam;
import co.metrobus.rasbus.ioc.locator.ServiceLocator;
import co.metrobus.rasbus.ruta.dto.RutaDTO;
import co.metrobus.rasbus.ruta.repositories.RutaRepository;
import co.metrobus.rasbus.ruta.usecases.CrearRutaUseCase;

import javax.ws.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/rutas")
public class RutaControllerRest implements RutaController {

	@Override
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RutaDTO crearRuta(RutaDTO rutaDTO) throws Exception {
		// TODO Auto-generated method stub
		
		//Invoca al service locator para obtener la implementación del repositorio
		RutaRepository reposi = (RutaRepository) ServiceLocator.getInstance().getObject("HDBSQLRutaRepository");
		
		//HAce la inyección del repositorio en el caso de uso
		IUseCase crearRutaCasoUso = new CrearRutaUseCase( reposi );
		
		
		
		RutaDTO resul = (RutaDTO) crearRutaCasoUso.execute( rutaDTO);
		
		return resul;
	}

}
