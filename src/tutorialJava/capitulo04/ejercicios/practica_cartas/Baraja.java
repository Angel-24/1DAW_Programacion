package tutorialJava.capitulo04.ejercicios.practica_cartas;


public class Baraja {
	
	public static void main(String[] args) {

		
		Carta Baraja[] = new Carta[52];
		iniBaraja(Baraja);
		
		for (int i = 0; i < Baraja.length; i++) {
			System.out.println(Baraja[i]);
		}
		
	}
	
	public static void iniBaraja(Carta Baraja[]) {
	
		int id = 0;
		int valor = 1;
		for (int i = 1; i <= 52; i++) {
			if (i <= 13) {
				Baraja[id] = new Carta(valor, "♠", id);
			} else if (i <= 26) {
				Baraja[id] = new Carta(valor, "♦", id);
			} else if (i <= 39) {
				Baraja[id] = new Carta(valor, "♣", id);
			} else if (i <= 52) {
				Baraja[id] = new Carta(valor, "♥", id);
			} if (valor >= 13) {
				valor = 0;
			}
			valor++;
			id++;
		}
		
/*
		for (int i = 1; i <= 52; i++) {
			if (i <= 13) {
				Baraja[id] = new Carta(valor, "____picas", id);
			} else if (i <= 26) {
				Baraja[id] = new Carta(valor, "diamantes", id);
			} else if (i <= 39) {
				Baraja[id] = new Carta(valor, "_tréboles", id);
			} else if (i <= 52) {
				Baraja[id] = new Carta(valor, "corazones", id);
			} if (valor >= 13) {
				valor = 0;
			}
			valor++;
			id++;
		}
 */
		
	}
}
