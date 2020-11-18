package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bloque03;

import java.util.Date;

import tutorialJava.UtilsArrays;

/**
 * Capítulo 5 - Bloque 3 - Ejercicio 1
 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 1.000. 
 * Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación llamado 
 * "Burbuja", con el objetivo de ordenar el array completamente. Puedes consultar el siguiente
 * http://lwh.free.fr/pages/algo/tri/tri_bulle_es.html
 */
public class Ejercicio2 {

	/**
	 * Método principal
	 * @param args
	 */
	public static void main(String[] args) {
		int vector[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 1000);
		
		UtilsArrays.mostrarArray(vector);
		
		// Mido el tiempo de inicio
		long millisAntesDeLaOrdenacion = new Date().getTime();
		
		
		Insertion_sort(vector);
		
		
		// Mido el tiempo después
		long millisDespuesDeLaOrdenacion = new Date().getTime();
		
		// Muestro el tiempo en millis
		System.out.println("\nEjecución en " + (millisDespuesDeLaOrdenacion - millisAntesDeLaOrdenacion) + " millis\n");
		
		// Mostramos el resultado
		UtilsArrays.mostrarArray(vector);
	}
	
	
	public static void Insertion_sort(int t[]) {
	    int i, j;
	    int actual;
	 
	    for (i = 1; i < t.length; i++) {
	        actual = t[i];
	        for (j = i; j > 0 && t[j - 1] > actual; j--) {
	            t[j] = t[j - 1];
	        }
	        t[j] = actual;
	    }
	}
}