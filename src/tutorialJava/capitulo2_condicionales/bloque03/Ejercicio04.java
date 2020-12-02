package tutorialJava.capitulo2_condicionales.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		int reiniciar = 0;
		while (reiniciar == 0) {

			int resultado = 0;
			String str = JOptionPane.showInputDialog("Se debe pagar: ");
			int importe = Integer.parseInt(str);
			str = JOptionPane.showInputDialog("Se ha pagado: ");
			int cantidad = Integer.parseInt(str);
			int cien = 0;
			int cincuenta = 0;
			int veinticinco = 0;
			int cinco = 0;
			int uno = 0;
			int vuelta = cantidad - importe;

			if (importe < cantidad) {
				resultado = cantidad - importe;
				for (cien = 0; resultado >= 100 && resultado >= 0; cien++) {
					resultado = resultado - 100;
				}
				for (cincuenta = 0; resultado >= 50 && resultado >= 0; cincuenta++) {
					resultado = resultado - 50;
				}
				for (veinticinco = 0; resultado >= 25 && resultado >= 0; veinticinco++) {
					resultado = resultado - 25;
				}
				for (cinco = 0; resultado >= 5 && resultado >= 0; cinco++) {
					resultado = resultado - 5;
				}
				for (uno = 0; resultado >= 1 && resultado >= 0; uno++) {
					resultado = resultado - 1;
				}
				System.out.println("La vuelta es " + vuelta + " y se devolverá en: " + "\nMonedas de 100: " + cien
						+ "\nMonedas de 50: " + cincuenta + "\nMonedas de 25: " + veinticinco + "\nMonedas de 5: "
						+ cinco + "\nMonedas de 1: " + uno + "\n");
			} else {
				if (importe == cantidad) {
					System.out.println("Ya has pagado la cantidad exacta, melón. Nadie debe devolver nada. \n");
				} else if (importe > cantidad) {
					vuelta = vuelta - (2 * vuelta);
					System.out.println("Aún debes pagar " + vuelta + " unidades... \n");
				}
			}
			reiniciar = JOptionPane.showInternalConfirmDialog(null, "¿Reiniciar?");
		}
	}
}