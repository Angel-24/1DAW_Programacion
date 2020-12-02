package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bloque02;

import javax.swing.JOptionPane;

import tutorialJava.Utils;

public class Ejercicio6 {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int pos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas posiciones se van a despalazar?"));
		int dir = JOptionPane.showOptionDialog(null, null, "¿Desplazar a la derecha?", 0, 1, null, null, null);
		boolean derecha = false;
		if (dir == 0) {
			derecha = true;
		} else if (dir == 1) {
			derecha = false;
		}

		int array[] = creaInicializaArrayNumerosEnterosAzarEntreLimites(5, 0, 100);

		muestraArray(array);

		for (int j = 0; j < pos; j++) {

			if (derecha == true) {
				int aux = array[array.length - 1];
				for (int i = array.length - 1; i > 0; i--) {
					array[i] = array[i - 1];
				}
				array[0] = aux;
			}

			else if (derecha == false) {
				int aux = array[array.length - array.length];
				for (int i = 0; i < 4; i++) {
					array[i] = array[i + 1];
				}
				array[array.length - 1] = aux;
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

	public static int[] creaInicializaArrayNumerosEnterosAzarEntreLimites(int longitud, int limiteInf, int limiteSup) {
		int array[] = new int[longitud]; // Declaración del array

		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(limiteInf, limiteSup);
		}

		return array;
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
