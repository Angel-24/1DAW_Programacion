package tutorialJava.capitulo3.bloque2;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {

		int var;
		int menor = 0;
		int mayor = 0;
		String limite = JOptionPane.showInputDialog("¿Cuántos números se van a introducir?: ");
		int numeroLimite = Integer.parseInt(limite);
//		menor = mayor;
		for (int i = 0; i < numeroLimite; i++) {
			String str = JOptionPane.showInputDialog("Introduzca un número: ");
			var = Integer.parseInt(str);
			if (var < menor) {
				menor = var;
			}
			if (var > mayor) {
				mayor = var;
			}
			if (menor == 0) {
				menor = mayor;
			}
		}
		System.out.println("El mayor número introducido es: " + mayor + ", mientras que el menor es: " + menor + ".");
	}
}