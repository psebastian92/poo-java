package operacion;


/* El método Main no hace falta que este en la misma clase. 
	Puede estar separado en otra clase, como en este caso.*/
public class Main {
	public static void main(String[] args) {
		operacion op = new operacion();

		op.ingresarNumeros();
		op.sumar();
		op.restar();
		op.dividir();
		op.multiplicar();
		op.mostrarResultados();

	}
}
