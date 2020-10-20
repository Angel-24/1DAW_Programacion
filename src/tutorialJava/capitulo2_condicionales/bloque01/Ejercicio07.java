package tutorialJava.capitulo2_condicionales.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio07 {

	public static void main(String[] args) {

		int resto = 0;
		
		String str1 = JOptionPane.showInputDialog("Introduzca un número: ");
		int var1 = Integer.parseInt(str1);
		
		if (var1 % 2 == resto && var1 % 2 != 1) {
			System.out.println(var1 + " es un número par.");
		} else {
			if (var1%2 != resto && var1 % 2 == 1) {
				System.out.println(var1 + " es un número impar.");
			}
		}
	}
}