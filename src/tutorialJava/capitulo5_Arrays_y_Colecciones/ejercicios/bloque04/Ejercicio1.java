package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bloque04;

import java.util.Date;

import javax.swing.JOptionPane;

import tutorialJava.UtilsArrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		int vector[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 1000);

		UtilsArrays.mostrarArray(vector);

		// Mido el tiempo de inicio
		long millisAntesDeLaOrdenacion = new Date().getTime();

		ordenaArrayPorBurbuja(vector);

		// Mido el tiempo después
		long millisDespuesDeLaOrdenacion = new Date().getTime();

		// Muestro el tiempo en millis
		System.out.println("\nEjecución en " + (millisDespuesDeLaOrdenacion - millisAntesDeLaOrdenacion) + " millis\n");

		// Mostramos el resultado
		UtilsArrays.mostrarArray(vector);
	}

	/**
	 * Implementa el algoritmo de la buburja para ordenar un array
	 * 
	 * @param array Array desordenado que se ordenará
	 */
	public static void ordenaArrayPorBurbuja(int array[]) {
		boolean hayIntercambios;
		do {
			hayIntercambios = false;
			// Empieza el algoritmo
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i + 1] < array[i]) {
					// Entonces hago un intercambio
					int aux = array[i + 1];
					array[i + 1] = array[i];
					array[i] = aux;
					hayIntercambios = true;
				}
			}
		} while (hayIntercambios);
	}
}
