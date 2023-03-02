package co.pildo.IoC;

// 1. Creación de la clase para la dependencia
public class Informe implements CreacionInformes {

	@Override
	public String getInforme() {

		return "Esta es la presentación del informe";
	}

}
