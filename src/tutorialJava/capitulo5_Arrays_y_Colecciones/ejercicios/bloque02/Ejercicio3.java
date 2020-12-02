package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bloque02;

import javax.swing.JOptionPane;

import tutorialJava.Utils;

public class Ejercicio3 {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int array1[] = creaInicializaArrayNumerosEnterosAzarEntreLimites1(150, 0, 100);

		muestraArray(array1);

		int multiplicar = Integer.parseInt(JOptionPane.showInputDialog("Multiplicar los números del array por: "));

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] >= 0) {
				array1[i] = array1[i] * multiplicar;
			}
		}
		muestraArray(array1);
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
