package tutorialJava.capitulo3.bloque2;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {

//		int var;
//		int suma = 0;
		String num = JOptionPane.showInputDialog("Obtener múltiplos de: ");
		String limite = JOptionPane.showInputDialog("Límite ");
		int numero = Integer.parseInt(num);
		int limit = Integer.parseInt(limite);
		int multiplo = numero;
		System.out.println("Los múltiplos de " + numero + " son: ");
		for (int i = limit; i > numero; i++) {
//			var = Integer.parseInt(str);
			if (multiplo < limit) {
				multiplo = multiplo + numero;
				if (i > multiplo) {
					System.out.println(multiplo);
				}
			}
//		System.out.println("La suma total es: " + suma);
		}
	}
}