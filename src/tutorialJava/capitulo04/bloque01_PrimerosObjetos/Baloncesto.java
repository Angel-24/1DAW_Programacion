package tutorialJava.capitulo04.bloque01_PrimerosObjetos;

import tutorialJava.Utils;

public class Baloncesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		creaArrayNumerosUsuario(CromoBaloncesto);

	}

	public static int[] creaArrayNumerosUsuario(int longitud) {
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerEntero();
		}
		return array;
	}

}
