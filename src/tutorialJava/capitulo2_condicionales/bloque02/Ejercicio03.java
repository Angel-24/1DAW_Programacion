package tutorialJava.capitulo2_condicionales.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {

		String str1 = JOptionPane.showInputDialog("Introduzca un número: ");
		int var1 = Integer.parseInt(str1);
		String str2 = JOptionPane.showInputDialog("Introduzca otro número: ");
		int var2 = Integer.parseInt(str2);
		String str3 = JOptionPane.showInputDialog("Introduzca un tercer número: ");
		int var3 = Integer.parseInt(str3);
		String str4 = JOptionPane.showInputDialog("Introduzca el cuarto número: ");
		int var4 = Integer.parseInt(str4);
		String str5 = JOptionPane.showInputDialog("Introduzca un último número: ");
		int var5 = Integer.parseInt(str5);
		System.out.println("Números introducidos: " + var1 + ", " + var2 + ", " + var3 + ", " + var4 + " y " + var5);

		if (var1 > var2 && var1 > var2 && var1 > var4 && var1 > var5) {
			System.out.println(var1 + " es el mayor.");
		} else {
			if (var2 > var1 && var2 > var3 && var2 > var4 && var2 > var5) {
				System.out.println(var2 + " es el mayor.");
			} else {
				if (var3 > var1 && var3 > var2 && var3 > var4 && var3 > var5) {
					System.out.println(var3 + " es el mayor.");
				} else {
					if (var4 > var1 && var4 > var2 && var4 > var3 && var4 > var5) {
						System.out.println(var4 + " es el mayor.");
					} else {
						if (var5 > var1 && var5 > var2 && var5 > var3 && var5 > var4) {
							System.out.println(var5 + " es el mayor.");
						}
					}
				}
			}
			/*
			 * int var11 = var2 | var3 | var4 | var5; int var22 = var1 | var3 | var4 | var5;
			 * int var33 = var2 | var1 | var4 | var5; int var44 = var2 | var3 | var1 | var5;
			 * int var55 = var2 | var3 | var4 | var1; if (var1 > var11) {
			 * System.out.println(var1 + " es el mayor."); } else { if (var2 > var22) {
			 * System.out.println(var2 + " es el mayor."); } else { if (var3 > var33) {
			 * System.out.println(var3 + " es el mayor."); } else { if (var4 > var44) {
			 * System.out.println(var4 + " es el mayor."); } else { if (var5 > var55) {
			 * System.out.println(var5 + " es el mayor."); } } }
			 */
		}
	}
}