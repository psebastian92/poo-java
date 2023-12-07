package sobrecarga_metodos;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona("Sebastian", 30);

		p1.correr();
		p1.correr(500);
		
		Persona p2 = new Persona("Daniel", 45);
		p2.correr();
		p2.correr(300);
	}
}
