package metodos_y_atributos;

import java.util.Scanner;

public class Coche {
	Scanner entrada = new Scanner (System.in);
	
	// Definimos los atributos del coche:
	String marca;
	String color;
	int modelo;
	int km;

	// Colocamos los métodos para usar en el programa:

	public void ingresarDatos() {
		System.out.println("Ingresa la marca: ");
		marca = entrada.next();
		
		System.out.println("Ingresa el color: ");
		color = entrada.next();

		System.out.println("Ingresa el año del vehiculo: ");
		modelo = entrada.nextInt();

		System.out.println("Ingresa el kilometraje: ");
		km = entrada.nextInt();
	}

	public void mostrarDatos() {
		
		System.out.println("Marca: " + marca);
		System.out.println("Color: " + color);
		System.out.println("Modelo: " + modelo);
		System.out.println("Kilometraje: " + km + "km");
	}

}
