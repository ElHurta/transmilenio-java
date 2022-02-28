package modelo;

public class TarjetaSubsidio extends TarjetaTransmilenio {

	private UsuarioTransmilenio usuarioTransmilenio;
	private final boolean subsidioTransporte = true;

	public TarjetaSubsidio(double saldoTarjeta) {
		super(saldoTarjeta);
	}

	public boolean isSubsidioTransporte() {
		return subsidioTransporte;
	}

}
