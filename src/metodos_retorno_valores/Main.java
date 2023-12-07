package metodos_retorno_valores;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
	int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
	
	Operacion op = new Operacion ();
	
	int s = op.sumar(n1, n2);
	int r = op.restar(n1, n2);
	int m = op.multiplicar(n1, n2);
	float d = op.dividir(n1, n2);
	
	op.mostrarResultados(s, r, m, d);

	}

}
