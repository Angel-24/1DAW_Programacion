package tutorialJava.capitulo1.ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {
		int num1;
		int num2;

		String str = JOptionPane.showInputDialog("Introduce un número: ");
		num1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce otro número: ");
		num2 = Integer.parseInt(str);
		System.out.println("Las variables introducidas son: " + num1 + " y " + num2);

		int numA = num1;
		num1 = num2;
		num2 = numA;

		System.out.println("Y las variables con los valores intercambiados: " + num1 + " y " + num2);
	}
}
