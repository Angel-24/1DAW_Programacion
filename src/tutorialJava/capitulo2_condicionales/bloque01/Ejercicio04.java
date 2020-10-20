package tutorialJava.capitulo2_condicionales.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio04 {

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

		if (var1 < var2 && var1 < var2 && var1 < var4 && var1 < var5) {
			System.out.println(var1 + " es el menor.");
		} else {
			if (var2 < var1 && var2 < var3 && var2 < var4 && var2 < var5) {
				System.out.println(var2 + " es el menor.");
			} else {
				if (var3 < var1 && var3 < var2 && var3 < var4 && var3 < var5) {
					System.out.println(var3 + " es el menor.");
				} else {
					if (var4 > var1 && var4 < var2 && var4 < var3 && var4 < var5) {
						System.out.println(var4 + " es el menor.");
					} else {
						if (var5 < var1 && var5 < var2 && var5 < var3 && var5 < var4) {
							System.out.println(var5 + " es el menor.");
						}
					}
				}
			}
		}
	}
}