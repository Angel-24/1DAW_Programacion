package tutorialJava.capitulo3.bloque3;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {

		int var = 0;
		int menor = 0;
		int mayor = 0;
//		String limite = JOptionPane.showInputDialog("¿Cuántos números se van a introducir?: ");
		for (int i = 0; i >= 0; i++) {
			if (var == 0 & i >= 1) {
				System.out.println(
						"El mayor número introducido es: " + mayor);
				break;
			}
			else { if (var != 0 | i == 0) {
					String str = JOptionPane.showInputDialog("[0 para finalizar] Introducir número: ");
					var = Integer.parseInt(str);
					if (var < menor && var != 0) {
						menor = var;
					}
					if (var > mayor) {
						mayor = var;
					}
					if (menor == 0) {
						menor = mayor;
					}
				}
			}
		}
	}
}