package tutorialJava.capitulo3.bloque1;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {

		int var;
		int suma = 0;
		for (int i = 0; i < 4; i++) {
			String str = JOptionPane.showInputDialog("Introduzca un número: ");
			var = Integer.parseInt(str);
			if (var > 10) {
				suma = suma + var;
			}
		}
		System.out.println("La suma total es: " + suma);
	}
}
