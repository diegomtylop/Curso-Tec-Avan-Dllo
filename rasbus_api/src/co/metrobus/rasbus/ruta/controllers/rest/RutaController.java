package co.metrobus.rasbus.ruta.controllers.rest;

import co.metrobus.rasbus.ruta.dto.RutaDTO;

/**
 * Esta sería la fachada de la API
 * podría llamarse RutaService, RutaInteractor
 * @author Aula Movil
 *
 *
 * REST: Representational State Transfer
 */
public interface RutaController {
	/**
	 * Utilizamos un DTO porque es una capa externa que posiblemente
	 * tenga un formato el cual voy a tener que transformar de acuerdo a lo que necesite
	 * en el CU específico.
	 * 
	 * @param rutaDTO
	 */
	public RutaDTO crearRuta(RutaDTO rutaDTO )throws Exception;
}
