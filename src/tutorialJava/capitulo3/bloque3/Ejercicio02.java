package tutorialJava.capitulo3.bloque3;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {

		float suma = 0;
		for (int i = 0; i >= 0; i++) {
			float cantidad = i;
			String num = JOptionPane.showInputDialog("Número para añadir a la media: ");
			float numero = Integer.parseInt(num);
			float media = suma / cantidad;
			suma = suma + numero;
			if (numero == 0) {
				System.out.println("La media de los números introducidos es: " + media);
				System.out.println("Se han introducido: " + i + " números.");
				break;
			} else
				;
		}
	}
}