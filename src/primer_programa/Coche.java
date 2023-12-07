package primer_programa;

import javax.swing.JOptionPane;

public class Coche {
	// ATRIBUTOS
	String color;
	String marca;
	int km;

	// METODO
	public static void main(String[] args) {
		// Creación del OBJETO coche1:
		Coche coche1 = new Coche();
		// Coche es la clase, coche1 el objeto instanciado/creado de esa clase.
		coche1.color = "Blanco";
		coche1.marca = "Audi";
		coche1.km = 0;

		JOptionPane.showMessageDialog(null, "El color del primer coche es: " + coche1.color);
		JOptionPane.showMessageDialog(null, "La marca del primer coche es: " + coche1.marca);
		JOptionPane.showMessageDialog(null, "El kilometraje del primer coche es: " + coche1.km + "KM");

		// Creación del OBJETO coche2:
		Coche coche2 = new Coche();
		// Coche es la clase, coche2 el objeto instanciado/creado de esa clase.

		coche2.color = "Azul";
		coche2.marca = "Peugeot";
		coche2.km = 125679;

		JOptionPane.showMessageDialog(null, "El color del segundo coche es: " + coche2.color);
		JOptionPane.showMessageDialog(null, "La marca del segundo coche es: " + coche2.marca);
		JOptionPane.showMessageDialog(null, "El kilometraje del segundo coche es: " + coche2.km + "KM");

	}
}
