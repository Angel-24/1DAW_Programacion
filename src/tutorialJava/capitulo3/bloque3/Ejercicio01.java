package tutorialJava.capitulo3.bloque3;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {

		int suma = 0;
		for (int i = 0; i >= 0; i++) {
			String num = JOptionPane.showInputDialog("Número para añadir a la suma: ");
			int numero = Integer.parseInt(num);
			suma = suma + numero;
			if (numero == 0) {
				System.out.println("La suma total de los números introducidos es: " + suma);
				break;
			} else
				;
//		System.out.println("La suma total es: " + suma);
		}
	}
}