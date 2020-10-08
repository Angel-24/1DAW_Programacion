package tutorialJava.capitulo2_condicionales.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {

		String str1 = JOptionPane.showInputDialog("Introduzca un número: ");
		int var1 = Integer.parseInt(str1);
		String str2 = JOptionPane.showInputDialog("Introduzca otro número: ");
		int var2 = Integer.parseInt(str2);
		System.out.println("Números introducidos: " + var1 + " y " + var2);
//		int var2 = (~ var1);
//		int suma = var2 & 1;
		if (var1 < var2) {
			System.out.println(var1 + " es menor que " + var2);
		}
		else {
				System.out.println(var2 + " es menor que " + var1);
		}
	}
}
