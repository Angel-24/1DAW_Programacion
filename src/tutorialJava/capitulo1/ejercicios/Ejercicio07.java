package tutorialJava.capitulo1.ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio07 {

	public static void main(String[] args) {

		String str = JOptionPane.showInputDialog("Introduzca un número: ");
		int var1 = Integer.parseInt(str);
		System.out.println("Número introducido: " + var1);
		var1 = (~var1);
		int suma = var1 + 1;
		System.out.println("Resultado de " + var1 + " + 1 = " + suma);
	}

}
