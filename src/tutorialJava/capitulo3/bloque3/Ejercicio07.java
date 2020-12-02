package tutorialJava.capitulo3.bloque3;

import javax.swing.JOptionPane;

public class Ejercicio07 {

	public static void main(String[] args) {

		int var = 0;
		int pos = 0;
		int neg = 0;
		for (int i = 0; var != 0 | i == 0; i++) {
			String str = JOptionPane.showInputDialog("[0 para finalizar] Introduzca un número: ");
			var = Integer.parseInt(str);
			if (var > 0) {
				pos++;
			} else {
				if (var < 0)
					neg++;
			}
		}
		System.out.println("Se escribieron: " + pos + " números positivos, y " + neg + " números negativos.");
	}
}