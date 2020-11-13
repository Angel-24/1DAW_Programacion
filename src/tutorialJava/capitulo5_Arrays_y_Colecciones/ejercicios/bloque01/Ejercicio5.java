package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bloque01;

import javax.swing.JOptionPane;

import tutorialJava.Utils;

/**
 * Capítulo 5 - Bloque 1 - Ejercicio 0. Realiza un ejercicio que inicialice un
 * array de 150 elementos enteros al azar entre 0 y 100. Debes mostrar el array
 * en pantalla y obtener la suma, la media, el menor y el mayor de todos los
 * números que aparecen en el array.
 *
 */
public class Ejercicio5 {

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

// Declaro las variables implicadas en el programa

		int suma = 0;

// Declaración del array, a través de "new"

		int numeros[] = new int[150];

// Preparo un enunciado

		System.out.print(" Números generados: \n\n");

// Inicializa el array, muestra en pantalla los números generados.

		for (int i = 1; i < numeros.length; i++) {
			numeros[i] = Utils.obtenerNumeroAzar();
			int variable = numeros[i];

//		Si el resto de la división entre 2 del índice de ejecución del array es igual a 0, el valor del número se añadirá a la suma. Si no, seŕa ignorado.

			if (i % 2 == 0) {
				suma = suma + variable;
				System.out.println("   " + numeros[i] + "   ha sido añadido a la suma\n");
			} else
				System.out.println("   " + numeros[i] + "    no se añadirá a la suma\n");

//		Una vez fuera del bucle for, se muestra en pantalla el resultado de las sumas de los números pares e impares.
//		Sí, lo podría haber hecho con una sóla bandera, por ejemplo. Pero me gusta así.
		}
		System.out.println("\n La suma de los números pares es: " + suma);
	}
}