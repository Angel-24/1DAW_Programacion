package tutorialJava.capitulo1.ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		int numEntero;
		float numFlotante;
		double numDouble;

		String str = JOptionPane.showInputDialog("Introduce un número entero: ");
		numEntero = Integer.parseInt(str);
		System.out.println("El número entero es: " + numEntero);
		str = JOptionPane.showInputDialog("Introduce un número flotante: ");
		numFlotante = Float.parseFloat(str);
		System.out.println("El número entero es: " + numFlotante);
		str = JOptionPane.showInputDialog("Introduce un número double: ");
		numDouble = Double.parseDouble(str);
		System.out.println("El número entero es: " + numDouble);
	}

}
