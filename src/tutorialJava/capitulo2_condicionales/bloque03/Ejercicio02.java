package tutorialJava.capitulo2_condicionales.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		String str;
		double num1;
		double num2;
		double resultado;
		
		String menu = JOptionPane.showInputDialog("¿Qué tipo de operación va a realizar?"
				+ "\n(Raíz, Potencia, División)");
/*		eleccion = (menu);
		if (menu == "Raíz") {
			eleccion = 1;
		} else {
			if (menu == "Potencia") {
				eleccion = 2;
			} else {
				if (menu == "División") {
					eleccion = 3;
				}
			}
		}
*/
		switch (menu) {
		case "Raíz":
			str = JOptionPane.showInputDialog("Realizar la raíz de: ");
			num1 = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("Con exponente: ");
			num2 = Integer.parseInt(str);
			resultado = Math.pow(num1, (1 / num2));
			System.out.println("La raíz cuadrada de " + resultado);
			break;
		case "Potencia":
			str = JOptionPane.showInputDialog("Elevar el número __ ...");
			num1 = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("... a la potencia _.");
			num2 = Integer.parseInt(str);
			resultado = Math.pow(num1, num2);
			System.out.println(num1 + "^" + num2 + " = " + resultado);
			break;
		case "División":
			str = JOptionPane.showInputDialog("Mostrar el resto obtenido al dividir __ ...");
			num1 = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("... entre _.");
			num2 = Integer.parseInt(str);
			resultado = num1 % num2;
			System.out.println("El resto de la operación: " + num1 + " / " + num2 + "es: " + resultado);
			break;
		}
	}
}