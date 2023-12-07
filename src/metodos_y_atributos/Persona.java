package metodos_y_atributos;

import java.util.Scanner;

/* CLASE: es un concepto genetal de algo. Un "molde" que luego
 * generará "objetos".
 * Ejemplo: 
 * 		- Clase: vehiculos. Objetos de esta clase: auto, moto bici.
 * 		- Clase: animal. Objetos: perro, gato, jirafa. 
 * */

public class Persona {
	Scanner entrada = new Scanner(System.in);
	// ATRIBUTOS: son características/"adjetivos" de la clase.
	String nombre; // atributo "nombre". Variable del tipo String.
	String apellido; // atributo "apellido". Variable del tipo String.
	int edad; // atributo "float". Variable del tipo float.
	float altura;

	// MÉTODOS: "acciones" que se pueden hacer con la clase.

	public void ingresarDatos() {
		System.out.println("Ingresa el nombre: ");
		nombre = entrada.next();

		System.out.println("Ingresa el apellido: ");
		apellido = entrada.next();

		System.out.println("Ingresa la edad: ");
		edad = entrada.nextInt();

		System.out.println("Ingresa la altura: ");
		altura = entrada.nextFloat();
	}

	
	
	public void mostrarDatos() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("El apellido es: " + apellido);
		System.out.println("La edad es: " + edad);
		System.out.println("La altura es: " + altura);
	}

}
