package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bolos;

import javax.swing.JOptionPane;

import tutorialJava.Utils;

public class bolos {

	public static void main(String[] args) {
		
		int array[] = new int[1];
		int lanzar = 0;

		for (int i = 0; lanzar == 0 && i < 2; i++) {
		
			array = creaArrayBolos(10, 1, 1);
		
			mostrarArray(array);
		
			lanzar = JOptionPane.showConfirmDialog(null, null, "Lanzar" , 0, 2);
		
		}
	}
	
	public static void mostrarArray(int[] array) {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n ___________________   ___________\n| |\\__  _______  __/| |_  ________\n| | \\/_/_______\\_\\/ | |/_/________\n| | |#|         |#| | |#|");
		for (int i = 0; i <= array.length; i++) {
			if (i == 0) {
				System.out.print("| | |#| " + array[i]);
			}
			if (i == 1) {
				System.out.print(" " + array[i]);
			}
			if (i == 2) {
				System.out.print(" " + array[i]);
			}
			if (i == 3) {
				System.out.print(" " + array[i] + " |#| | |#| 1 1 1 1\n| | |#|" );
			}
			if (i == 4) {
				System.out.print("  " + array[i]);
			}
			if (i == 5) {
				System.out.print(" " + array[i]);
			}
			if (i == 6) {
				System.out.print(" " + array[i] + "  |#| | |#|  1 1 1\n| | |#|  ");
			}
			if (i == 7) {
				System.out.print(" " + array[i]);
			}
			if (i == 8) {
				System.out.print(" " + array[i] + "   |#| | |#|   1 1\n| | |#|   ");
			}
			if (i == 9) {
				System.out.print(" " + array[i] + "    |#| | |#|    1\n| | |#|         |#| | |#|\n| | |#|         |#| | |#|\n| | |#|         |#| | |#|\n| | |#|         |#| | |#|\n| | |#|         |#| | |#|\n| | |#|         |#| | |#|\n \\_\\|#|         |#| | |#|\n");
			}
//			else if (i != 1 && i != 4 ) System.out.print(array[i] + " ");
		}
	}

	public static int[] creaArrayBolos(int longitud, int limInf, int limSup) {
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(limInf, limSup);
		}
		return array;
	}
}