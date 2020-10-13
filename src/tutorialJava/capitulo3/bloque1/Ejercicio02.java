package tutorialJava.capitulo3.bloque1;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {

		int var;
		int suma = 0;
		String limite = JOptionPane.showInputDialog("¿Cuántos números se van a introducir?: ");
		int numeroLimite = Integer.parseInt(limite);
		for (int i = 0; i < numeroLimite; i++) {
			String str = JOptionPane.showInputDialog("Introduzca un número: ");
			var = Integer.parseInt(str);
			if (var > 10) {
				suma = suma + var;
			}
		}
		System.out.println("La suma total es: " + suma);
	}
}
