package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bloque02;

import tutorialJava.Utils;

public class Ejercicio2 {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int array1[] = creaInicializaArrayNumerosEnterosAzarEntreLimites1(150, 0, 100);

		muestraArray(array1);
		for (int i = 0; i < array1.length; i++) {
//			if (array1[i] % 2 == 1) { // El valor es par
//				array1[i] = -array1[i];
//			}
		}
//		muestraArray(array1);

		int array2[] = creaInicializaArrayNumerosEnterosAzarEntreLimites2(150, 0, 100);

		muestraArray(array2);
		for (int i = 0; i < array2.length; i++) {
//			if (array2[i] % 2 == 0) { // El valor es par
//				array2[i] = -array2[i];
//			}
		}
//		muestraArray(array2);

		int array3[] = creaInicializaArrayNumerosEnterosAzarEntreLimites3(150, 0, 100);

//		muestraArray(array3);
		for (int i = 0; i < array3.length; i++) {
			if (i % 2 != 0) { // Si el valor del índice es impar
				array3[i] = array1[i]; // Se copia el valor del número en el array1
			} else if (i % 2 == 0) { // Si el valor del índice es par
				array3[i] = array2[i]; // Se copia el valor en el array2
			}
		}
		muestraArray(array3);
	}

	/**
	 * Crea e inicializa un array
	 * 
	 * @param longitud  Longitud del array
	 * @param limiteInf Mínimo número que puede aparecer en el interior del array
	 * @param limiteSup Máximo número que puede aparecer en el interior del array
	 * @return Array inicializado.
	 */

	public static int[] creaInicializaArrayNumerosEnterosAzarEntreLimites1(int longitud, int limiteInf, int limiteSup) {
		int array[] = new int[longitud]; // Declaración del array

		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(limiteInf, limiteSup);
		}

		return array;
	}

	public static int[] creaInicializaArrayNumerosEnterosAzarEntreLimites2(int longitud, int limiteInf, int limiteSup) {
		int array[] = new int[longitud]; // Declaración del array

		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(limiteInf, limiteSup);
		}

		return array; // Devuelvo el array creado e inicializado.

	}

	public static int[] creaInicializaArrayNumerosEnterosAzarEntreLimites3(int longitud, int limiteInf, int limiteSup) {
		int array[] = new int[longitud]; // Declaración del array

		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(limiteInf, limiteSup);
		}

		return array; // Devuelvo el array creado e inicializado.
	}

	/**
	 * Método que muestra un array en la consola
	 * 
	 * @param array Recibe un array que va a mostrar en pantalla
	 */

	public static void muestraArray(int array[]) {
		// Recorre el array con un bucle que recibe el nombre de for-each.
		for (int numeroEnArray : array) {
			System.out.print(numeroEnArray + "\t"); // Muestra el número y un espacio, sin salto de línea
		}
		System.out.println("\n"); // Finalmente introduzco un salto de línea.
	}

}
