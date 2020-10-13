package tutorialJava.capitulo3.bloque1;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		int var;
		int sumap = 0;
		int suman = 0;
		String limite = JOptionPane.showInputDialog("¿Cuántos números se van a introducir?: ");
		int numeroLimite = Integer.parseInt(limite);
		for (int i = 0; i < numeroLimite; i++) {
			String str = JOptionPane.showInputDialog("Introduzca un número: ");
			var = Integer.parseInt(str);
			if (var > 0) {
				sumap = sumap + 1;
			}
			else { if (var < 0)
				suman = suman + 1;
			}
		}
		System.out.println("Se escribieron: " + sumap + " números positivos, y " + suman + " números negativos.");
	}
}
