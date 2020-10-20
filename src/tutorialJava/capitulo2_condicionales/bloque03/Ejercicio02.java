package tutorialJava.capitulo2_condicionales.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		double num3;
		
		String menu = JOptionPane.showInputDialog("¿Qué tipo de operación va a realizar?");
		int eleccion = Integer.parseInt(menu);
		
		switch (eleccion) {
		case 1:
			String str1 = JOptionPane.showInputDialog("Realizar la raíz cuadrada de: ");
			num1 = Integer.parseInt(str1);
			Math.sqrt(num1);
			break;
		case 2:

			break;
		case 3:
//			System.out.println("Una nota de " + puntos + " puntos se califica como 'Muy deficiente'");
			break;
		}
	}
}