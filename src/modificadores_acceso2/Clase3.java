package modificadores_acceso2;

import modificadores_acceso1.Clase1;

public class Clase3 {
	public static void main(String[] args) {
		Clase1 objeto1 = new Clase1 ();
		
		objeto1.atributo1 = 8;
		objeto1.atributo2 = 15; // NO funciona. Pues atributo2 es "protected".
		objeto1.atributo3 = 28; // NO funciona. Pues atributo3 es "private".
	}
}
