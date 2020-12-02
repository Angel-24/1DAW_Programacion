package tutorialJava.capitulo2_condicionales.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {

		int negativo1 = 0;
		int bajo1 = 0;
		int medio1 = 0;
		int grande1 = 0;
		int negativo2 = 0;
		int bajo2 = 0;
		int medio2 = 0;
		int grande2 = 0;
		int negativo3 = 0;
		int bajo3 = 0;
		int medio3 = 0;
		int grande3 = 0;
		int negativo4 = 0;
		int bajo4 = 0;
		int medio4 = 0;
		int grande4 = 0;
		int negativo5 = 0;
		int bajo5 = 0;
		int medio5 = 0;
		int grande5 = 0;
		int bajoC = 0;
		int medioC = 0;
		int grandeC = 0;

		String str1 = JOptionPane.showInputDialog("Introduzca un número: ");
		int var1 = Integer.parseInt(str1);

		if (var1 > 0) {
			if (var1 <= 25) {
				bajo1 = var1;
				bajoC = bajoC + 1;
			} else {
				if (var1 > 25 && var1 <= 250) {
					medio1 = var1;
					medioC = medioC + 1;
				} else {
					if (var1 > 250) {
						grande1 = var1;
						grandeC = grandeC + 1;
					}
				}
			}

			String str2 = JOptionPane.showInputDialog("Introduzca otro número: ");
			int var2 = Integer.parseInt(str2);

			if (var2 > 0) {
				if (var2 <= 25) {
					bajo2 = var2;
					bajoC = bajoC + 1;
				} else {
					if (var2 > 25 && var2 <= 250) {
						medio2 = var2;
						medioC = medioC + 1;
					} else {
						if (var2 > 250) {
							grande2 = var2;
							grandeC = grandeC + 1;
						}
					}
				}

				String str3 = JOptionPane.showInputDialog("Introduzca un tercer número: ");
				int var3 = Integer.parseInt(str3);

				if (var3 > 0) {
					if (var3 <= 25) {
						bajo3 = var3;
						bajoC = bajoC + 1;
					} else {
						if (var3 > 25 && var3 <= 250) {
							medio3 = var3;
							medioC = medioC + 1;
						} else {
							if (var3 > 250) {
								grande3 = var3;
								grandeC = grandeC + 1;
							}
						}
					}

					String str4 = JOptionPane.showInputDialog("Introduzca el cuarto número: ");
					int var4 = Integer.parseInt(str4);

					if (var4 > 0) {
						if (var4 <= 25) {
							bajo4 = var4;
							bajoC = bajoC + 1;
						} else {
							if (var4 > 25 && var4 <= 250) {
								medio4 = var4;
								medioC = medioC + 1;
							} else {
								if (var4 > 250) {
									grande4 = var4;
									grandeC = grandeC + 1;
								}
							}
						}

						String str5 = JOptionPane.showInputDialog("Introduzca un último número: ");
						int var5 = Integer.parseInt(str5);

						if (var5 > 0) {
							if (var5 <= 25) {
								bajo5 = var5;
								bajoC = bajoC + 1;
							} else {
								if (var5 > 25 && var5 <= 250) {
									medio5 = var5;
									medioC = medioC + 1;
								} else {
									if (var5 > 250) {
										grande5 = var5;
										grandeC = grandeC + 1;
									}
								}
							}
							System.out.println("Números introducidos: " + var1 + ", " + var2 + ", " + var3 + ", " + var4
									+ " y " + var5);
//							int suma_n = negativo1 + negativo2 + negativo3 + negativo4 + negativo5;
							int suma_b = bajo1 + bajo2 + bajo3 + bajo4 + bajo5;
							int suma_m = medio1 + medio2 + medio3 + medio4 + medio5;
							int suma_g = grande1 + grande2 + grande3 + grande4 + grande5;
//							System.out.println("Las sumas de los números negativos son: " + negativo1 + " + " + negativo2 + " + " + negativo3 + " + " + negativo4 + " + " + negativo5 + " = " + suma_n);
							System.out.println("Las sumas de los números entre 0 y 25 son: " + bajo1 + " + " + bajo2
									+ " + " + bajo3 + " + " + bajo4 + " + " + bajo5 + " = " + suma_b);
							System.out.println("Las sumas de los números entre 26 y 250 son: " + negativo1 + " + "
									+ negativo2 + " + " + negativo3 + " + " + negativo4 + " + " + negativo5 + " = "
									+ suma_m);
							System.out.println("Las sumas de los números mayores de 250 son: " + negativo1 + " + "
									+ negativo2 + " + " + negativo3 + " + " + negativo4 + " + " + negativo5 + " = "
									+ suma_g);
						} else {
							System.out.println("Se ha cancelado el programa al introducir un número negativo");
							System.out.println("No se han introducido números positivos...");
						}
					} else {
						System.out.println("Se ha cancelado el programa al introducir un número negativo");
						System.out.println("Se han introducido " + bajoC + " números menores de 25.");
						System.out.println("Se han introducido " + medioC + " números entre 25 y 250.");
						System.out.println("Se han introducido " + grandeC + " números mayores de 250.");
					}
				} else {
					System.out.println("Se ha cancelado el programa al introducir un número negativo");
					System.out.println("Se han introducido " + bajoC + " números menores de 25.");
					System.out.println("Se han introducido " + medioC + " números entre 25 y 250.");
					System.out.println("Se han introducido " + grandeC + " números mayores de 250.");
				}
			} else {
				System.out.println("Se ha cancelado el programa al introducir un número negativo");
				System.out.println("Se han introducido " + bajoC + " números menores de 25.");
				System.out.println("Se han introducido " + medioC + " números entre 25 y 250.");
				System.out.println("Se han introducido " + grandeC + " números mayores de 250.");
			}
		} else {
			System.out.println("Se ha cancelado el programa al introducir un número negativo");
			System.out.println("Se han introducido " + bajoC + " números menores de 25.");
			System.out.println("Se han introducido " + medioC + " números entre 25 y 250.");
			System.out.println("Se han introducido " + grandeC + " números mayores de 250.");
		}
	}
}