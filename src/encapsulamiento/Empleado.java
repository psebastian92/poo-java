package encapsulamiento;

import javax.swing.JOptionPane;

public class Empleado {
	private int edad;
	private String nombre;
	boolean flag = false;

	public int setEdad() {
		edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresá edad del empleado: "));
		return edad;
	}

	public void analizarEdad() {
		if (edad > 18 && edad < 50) {
			flag = false;
		} else {
			JOptionPane.showMessageDialog(null, "Edad incorrecta");
			flag = true;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void getEdad() {
		if (flag == false) {
			JOptionPane.showMessageDialog(null, "La edad es: " + edad + ". " + "\nEdad aceptada");
			String nombre = JOptionPane.showInputDialog("Ingresa su nombre ");
			JOptionPane.showMessageDialog(null, "Su nombre es: " + nombre);
		} else {
			JOptionPane.showMessageDialog(null, "No se pudo procesar la informacion");
		}
	}

	public void verCategoria() {
		if (edad > 18 && edad < 25) {
			JOptionPane.showMessageDialog(null, "Joven");
		}
		if (edad >= 25 && edad < 40) {
			JOptionPane.showMessageDialog(null, "Adulto");
		}
		if (edad >= 40 && edad<50) {
			JOptionPane.showMessageDialog(null, "Veterano");
		}
	}
}
