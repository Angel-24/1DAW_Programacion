package tutorialJava.capitulo1.ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;

		String str = JOptionPane.showInputDialog("Introduce un número: ");
		num1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce otro número: ");
		num2 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número más: ");
		num3 = Integer.parseInt(str);

		int suma = num1 + num2 + num3;

		System.out.println("El resultado de la suma es: " + suma);

	}

}
