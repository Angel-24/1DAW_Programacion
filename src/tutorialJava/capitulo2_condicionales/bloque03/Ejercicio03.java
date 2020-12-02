package tutorialJava.capitulo2_condicionales.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		int menu1 = 1;
		String menu = "1";
		int reiniciar = 0;

		while (menu1 != 0 && reiniciar == 0) {
			double num1 = 0;
			double num2 = 0;
			double resultado = 0;
			String str;
			menu = JOptionPane.showInputDialog("Elige el número del tipo de operación que vas a realizar: "
					+ "\n1. Hipotenusa de un Triángulo" + "\n2. Superficie de Circunferencia"
					+ "\n3. Perímetro de Circunferencia" + "\n4. Área de un Rectángulo" + "\n5. Área de un Triángulo");

			switch (menu) {
			case "1":
				str = JOptionPane.showInputDialog("Longitud del Cateto A");
				num1 = Double.parseDouble(str);
				str = JOptionPane.showInputDialog("Longitud del Cateto B");
				num2 = Double.parseDouble(str);
				resultado = (Math.pow(num1, 2)) + (Math.pow(num2, 2));
				System.out.println("La hipotenusa del triángulo es: " + resultado);
				break;
			case "2":
				str = JOptionPane.showInputDialog("Longitud del radio de la circunferencia");
				num1 = Double.parseDouble(str);
				resultado = (Math.pow(num1, 2)) * 3.1416;
				System.out.println("La superficie de la circunferencia es: " + resultado);
				break;
			case "3":
				str = JOptionPane.showInputDialog("Longitud del radio de la circunferencia");
				num1 = Double.parseDouble(str);
				resultado = num1 * (2 * 3.1416);
				System.out.println("El perímetro de la circunferencia es: " + resultado);
				break;
			case "4":
				str = JOptionPane.showInputDialog("La longitud de la base del rectángulo");
				num1 = Double.parseDouble(str);
				str = JOptionPane.showInputDialog("La longitud de la altura del rectángulo");
				num2 = Double.parseDouble(str);
				resultado = num1 * num2;
				System.out.println("El área del rectángulo es: " + resultado);
				break;
			case "5":
				str = JOptionPane.showInputDialog("La longitud de la base del triángulo");
				num1 = Double.parseDouble(str);
				str = JOptionPane.showInputDialog("La longitud de la altura del triángulo");
				num2 = Double.parseDouble(str);
				resultado = (num1 * num2) / 2;
				System.out.println("El área del triángulo es: " + resultado);
				break;
			case "0":
				menu1 = 0;
				break;
			}
			reiniciar = JOptionPane.showInternalConfirmDialog(null, "¿Reiniciar?");
		}
	}
}