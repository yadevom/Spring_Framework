package co.pildo.IoC;

public class SecretarioEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;
	
	// Inyeccion de campos
	private String email;
	
	private String nombreEmpresa;

	@Override
	public String getAreas() {
		// TODO Auto-generated method stub
		return "Gestionar agenda Jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Infome generado por el secretario: " + informeNuevo.getInforme();
	}

	
	// Setter para la DI
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	// Setter para inyeccion de campos

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public CreacionInformes getInformeNuevo() {
		return informeNuevo;
	}
	
	

	
	
}
