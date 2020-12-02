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
public class Ejercicio3 {

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaro las variables implicadas en el programa
		int buscar = Integer.parseInt(JOptionPane.showInputDialog("Buscar número: "));
		boolean encontrado = false;
//		int pos = 0;
		// Declaración del array, a través de la sentencia "new"
		int numeros[] = new int[150];

		// Preparo un enunciado
		System.out.print("Números generados: \n");

		// Inicializa el array, busca coincidencias con la variable buscar y lo muestra
		// en pantalla
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Utils.obtenerNumeroAzar();
			int variable = numeros[i];
			System.out.print("\n " + numeros[i]);
			if (variable == buscar) {
				System.out.println("   <--- ¡Número encontrado!");
//				System.out.println("\n \nSe ha encontrado el número " + buscar + " en la posición: " + pos);
				encontrado = true;
//				pos = i;
			}

//                  *Caos absoluto* - Han habido varios intentos de estructurar el código de una forma específica cada vez... Una pequeña parte del contenido erróneo o irrelevante de los intentos fallidos anteriores	no es borrado, sino comentado en su posición exacta, lo que funciona como un registro para su posterior revisión de la mayoría de intentos que podrían haber tenido éxito.
//					Es decir, los intentos fallidos que me parecieron buena idea los comento, no los borro, para luego revisar cada idea.			
//					Esto genera un desorden que irónicamente hace el resto del código aún más difícil de leer y explicar con comentarios. (Sí, debería quitarme esta manía).
//				
			/*
			 * } for (int i = 0; encontrado == true; i++) { if (i == 0) {
			 * System.out.println("\n \nSe ha encontrado el número " + buscar +
			 * " en la posición: " + pos); break; }
			 */
//			System.out.println(pos[i]);
		}
		if (encontrado == false) {
			System.out.println("\n \nEl número " + buscar + " no se ha encontrado...");
		} else if (encontrado == true) {
			System.out.println("\n \nSe ha señalado el número " + buscar + " más arriba.");
		}
	}
}
