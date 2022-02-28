package modelo;

public class BusTroncal extends BusTransmilenio {

	public BusTroncal(int capacidadBus) {
		super(capacidadBus);
	}

	@Override
	public void seguirRuta(RutaTransmilenio rutaASeguir) {}

	private final boolean rutaPreferencial = true;

	public void recogerPasajero() {}

	public void dejarPasajero() {}

	public boolean isRutaPreferencial() {
		return rutaPreferencial;
	}
}
