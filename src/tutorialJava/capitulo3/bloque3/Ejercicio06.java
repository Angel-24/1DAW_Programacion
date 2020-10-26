package tutorialJava.capitulo3.bloque3;

import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {

		int var = 0;
		for (int v = 0; var != 0 | v == 0; v++) {
			var = 0;
			int resultado = 0;
			String str = JOptionPane.showInputDialog("Tabla de multiplicar de: ");
			var = Integer.parseInt(str);
			if (var != 0) {
				for (int i = 0; i >= 0; i++) {
					resultado = var * i;
					if (var != 0 && i == 0) {
						System.out.println("Tabla de multiplicar de " + var);
					}
					if (var != 0 && i <= 10) {
						System.out.println(var + " * " + i + " = " + resultado);
					}
					if (var != 0 && i == 10) {
						System.out.println("\n");
					}
				}
			} else
				;
		}
	}
}