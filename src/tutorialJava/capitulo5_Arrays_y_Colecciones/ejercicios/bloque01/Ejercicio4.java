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
public class Ejercicio4 {

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
// Declaro las variables implicadas en el programa

		boolean espar;
		boolean esimpar;
		
// Declaración del array, a través de "new"
		
		int numeros[] = new int[150];
		int pares = 0;
		int impares = 0;

// Preparo un enunciado
		
		System.out.print("Números generados: \n");

// Inicializa el array, muestra en pantalla los números generados, reinicia los valores de las banderas que determinan si son números pares o impares. Luego realiza operaciones dependiendo de si el número es par o impar.

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Utils.obtenerNumeroAzar();
			espar = false;
			esimpar = false;
			int variable = numeros[i];
			
//		Si el resto de la división entre 2 del último número generado por el array es igual a 0, se considerará par. Si no, es considerado impar.

			if (variable == 24) {
				espar = true;
				System.out.println(numeros[i] + " es par... (y también es mi número de la suerte)");
			} else if (variable % 2 == 0) {
				espar = true;
				System.out.println(numeros[i] + " es un número par");
			} else {
				esimpar = true;
				System.out.println(numeros[i] + " es un número impar");
			}
			
//		Si el último número generado por el array es par, se añadirá sólo al valor total de números pares. Lo mismo para los impares.

			if (espar == true) {
				pares = pares + variable;
			} else if (esimpar == true) {
				impares = impares + variable;
			}
		}
		
//		Una vez fuera del bucle for, se muestra en pantalla el resultado de las sumas de los números pares e impares.
//		Sí, lo podría haber hecho con una sóla bandera, por ejemplo. Pero me gusta así.
		System.out.println("\nLa suma de los números pares es: " + pares + "\nLa suma de los números impares es: " + impares);
	}
}