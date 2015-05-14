package co.metrobus.rasbus.core.usecase;

import co.metrobus.rasbus.core.exception.UseCaseException;

/**
 * Clase que usa generics
 * @author Aula Movil
 *
 */
public interface GenericUseCase<Result,Argument> {
	public Result execute( Argument parametros) throws UseCaseException;
}
