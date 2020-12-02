package tutorialJava.capitulo2_condicionales.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {

		String str1 = JOptionPane.showInputDialog("Introduzca un número: ");
		int puntos = Integer.parseInt(str1);

		switch (puntos) {
		case 0:
			System.out.println("Una nota de " + puntos + " puntos se califica como 'Muy deficiente'");
			break;
		case 1:
			System.out.println("Una nota de " + puntos + " puntos se califica como 'Muy deficiente'");
			break;
		case 2:
			System.out.println("Una nota de " + puntos + " puntos se califica como 'Muy deficiente'");
			break;
		case 3:
			System.out.println("Una nota de " + puntos + " puntos se califica como 'Muy deficiente'");
			break;
		case 4:
			System.out.println("Una nota de " + puntos + " puntos se califica como 'Deficiente'");
			break;
		case 5:
			System.out.println("Una nota de " + puntos + " puntos se califica como 'Suficiente'");
			break;
		case 6:
			System.out.println("Una nota de " + puntos + " puntos se califica como 'Suficiente'");
			break;
		case 7:
			System.out.println("Una nota de " + puntos + " puntos se califica como 'Notable'");
			break;
		case 8:
			System.out.println("Una nota de " + puntos + " puntos se califica como 'Notable'");
			break;
		case 9:
			System.out.println("Una nota de " + puntos + " puntos se califica como 'Sobresaliente'");
			break;
		case 10:
			System.out.println("Una nota de " + puntos + " puntos se califica como 'Sobresaliente'");
			break;
		}
	}
}