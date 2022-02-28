package modelo;

public abstract class BusTransmilenio {

	private int capacidadBus;

	void seguirRuta(RutaTransmilenio rutaASeguir){};

	public BusTransmilenio(int capacidadBus){ this.capacidadBus = capacidadBus; }
}
