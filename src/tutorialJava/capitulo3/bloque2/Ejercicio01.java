package tutorialJava.capitulo3.bloque2;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		int media;
		int var;
		int suma = 0;
		String limite = JOptionPane.showInputDialog("¿Cuántos números se van a introducir?: ");
		int numeroLimite = Integer.parseInt(limite);
		for (int i = 0; i < numeroLimite; i++) {
			String str = JOptionPane.showInputDialog("Introduzca un número: ");
			var = Integer.parseInt(str);
			if (var >= numeroLimite) {
				suma = suma + var;
			}
		}
		media = suma / numeroLimite;
		System.out.println("La media de los valores introducidos es: " + media);
	}
}
