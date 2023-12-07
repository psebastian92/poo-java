package sobrecarga_metodos;

public class Persona {
	String nombre;
	int edad;
	String DNI;

	/*
	 * Vamos a crear dos constructores. Uno, para edad y nombre. Otro para DNI. Esto
	 * es por si el programador desea que se ingresen edad y nombre por un lado, y
	 * el DNI por otro lado. Esto se puede hacer, y se llama sobrecarga de métodos
	 * constructores. NO SE PUEDEN GENERAR DOS MÉTODOS CON EL MISMO TIPO Y MISMA
	 * CANTIDAD DE VARIABLES (no puede haber por ejemplo public Persona (String) y
	 * public Persona (String).
	 */
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(String DNI) {
		DNI = DNI;
	}

	/*
	 * Vamos a crear dos métodos "correr". Esto de nombrar a dos métodos de la misma
	 * forma es posible y se conoce como sobrecarga de métodos. NO SE PUEDEN GENERAR
	 * DOS MÉTODOS CON EL MISMO TIPO Y MISMA CANTIDAD DE VARIABLES.
	 */
	public void correr() {
		System.out.println("Soy " + nombre + " tengo " + edad + " y estoy corriendo una maraton");
	}

	public void correr(int km) {
		System.out.println("He corrido " + km + "km");
	}

}
