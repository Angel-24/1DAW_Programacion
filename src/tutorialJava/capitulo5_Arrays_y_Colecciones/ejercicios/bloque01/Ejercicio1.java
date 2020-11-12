package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bloque01;

import javax.swing.JOptionPane;

import tutorialJava.Utils;

public class Ejercicio1 {
	
/*	public static int escogerNumeroAzar () {
		String inferior = JOptionPane.showInputDialog("Escoge el límite inferior");
		Float.parseFloat(inferior);
		String superior = JOptionPane.showInputDialog("Escoge el límite inferior");
		Float.parseFloat(superior);
		return (int) Math.round(Math.random() inferior, superior);
	};
*/	
	/**
	 * Método principal
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declaro las variables implicadas en el programa
		int mayor, menor, suma, min, max;
		min = Integer.parseInt(JOptionPane.showInputDialog("Límite inferior"));
		max = Integer.parseInt(JOptionPane.showInputDialog("Límite superior"));

		// Declaración del array, a través de la sentencia "new"
		int numeros[] = new int[150];
		
		//Preparo un enunciado
		System.out.print("Números obenidos al azar entre " + min + " y " + max + ":\n") ;
		
		// Inicializo el array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Utils.obtenerNumeroAzar(min, max);
		}
		
		// Muestro el array en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(" " + numeros[i]);
		}
/*
		// Comienzo asumiendo que el primer número del array es, al mismo tiempo, el
		// mayor y el menor
		mayor = numeros[0];
		menor = numeros[0];
		suma = numeros[0];
		
		// Una vez he trabajado con el primer elemento del array, recorro a partir de 
		// la posición 1 para descubrir mayores y menores, y calcular la suma
		for (int i = 1; i < numeros.length; i++) {
			suma += numeros[i];
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		
		// Muestro los resultados en consola. Para mostrar la media, la calculo
		System.out.println("\n Mayor: " + mayor + "\n Menor: " + menor + "\n Suma: " + suma +
				"\n Media: " + (suma / (float) numeros.length));
*/
	}

}
