package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bloque03;

import java.util.Date;

import tutorialJava.UtilsArrays;

/**
 * Capítulo 5 - Bloque 3 - Ejercicio 1 Realiza un ejercicio que inicialice un
 * array de 150 elementos enteros al azar entre 0 y 1.000. Una vez que lo hayas
 * conseguido debes realizar implementar el algoritmo de ordenación llamado
 * "Burbuja", con el objetivo de ordenar el array completamente. Puedes
 * consultar el siguiente http://lwh.free.fr/pages/algo/tri/tri_bulle_es.html
 */
public class Ejercicio4 {

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int vector[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 1000);

		UtilsArrays.mostrarArray(vector);

		// Mido el tiempo de inicio
		long millisAntesDeLaOrdenacion = new Date().getTime();

		selection(vector, 150);

		// Mido el tiempo después
		long millisDespuesDeLaOrdenacion = new Date().getTime();

		// Muestro el tiempo en millis
		System.out.println("\nEjecución en " + (millisDespuesDeLaOrdenacion - millisAntesDeLaOrdenacion) + " millis\n");

		// Mostramos el resultado
		UtilsArrays.mostrarArray(vector);
	}

	public static void selection(int vector[], int taille) {
		int actual, mas_pequeno, j, temp;

		for (actual = 0; actual < taille - 1; actual++) {
			mas_pequeno = actual;
			for (j = actual + 1; j < taille; j++)
				if (vector[j] < vector[mas_pequeno])
					mas_pequeno = j;
			temp = vector[actual];
			vector[actual] = vector[mas_pequeno];
			vector[mas_pequeno] = temp;
		}
	}
}