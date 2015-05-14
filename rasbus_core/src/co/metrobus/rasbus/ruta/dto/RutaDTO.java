package co.metrobus.rasbus.ruta.dto;

import co.metrobus.rasbus.core.usecase.IUseCaseParam;
import co.metrobus.rasbus.core.usecase.IUseCaseResult;
import co.metrobus.rasbus.ruta.entities.Ruta;

public class RutaDTO implements IUseCaseParam, IUseCaseResult {
	private Ruta ruta;

	public Ruta getRuta() {
		return ruta;
	}

	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

}
