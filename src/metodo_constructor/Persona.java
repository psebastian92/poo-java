package metodo_constructor;

public class Persona {
	String nombre;
	int edad;
	
	/* MÉTODO CONSTRUCTOR:
	 Sirven para iniciar atributos de una clase. 
	 No son void, ni int, ni float, etc. 
	 Se le coloca el nombre de la clase (en este ejemplo, persona), y dentro 
	 del paréntesis, los parámetros de los atributos.
	   */
	
	
	public Persona(String nombre, int edad) {
		 this.nombre = nombre; // this.nombre significa "esto ES el atributo nombre"
		 this.edad = edad; // this.edad "esto ES el atributo edad"
	}
	
	/* OTRA FORMA DE ARMAR UN CONSTRUCTOR: 
	 public Persona(String _nombre, int _edad) {
		 nombre = _nombre;
		 edad = _edad;
	 
	 */
	
	public void mostrarDatos() {
		System.out.println("El nombre es: "+nombre);
		System.out.println("La edad es: "+edad);
	}
	
}
