package tutorialJava.capitulo1.ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio08 {

	public static void main(String[] args) {

		String str = JOptionPane.showInputDialog("Introduzca un número: ");
		int var1 = Integer.parseInt(str);
		System.out.println("Número introducido: " + var1);
		int var2 = (~var1);
		int suma = var2 & 1;
		if (suma == 1) {
			System.out.println(var1 + " es un número par");
		} else {
			System.out.println(var1 + " es un número impar");
		}
	}
}
