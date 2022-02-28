package modelo;

import java.util.ArrayList;

public class RutaTransmilenio {
	
	private final ArrayList <EstacionTransmilenio> rutaEspecifica = new ArrayList<>();
	private String horaInicio;
	private String horaFinal;
	
	RutaTransmilenio(EstacionTransmilenio estacionT){
		this.rutaEspecifica.add(estacionT);
	}

	public RutaTransmilenio(String horaInicio, String horaFinal) {
		this.horaInicio = horaInicio;
		this.horaFinal = horaFinal;
	}

	public ArrayList<EstacionTransmilenio> getRutaEspecifica() {
		return rutaEspecifica;
	}

	public void agregarEstacionARuta(EstacionTransmilenio estacionTransmilenio){
		this.rutaEspecifica.add(estacionTransmilenio);
	}
}
