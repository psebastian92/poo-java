package operacion;

import javax.swing.JOptionPane;

public class operacion {
	// Atributos
	int num1;
	int num2;
	int suma;
	int resta;
	int divis;
	int mult;

	// MÉTODOS: se llaman así a las funciones o procedimientos aplicadas en objetos. 
	// Método para pedir numeros
	public void ingresarNumeros() {
		num1 = Integer.parseInt( JOptionPane.showInputDialog("Digite un numero: ") );
		num2 = Integer.parseInt( JOptionPane.showInputDialog("Digite otro numero: ") );
	}

	public void sumar() {
		suma = num1 + num2;
	}

	public void restar() {
		resta = num1 - num2;
	}

	public void dividir() {
		divis = num1 / num2;
	}

	public void multiplicar() {
		mult = num1 * num2;
	}
	
	public void mostrarResultados() {
		JOptionPane.showMessageDialog(null, "Resultado de la suma: "+suma);
		JOptionPane.showMessageDialog(null, "Resultado de la resta: "+resta);
		JOptionPane.showMessageDialog(null, "Resultado de la division: "+divis);
		JOptionPane.showMessageDialog(null, "Resultado de la multiplicacion: "+mult);
		
	}

}
