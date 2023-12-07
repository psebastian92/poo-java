package metodos_retorno_valores;

public class Operacion {

	/* Puedo usar métodos/funciones que nos devuelvan valores de manera directa. 
	 * Recordar que VOID no devuelve un valor directamente. */
	
	public int sumar(int a, int b) {
		int suma = a + b;
		return suma; // return nos devuelve un valor "suma"
	}
	
	public int restar(int a, int b) {
		int resta = a - b;
		return resta; // return nos devuelve un valor "resta"
	}
	
	public int multiplicar(int a, int b) {
		int multip = a * b;
		return multip; // return nos devuelve un valor "multip"
	}
	
	public float dividir(float a, float b) {
		float div = a / b;
		return div; // // return nos devuelve un valor "div"
	}
	
	public void mostrarResultados (int suma, int resta, int multip, float div) {
		System.out.println("El resultado de la suma es: "+suma);
		System.out.println("El resultado de la resta es: "+resta);
		System.out.println("El resultado de la multiplicacion es: "+multip);
		System.out.println("El resultado de la division es: "+div);
	}
	
	
}
