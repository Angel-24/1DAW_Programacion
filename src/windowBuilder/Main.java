package windowBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		menuPrincipal();
	}

	
	/**
	 * 
	 */
	private static void menuPrincipal() {

		int opcionElegida;
		do {
			System.out.println("\n\t\t\tGESTI�N DE VENTAS DE COCHES");
			
			System.out.println("\n\t1.- Gesti�n de fabricantes.");
			System.out.println("\t2.- Gesti�n de ___________.");
			System.out.println("\t3.- Gesti�n de ___________.");
			System.out.println("\t4.- Gesti�n de ___________.");
			System.out.println("\t5.- Gesti�n de ___________.");
			System.out.println("\t0.- Salir");
			System.out.println("\n\tElija una opci�n: ");
			
			opcionElegida = Utils.getIntConsola(0, 5);
			
			switch (opcionElegida) {
			case 0:
				System.out.println("\n!Qu� tenga un feliz d�a!");
				break;
			case 1:
				GestionFabricante.menuGestion();
			}
		} while (opcionElegida != 0);
	}
	
}
