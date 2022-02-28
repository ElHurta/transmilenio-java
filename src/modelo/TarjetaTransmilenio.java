package modelo;

public abstract class TarjetaTransmilenio {

	private double saldoTarjeta;

	public TarjetaTransmilenio(double saldoTarjeta) {
		this.saldoTarjeta = saldoTarjeta;
	}

	public double getSaldoTarjeta() {
		return saldoTarjeta;
	}

	public void setSaldoTarjeta(double saldoTarjeta) {
		this.saldoTarjeta = saldoTarjeta;
	}

	public void recargarTarjeta(double montoRecarga){setSaldoTarjeta(getSaldoTarjeta() + montoRecarga);}
}
