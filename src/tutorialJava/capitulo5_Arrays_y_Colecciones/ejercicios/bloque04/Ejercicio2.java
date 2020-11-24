package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bloque04;

import java.util.Date;

import javax.swing.JOptionPane;

import tutorialJava.UtilsArrays;

public class Ejercicio2 {


	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;
		
		String str = JOptionPane.showInputDialog("Introduce el mínimo ");
		num1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce el máximo: ");
		num2 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número: ");
		num3 = Integer.parseInt(str);

		int resultado = obtenerNumeroDeUsuarioEntreMinimoYMaximo(num1, num2, num3);
		
		if (num3 >= num1 && num3 <= num2) {
			System.out.println(resultado);
		} else {
			System.out.println("Error");
		}

	}


	/**
	 * Implementa el algoritmo de la buburja para ordenar un array
	 * 
	 * @param array Array desordenado que se ordenará
	 */
	public static int obtenerNumeroDeUsuarioEntreMinimoYMaximo (int num1, int num2, int num3) {

		boolean enLimites = false;
		for (;enLimites == false;) {
			
			
			if (num3 >= num1 && num3 <= num2) {
				enLimites = true;
			
			}
		}
		return obtenerNumeroDeUsuarioEntreMinimoYMaximo(num1, num2, num3);
	}
}
