package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bloque01;

import tutorialJava.Utils;

/**
 * Capítulo 5 - Bloque 1 - Ejercicio 0.
 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
 * Debes mostrar el array en pantalla y obtener la suma, la media, el menor y el mayor de todos 
 * los números que aparecen en el array.
 *
 */
public class Ejercicio2 {
	
	/**
	 * Método principal
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaro las variables implicadas en el programa
		int mayor, menor, suma;

		// Declaración del array, a través de la sentencia "new"
		int numeros[] = new int[150];
		
		//Preparo un enunciado
		System.out.print("Números al azar: \n");
		
		// Inicializo el array y lo muestro en pantalla
		for (int i = numeros.length - 1 ; i >= 0; i--) {
			numeros[i] = Utils.obtenerNumeroAzar();
			System.out.print(" " + numeros[i]);
		}
		System.out.println("\n");
		// Muestro el array en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(" " + numeros[i]);
		}
	}
}
