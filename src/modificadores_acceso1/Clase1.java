/* MODIFICADORES DE ACCESO: 
  Son aquellos comandos que nos indican la posibilidad de usar atributos en otras clases
  y hasta en otros paquetes. 
  
  public: esto nos permite que el atributo sea usado por cualquier clase y paquete.
  
  protected: limita el uso de atributos a clases del mismo paquete. Si no se coloca
  nada antes de la variable, protected es el modificador por defecto.
  
  private: solo se pueden usar los atributos en la misma clase. 
  
 */
package modificadores_acceso1;

public class Clase1 {
	public int atributo1;
	protected int atributo2;
	private int atributo3;
	
}
