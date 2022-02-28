package modelo;

public class BusZonal extends BusTransmilenio {

	public BusZonal(int capacidadBus) {
		super(capacidadBus);
	}
	
	@Override
	public void seguirRuta(RutaTransmilenio rutaASeguir) {}

	public void recogerPasajero(TarjetaTransmilenio tarjetaTransmilenio) {
		
		if(tarjetaTransmilenio instanceof TarjetaNormal || tarjetaTransmilenio instanceof TarjetaPersonalizada) {
			//
		}else if(tarjetaTransmilenio instanceof TarjetaSubsidio) {
			//
		}
	}

	public void dejarPasajero() {}

}
