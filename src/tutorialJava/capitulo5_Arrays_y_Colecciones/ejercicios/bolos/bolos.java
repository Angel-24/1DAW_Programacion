package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bolos;

import javax.swing.JOptionPane;

import tutorialJava.Utils;

public class bolos {

	public static void main(String[] args) {


		int puntuacionJ1 = 0;
		int jugadores = JOptionPane.showConfirmDialog(null,
				" < Escoge el número de Jugadores >   \n\n                  1 J.       2 J.\n                   ↓          ↓",
				"Modo de Juego", 0, 2);

		for (int modo = 0; modo <= jugadores; modo++) {

			int[] array = new int[1];
			String tutorial = null;
			if (jugadores == 0) {
				tutorial = "              (<Esc> = Salir del programa)\n              (<Espacio> = Lanzar la bola)\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
			}
			if (jugadores == 1) {
				tutorial = "              (<Esc> = Salir del programa)\n              (<Espacio> = Lanzar la bola)\n\n"
						+ "                 Turno del Jugador 1  \n\n\n\n\n\n\n\n\n\n\n\n";
			}
			if (jugadores == 1 && modo == 1) {
				tutorial = "              (<Esc> = Salir del programa)\n              (<Espacio> = Lanzar la bola)\n\n"
						+ "                 Turno del Jugador 2  \n\n\n\n\n\n\n\n\n\n\n";
			}
			String intento = tutorial;
			int lanzar = 0;
			int cae = 0;
			int j;
			int puntuacion = 0;
			
			array = creaArrayBolos(10, 1, 1);
			
//		System.out.println("Primer Intento:");

			mostrarArray(array, intento, puntuacion, tutorial, modo, jugadores, puntuacionJ1);

			for (int i = 0; lanzar == 0 && i < 2; i++) {

				if (i == 0) {
					intento = " Último intento:";
					lanzar = JOptionPane.showConfirmDialog(null, "                [  Primera Bola  ]", "¡Lanzar!", -1,
							-1);
				}

				if (i == 1) {
					intento = " Puntuación:";
					lanzar = JOptionPane.showConfirmDialog(null, "                [  Segunda Bola  ]", "¡Lanzar!", -1,
							-1);
				}
				

				if (jugadores == 1 && modo == 1 && i == 1) {
					tutorial = "              (<Esc> = Salir del programa)\n              (<Espacio> = Lanzar la bola)\n\n"
							+ "\n\n\n\n\n\n\n\n\n\n\n";
				}
				
//			animarArray(array, intento, puntuacion);
				j = 0;
				for (j = 0; j < 10; j++) {

					cae = probabilidad(array, cae);
					if (cae == 1 && array[j] == 1) {
						array[j] = 0;
						cae = 0;
						puntuacion = puntuacion + 1;
						if  (modo == 0 && jugadores == 1) {
							puntuacionJ1 = puntuacion;
						}
					}
				}

				if (lanzar == -1) {
					break;
				}
				if (i == 1 && modo == 0) {
					intento = " Puntuación:";
					lanzar = JOptionPane.showConfirmDialog(null, "          [  El jugador 1 ha terminado su turno  ]        ", "Continuar", -1,
							-1);
				}
				mostrarArray(array, intento, puntuacion, tutorial, modo, jugadores, puntuacionJ1);
			}
		}
	}

//########################################################################################################

	public static void mostrarArray(int[] array, String intento, int puntuacion, String tutorial, int modo,
		int jugadores, int puntuacionJ1) {

		for (int i = 0; i <= array.length; i++) {
			if (i == 0) {
				if (intento == " Puntuación:" && puntuacion >= 10 && jugadores == 0) {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + tutorial + intento
							+ "   ¡¡¡PLENO!!!"
							+ "\n_________________________________________\n ___________________   ______________   _\n| |\\__  _______  __/| |  _______  __/| |\n| | \\/_/_______\\_\\/ | |_/_______\\_\\/ | |\n| | |#|         |#| | |#|       |#|  | |");
				} else if (intento == " Puntuación:" && puntuacion < 10 && jugadores == 0) {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + tutorial + intento + "   "
							+ (puntuacion)
							+ "\n_________________________________________\n ___________________   ______________   _\n| |\\__  _______  __/| |  _______  __/| |\n| | \\/_/_______\\_\\/ | |_/_______\\_\\/ | |\n| | |#|         |#| | |#|       |#|  | |");
				}
				if (intento != " Puntuación:" && jugadores == 0) {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + tutorial
							+ "\n_________________________________________\n ___________________   ______________   _\n| |\\__  _______  __/| |  _______  __/| |\n| | \\/_/_______\\_\\/ | |_/_______\\_\\/ | |\n| | |#|         |#| | |#|       |#|  | |");
				}
				if (intento == " Puntuación:" && puntuacion >= 10 && jugadores == 1) {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + tutorial + intento + "   "
							+ (puntuacionJ1)  + "  [Jugador 1]" + "\n" + intento
							+ "   ¡¡¡PLENO!!!" + "  [Jugador 2]"
							+ "\n_________________________________________\n ___________________   ______________   _\n| |\\__  _______  __/| |  _______  __/| |\n| | \\/_/_______\\_\\/ | |_/_______\\_\\/ | |\n| | |#|         |#| | |#|       |#|  | |");
				} else if (intento == " Puntuación:" && puntuacion < 10 && jugadores == 1) {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + tutorial + intento + "   "
							+ (puntuacionJ1)  + "  [Jugador 1]" + "\n" + intento + "   "
									+ (puntuacion) + "  [Jugador 2]"
							+ "\n_________________________________________\n ___________________   ______________   _\n| |\\__  _______  __/| |  _______  __/| |\n| | \\/_/_______\\_\\/ | |_/_______\\_\\/ | |\n| | |#|         |#| | |#|       |#|  | |");
				}
				if (intento != " Puntuación:" && jugadores == 1) {
					intento = "Puntuación:";
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + tutorial + intento + "   "
							+ (puntuacionJ1)  + "  [Jugador 1]" + "\n"
							+ "\n_________________________________________\n ___________________   ______________   _\n| |\\__  _______  __/| |  _______  __/| |\n| | \\/_/_______\\_\\/ | |_/_______\\_\\/ | |\n| | |#|         |#| | |#|       |#|  | |");
				}

				System.out.print("| | |#| " + array[i]);
			}
			if (i == 1) {
				System.out.print(" " + array[i]);
			}
			if (i == 2) {
				System.out.print(" " + array[i]);
			}
			if (i == 3) {
				System.out.print(" " + array[i] + " |#| | |#|       |#|  | |\n| | |#|");
			}
			if (i == 4) {
				System.out.print("  " + array[i]);
			}
			if (i == 5) {
				System.out.print(" " + array[i]);
			}
			if (i == 6) {
				System.out.print(" " + array[i] + "  |#| | |#|       |#|  | |\n| | |#|  ");
			}
			if (i == 7) {
				System.out.print(" " + array[i]);
			}
			if (i == 8) {
				System.out.print(" " + array[i] + "   |#| | |#|       |#|  | |\n| | |#|   ");
			}
			if (i == 9) {
				System.out.print(" " + array[i] + "    |#| | |#|       |#|  | |\n"
						+ "| | |#|         |#| | |#|       |#|  | |\n" + "| | |#|         |#| | |#|       |#|  | |\n"
						+ "| | |#|         |#| | |#|       |#|  | |\n" + "| | |#|         |#| | |#|       |#|  | |\n"
						+ "| | |#|         |#| | |#|       |#|  | |\n" + "| | |#|         |#| | |#|       |#|  / /\n"
						+ "\\_\\_|#|         |#| | |#|       |#|_/_/" + "\n");
			}
		}
	}

//##########################################################################################################
//#################################
	public static int probabilidad(int[] array, int cae) {

		int prob = Utils.obtenerNumeroAzar(0, 100);
		if (prob > 75) {
			cae = 1;
		}
		return cae;
	}
//##################################	
//##########################################################################################################	

	public static int[] creaArrayBolos(int longitud, int limInf, int limSup) {
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(limInf, limSup);
		}
		return array;
	}

//##########################################################################################################	

	public static void animarArray(int[] array, String intento, int puntuacion) {

		for (int i = 0; i <= 10000; i++) {
			if (i >= 0) {
				if (intento == " Puntuación:" && puntuacion >= 10) {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + intento + "¡¡¡PLENO!!!"
							+ "\n\n ___________________   ________________\n| |\\__  _______  __/| |  _______  __/| |\n| | \\/_/_______\\_\\/ | |_/_______\\_\\/ | |\n| | |#|         |#| | |#|       |#|  | |");
				} else if (intento == " Puntuación:") {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + intento + "   "
							+ (puntuacion)
							+ "\n\n ___________________   ________________\n| |\\__  _______  __/| |  _______  __/| |\n| | \\/_/_______\\_\\/ | |_/_______\\_\\/ | |\n| | |#|         |#| | |#|       |#|  | |");
				}
				if (intento != " Puntuación:") {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + intento
							+ "\n\n ___________________   ________________\n| |\\__  _______  __/| |  _______  __/| |\n| | \\/_/_______\\_\\/ | |_/_______\\_\\/ | |\n| | |#|         |#| | |#|       |#|  | |");
				}
				System.out.print("| | |#| " + array[0]);
			}
			if (i == 1) {
				System.out.print(" " + array[i]);
			}
			if (i == 2) {
				System.out.print(" " + array[i]);
			}
			if (i == 3) {
				System.out.print(" " + array[i] + " |#| | |#|       |#|  | |\n| | |#|");
			}
			if (i == 4) {
				System.out.print("  " + array[i]);
			}
			if (i == 5) {
				System.out.print(" " + array[i]);
			}
			if (i == 6) {
				System.out.print(" " + array[i] + "  |#| | |#|       |#|  | |\n| | |#|  ");
			}
			if (i == 7) {
				System.out.print(" " + array[i]);
			}
			if (i == 8) {
				System.out.print(" " + array[i] + "   |#| | |#|       |#|  | |\n| | |#|   ");
			}
			if (i == 9) {
				System.out.print(" " + array[i] + "    |#| | |#|       |#|  | |\n"
						+ "| | |#|         |#| | |#|       |#|  | |\n" + "| | |#|         |#| | |#|       |#|  | |\n"
						+ "| | |#|         |#| | |#|       |#|  | |\n" + "| | |#|         |#| | |#|       |#|  | |\n"
						+ "| | |#|         |#| | |#|       |#|  | |\n" + "| | |#|         |#| | |#|       |#|  / /\n"
						+ "\\_\\_|#|         |#| | |#|       |#|_/_/" + "\n");
			}
		}

		for (int i = 0; i <= 20000 && i > 10000; i++) {
			if (i >= 0) {
				if (intento == " Puntuación:" && puntuacion >= 10) {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + intento + "¡¡¡PLENO!!!"
							+ "\n\n ___________________   ________________\n| |\\__  _______  __/| |  _______  __/| |\n| | \\/_/_______\\_\\/ | |_/_______\\_\\/ | |\n| | |#|         |#| | |#|       |#|  | |");
				} else if (intento == " Puntuación:") {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + intento + "   "
							+ (puntuacion)
							+ "\n\n ___________________   ________________\n| |\\__  _______  __/| |  _______  __/| |\n| | \\/_/_______\\_\\/ | |_/_______\\_\\/ | |\n| | |#|         |#| | |#|       |#|  | |");
				}
				if (intento != " Puntuación:") {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + intento
							+ "\n\n ___________________   ________________\n| |\\__  _______  __/| |  _______  __/| |\n| | \\/_/_______\\_\\/ | |_/_______\\_\\/ | |\n| | |#|         |#| | |#|       |#|  | |");
				}
				System.out.print("| | |#| " + array[0]);
			}
			if (i == 1) {
				System.out.print(" " + array[i]);
			}
			if (i == 2) {
				System.out.print(" " + array[i]);
			}
			if (i == 3) {
				System.out.print(" " + array[i] + " |#| | |#|       |#|  | |\n| | |#|");
			}
			if (i == 4) {
				System.out.print("  " + array[i]);
			}
			if (i == 5) {
				System.out.print(" " + array[i]);
			}
			if (i == 6) {
				System.out.print(" " + array[i] + "  |#| | |#|       |#|  | |\n| | |#|  ");
			}
			if (i == 7) {
				System.out.print(" " + array[i]);
			}
			if (i == 8) {
				System.out.print(" " + array[i] + "   |#| | |#|       |#|  | |\n| | |#|   ");
			}
			if (i == 9) {
				System.out.print(" " + array[i] + "    |#| | |#|       |#|  | |\n"
						+ "| | |#|         |#| | |#|       |#|  | |\n" + "| | |#|         |#| | |#|       |#|  | |\n"
						+ "| | |#|         |#| | |#|       |#|  | |\n" + "| | |#|         |#| | |#|       |#|  | |\n"
						+ "| | |#|         |#| | |#|       |#|  | |\n" + "| | |#|         |#| | |#|       |#|  / /\n"
						+ "\\_\\_|#|         |#| | |#|       |#|_/_/" + "\n");
			}
		}

		for (int i = 0; i <= 30000 && i < 20000; i++) {
			if (i >= 0) {
				if (intento == " Puntuación:" && puntuacion >= 10) {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + intento + "¡¡¡PLENO!!!"
							+ "\n\n ___________________   ________________\n| |\\__  _______  __/| |  _______  __/| |\n| | \\/_/_______\\_\\/ | |_/_______\\_\\/ | |\n| | |#|         |#| | |#|       |#|  | |");
				} else if (intento == " Puntuación:") {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + intento + "   "
							+ (puntuacion)
							+ "\n\n ___________________   ________________\n| |\\__  _______  __/| |  _______  __/| |\n| | \\/_/_______\\_\\/ | |_/_______\\_\\/ | |\n| | |#|         |#| | |#|       |#|  | |");
				}
				if (intento != " Puntuación:") {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + intento
							+ "\n\n ___________________   ________________\n| |\\__  _______  __/| |  _______  __/| |\n| | \\/_/_______\\_\\/ | |_/_______\\_\\/ | |\n| | |#|         |#| | |#|       |#|  | |");
				}
				System.out.print("| | |#| " + array[0]);
			}
			if (i == 1) {
				System.out.print(" " + array[i]);
			}
			if (i == 2) {
				System.out.print(" " + array[i]);
			}
			if (i == 3) {
				System.out.print(" " + array[i] + " |#| | |#|       |#|  | |\n| | |#|");
			}
			if (i == 4) {
				System.out.print("  " + array[i]);
			}
			if (i == 5) {
				System.out.print(" " + array[i]);
			}
			if (i == 6) {
				System.out.print(" " + array[i] + "  |#| | |#|       |#|  | |\n| | |#|  ");
			}
			if (i == 7) {
				System.out.print(" " + array[i]);
			}
			if (i == 8) {
				System.out.print(" " + array[i] + "   |#| | |#|       |#|  | |\n| | |#|   ");
			}
			if (i == 9) {
				System.out.print(" " + array[i] + "    |#| | |#|       |#|  | |\n"
						+ "| | |#|         |#| | |#|       |#|  | |\n" + "| | |#|         |#| | |#|       |#|  | |\n"
						+ "| | |#|         |#| | |#|       |#|  | |\n" + "| | |#|         |#| | |#|       |#|  | |\n"
						+ "| | |#|         |#| | |#|       |#|  | |\n" + "| | |#|         |#| | |#|       |#|  / /\n"
						+ "\\_\\_|#|         |#| | |#|       |#|_/_/" + "\n");
			}
		}
	}
}
