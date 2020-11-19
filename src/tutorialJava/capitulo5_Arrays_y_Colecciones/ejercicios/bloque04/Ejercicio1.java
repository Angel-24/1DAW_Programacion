package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bloque04;

import java.util.Date;

import javax.swing.JOptionPane;

import tutorialJava.UtilsArrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int i;
		for (i = 1; i < 5; i++) {
		int parametro[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero"));
		float parametro[i] = Float.parseFloat(JOptionPane.showInputDialog("Introduce un número flotante"));
		}
		media(parametro);
		
		
		// Mostramos el resultado
		System.out.println(parametro);
	}

	
	public static void media(Float[] args) {

		
	
	}
}