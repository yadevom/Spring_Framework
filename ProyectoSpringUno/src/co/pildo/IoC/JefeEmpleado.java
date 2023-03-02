package co.pildo.IoC;

public class JefeEmpleado implements Empleados {
	
	// Inyeccion de campos
		private String email;
		
		private String nombreEmpresa;

	// DI
	private CreacionInformes informeNuevo;
	
	// constructor para DI
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	
	public String getAreas() {
		return "Gestiono cuestiones relativas a empleados";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe por el jefe con arreglos: " + informeNuevo.getInforme();
	}
	
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

	

}
