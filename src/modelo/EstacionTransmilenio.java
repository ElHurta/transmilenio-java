package modelo;

public class EstacionTransmilenio {
	
	private String nombreEstacion;
	
	EstacionTransmilenio(){
		this.nombreEstacion = " ";
	}
	
	EstacionTransmilenio(String nombreEstacion){
		this.nombreEstacion = nombreEstacion;
	}

	public String getNombreEstacion() {
		return nombreEstacion;
	}

	public void setNombreEstacion(String nombreEstacion) {
		this.nombreEstacion = nombreEstacion;
	}
	
	
}
