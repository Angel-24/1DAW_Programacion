package tutorialJava.capitulo3.bloque2;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {

//		int var;
//		int suma = 0;
		String num = JOptionPane.showInputDialog("Obtener múltiplos de: ");
		int numero = Integer.parseInt(num);
		int multiplo = numero;
		System.out.println("Los múltiplos de " + numero + " son: ");
		for (int i = 100; i > numero; i++) {
//			var = Integer.parseInt(str);
			if (multiplo < 100) {
				multiplo = multiplo + numero;
				if (100 > multiplo) {
					System.out.println(multiplo);
				}
			}
//		System.out.println("La suma total es: " + suma);
		}
	}
}