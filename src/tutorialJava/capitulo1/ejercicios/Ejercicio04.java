package tutorialJava.capitulo1.ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		
		String str = JOptionPane.showInputDialog("Introduce un número: ");
		num1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce otro número: ");
		num2 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número más: ");
		num3 = Integer.parseInt(str);
		
		float media = (num1 + num2 + num3)/3;
		
		System.out.println("La media es: " + media);	

	}

}
