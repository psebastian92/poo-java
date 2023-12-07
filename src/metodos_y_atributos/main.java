package metodos_y_atributos;

public class main {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Coche c1 = new Coche();

		p1.ingresarDatos();
		System.out.println("");
		p1.mostrarDatos();
		System.out.println("");

		p2.ingresarDatos();
		System.out.println("");
		p2.mostrarDatos();
		System.out.println("");

		c1.ingresarDatos();
		System.out.println("");
		c1.mostrarDatos();

	}

}
