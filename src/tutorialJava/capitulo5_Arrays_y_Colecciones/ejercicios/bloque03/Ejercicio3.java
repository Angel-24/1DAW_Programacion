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
public class Ejercicio3 {

	/**
	 * Método principal
	 * @param args
	 */
	public static void main(String[] args) {
		int vector[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 1000);
		
		UtilsArrays.mostrarArray(vector);
		
		// Mido el tiempo de inicio
		long millisAntesDeLaOrdenacion = new Date().getTime();
		
		
		shell(vector);
		
		
		// Mido el tiempo después
		long millisDespuesDeLaOrdenacion = new Date().getTime();
		
		// Muestro el tiempo en millis
		System.out.println("\nEjecución en " + (millisDespuesDeLaOrdenacion - millisAntesDeLaOrdenacion) + " millis\n");
		
		// Mostramos el resultado
		UtilsArrays.mostrarArray(vector);
	}
	
	
	static void tri_insertion(int t[], int gap, int debut) {
	    int j,en_cours;
	    for (int i = gap + debut; i < 150; i+=gap) {
	        en_cours = t[i];
	        for (j = i; j >= gap && t[j - gap] > en_cours; j-=gap) {
	            t[j] = t[j - gap];
	        }
	        t[j] = en_cours;
	    }
	}
	 
	static void shell(int t[]) {
	    int intervalles[]={6,4,3,2,1};
	    for (int ngap=0;ngap<5;ngap++) {
	        for (int i=0;i<intervalles[ngap];i++)
	            tri_insertion(t,intervalles[ngap],i);
	    }
	}
}