package tutorialJava.capitulo6.wrappers;

import java.util.Scanner;

public class caracteres {

	private static String a;
	private static String palabra;
	private static int n;
	private static boolean condicion = false;
	private static boolean mayuscula = false;
	private static boolean minuscula = false;
	private static boolean digito = false;
	private static boolean simbolo = false;

	public caracteres() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		for (n=1; condicion==false; n++) {
			
			System.out.println("\nIntento Nº" + n);
			
			enunciado();
			
			escaner();
			
			if (condicion == true && n>=1) System.out.println("\n[Nivel de seguridad:  *Válido*]");
			else if (condicion == false && n>=1) System.out.println("\n[Nivel de seguridad:  *Insuficiente*]\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

		}
		
		cerrar();
		
	}

	public static void cerrar(){
		
		System.out.println("\n[Cerrando el programa...]");
		
	}
	
	public static void enunciado(){

		System.out.println("\n  Requisitos: ");
		System.out.println("·Una mayúscula");
		System.out.println("·Una minúscula");
		System.out.println("·Un dígito");
		System.out.println("·Un caracter no alfanumérico");
		System.out.println("\n\n\n   Contraseña: ");
		
	}
	
	public static void escaner() {
		
		Scanner a = new Scanner(System.in);
		palabra = a.nextLine();

		char cadenaTexto[] = palabra.toCharArray();
		
		for (int i = 0; i < cadenaTexto.length; i++) {
			
//			if (Character.isLetter(cadenaTexto[i]) == true) condicion++;
			if (Character.isDigit(cadenaTexto[i]) == true) digito=true;
			if (Character.isLetterOrDigit(cadenaTexto[i]) == false) simbolo=true;
			if (Character.isLowerCase(cadenaTexto[i]) == true) minuscula=true;
			if (Character.isUpperCase(cadenaTexto[i]) == true) mayuscula=true;
			
			if (digito && simbolo && minuscula && mayuscula) condicion = true;

		}
		
	}
	
}
