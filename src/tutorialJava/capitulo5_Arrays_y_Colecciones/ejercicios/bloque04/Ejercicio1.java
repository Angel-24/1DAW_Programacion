package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bloque04;

import java.util.Date;

import javax.swing.JOptionPane;

import tutorialJava.UtilsArrays;

public class Ejercicio1 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;
		float num4;

		String str = JOptionPane.showInputDialog("Introduce un número: ");
		num1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce otro número: ");
		num2 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número más: ");
		num3 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número flotante: ");
		num4 = Integer.parseInt(str);

		float resultado = media(num1, num2, num3, num4);

		System.out.println(resultado);

	}

	/**
	 * Implementa el algoritmo de la buburja para ordenar un array
	 * 
	 * @param array Array desordenado que se ordenará
	 */
	public static float media(int num1, int num2, int num3, float num4) {

//		String varstr = JOptionPane.showInputDialog("Variable");
//		int var = Integer.parseInt(varstr);

		float vector = num1 + num2 + num3 + num4;
		float media = vector / 4;

		return media;
	}
}
