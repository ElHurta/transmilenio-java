package modelo;

public class UsuarioTransmilenio {
	
	private String nombreUsuario;
	private String idUsuario;
	private boolean subsidioTransporte;
	
	UsuarioTransmilenio(){
		this.nombreUsuario = null;
		this.idUsuario = null;
		this.subsidioTransporte= false;
	}
	
	UsuarioTransmilenio(String nombreUsuario, String idUsuario){
		this.nombreUsuario = nombreUsuario;
		this.idUsuario = idUsuario;
	}
	
	UsuarioTransmilenio(String nombreUsuario,String idUsuario,boolean subsidioTransporte){
		this.nombreUsuario = nombreUsuario;
		this.idUsuario = idUsuario;
		this.subsidioTransporte = subsidioTransporte;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public boolean isSubsidioTransporte() {
		return subsidioTransporte;
	}
	
}
