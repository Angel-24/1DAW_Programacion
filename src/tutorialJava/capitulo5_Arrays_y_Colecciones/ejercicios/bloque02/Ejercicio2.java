package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bloque02;

import tutorialJava.Utils;

/**
 * Capítulo 5 - Bloque 2 - Ejercicio 1 Realiza un ejercicio que inicialice un
 * array de 150 elementos enteros al azar entre -100 y 100. Debes conseguir que
 * todos los números pares del array cambien de signo, los positivos deben pasar
 * a negativos y viceversa.
 * 
 * En este ejercicio ahondaremos en la creación de métodos que reciben y
 * devuelven arrays.
 */
public class Ejercicio2 {

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = creaInicializaArrayNumerosEnterosAzarEntreLimites1(150, 0, 100);

		// Paso por todos los elementos del array, buscando los de índice par y
		// cambiando su signo
		muestraArray(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) { // El valor es par
				array[i] = -array[i];
			}
		}
		muestraArray(array);
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

		// Paso por cada uno de los elementos del array, inicializándolo con valores al
		// azar
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(limiteInf, limiteSup);
		}

		return array; // Devuelvo el array creado e inicializado.
	}

	public static int[] creaInicializaArrayNumerosEnterosAzarEntreLimites2(int longitud, int limiteInf, int limiteSup) {
		int array[] = new int[longitud]; // Declaración del array

		// Paso por cada uno de los elementos del array, inicializándolo con valores al
		// azar
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(limiteInf, limiteSup);
		}

		return array; // Devuelvo el array creado e inicializado.
		
	}
	public static int[] creaInicializaArrayNumerosEnterosAzarEntreLimites3(int longitud, int limiteInf, int limiteSup) {
		int array[] = new int[longitud]; // Declaración del array

		// Paso por cada uno de los elementos del array, inicializándolo con valores al
		// azar
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
			System.out.print(numeroEnArray + " "); // Muestra el número y un espacio, sin salto de línea
		}
		System.out.println(); // Finalmente introduzco un salto de línea.
	}

}
