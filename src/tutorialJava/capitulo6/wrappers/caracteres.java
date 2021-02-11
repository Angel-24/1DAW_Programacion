package tutorialJava.capitulo6.wrappers;

import java.util.Scanner;

public class caracteres {

	private static String a;
	private static String palabra;
	private static int n;

	public caracteres() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		for (n=1;n>0;n++) {

			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nIntento Nº" + n);
			
			enunciado();
			
			escaner();
			
		}
		
		cerrar();
		
	}

	public static void cerrar(){
		
	}
	
	public static void enunciado(){

		System.out.println("\n   Requisitos: ");
		System.out.println("·Una mayúscula");
		System.out.println("·Una minúscula");
		System.out.println("·Un dígito");
		System.out.println("·Un caracter no alfanumérico");
		System.out.println("\n   Contraseña: \n");
		
	}
	
	public static void escaner() {
		
		int condicion = 0;

		Scanner a = new Scanner(System.in);
		palabra = a.nextLine();

		char cadenaTexto[] = palabra.toCharArray();
		
		for (int i = 0; i < cadenaTexto.length; i++) {
			if (Character.isDigit(cadenaTexto[i]) == true) condicion++;
			if (Character.isLetter(cadenaTexto[i]) == true) condicion++;
			if (Character.isLetterOrDigit(cadenaTexto[i]) == false) condicion++;
			if (Character.isLowerCase(cadenaTexto[i]) == true) condicion++;
			if (Character.isUpperCase(cadenaTexto[i]) == true) condicion++;
			
			System.out.println(condicion);
		}
		
	}
	
}
