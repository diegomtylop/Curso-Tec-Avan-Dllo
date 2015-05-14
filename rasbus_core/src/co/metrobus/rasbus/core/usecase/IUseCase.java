package co.metrobus.rasbus.core.usecase;

import co.metrobus.rasbus.core.exception.UseCaseException;
import co.metrobus.rasbus.ruta.dto.RutaDTO;

/**
 * Esta interfaz es la representación del patrón command
 * @author Aula Movil
 *
 */
public interface IUseCase {

		public IUseCaseResult execute( IUseCaseParam parametro )throws UseCaseException;

}
