package co.pildo.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		/*
		// Creación de objeto sin IoC, toca estar crearndo clases
		Empleados empleado1 = new JefeEmpleado();
		
		Empleados empleado2 = new SecretarioEmpleado();
		
		Empleados empleado3 = new DirectorEmpleado();
		
		// Uso objetos creados
		System.out.println(empleado1.getAreas());
		*/
		
		// 4 pasos para utilizar el contenedor de spring
		
		// 1 crear un contexto, como argumento el nombre de archivo de nuestra configuracion 
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2 pedir al archivo xml el bean(objeto)
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		
		// Utilizar el bean, con cambiar el tipo clase en archivo configuracion arrojara otro tipo resultado
		System.out.println(Juan.getAreas());
		
		// 1ERA FORMA: Crear Inyección Dependencia mediante un Constructor
		System.out.println("==================== INYECCION MEDIANTE CONSTRUCTOR ====================");
		// 1. Crear la clase e interfaz de la dependencia (Informes)
		// 2. Creación de constructor en la clase para la inyección de la depedencia
		// 3. Configurar la inyección de depedencia en archivo XML(applicationContext.xml)
		System.out.println(Juan.getInforme());
		
		//2DA FORMA: Crear Inyección Depedencia mediante un Setter
		System.out.println("==================== INYECCION DEPENDENCIA MEDIANTE SETTER ====================");
		// Se debe invocar en este caso el Bean especifico (miSecretarioEmpleado)
		Empleados Maria = contexto.getBean("miSecretarioEmpleado", Empleados.class);
		
		System.out.println(Maria.getAreas());
		System.out.println(Maria.getInforme());
		
		// INYECCION DE CAMPOS
		// Cuando tenga campos que utilizan varios objetos de tu proyecto, varias  clases
		// Haces una inyección de estos objetos desde el xml, sin necesidad de crearlos siempre
		System.out.println("======================== INYECCION DE CAMPOS ========================");
		
		SecretarioEmpleado Marli = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(Marli.getAreas());
		System.out.println(Marli.getInforme());
		System.out.println("Email: " + Marli.getEmail());
		System.out.println(Marli.getNombreEmpresa());
		
		// Ejemplo crear un nuevo objeto tipo secretario y lo rapido de usar una inyeccion del campo email
		System.out.println("=================================================================");
		
		SecretarioEmpleado Rigo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println("Email: " + Rigo.getEmail());
		
		System.out.println("====================== INYECCION DE CAMPOS PARA OTRAS CLASES CONFIGURANDO XML====================");
		
		JefeEmpleado Luci = contexto.getBean("miEmpleado", JefeEmpleado.class);
		System.out.println(Luci.getInforme());
		System.out.println(Luci.getEmail());
		System.out.println(Luci.getNombreEmpresa());
		
		// Cerrar el contexto
		contexto.close();
		
		
	}

}
