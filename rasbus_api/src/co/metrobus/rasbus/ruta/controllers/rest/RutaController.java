package co.metrobus.rasbus.ruta.controllers.rest;

import co.metrobus.rasbus.ruta.dto.RutaDTO;

/**
 * Esta ser�a la fachada de la API
 * podr�a llamarse RutaService, RutaInteractor
 * @author Aula Movil
 *
 *
 * REST: Representational State Transfer
 */
public interface RutaController {
	/**
	 * Utilizamos un DTO porque es una capa externa que posiblemente
	 * tenga un formato el cual voy a tener que transformar de acuerdo a lo que necesite
	 * en el CU espec�fico.
	 * 
	 * @param rutaDTO
	 */
	public RutaDTO crearRuta(RutaDTO rutaDTO )throws Exception;
}
