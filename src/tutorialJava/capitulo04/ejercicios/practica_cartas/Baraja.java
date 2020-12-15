package tutorialJava.capitulo04.ejercicios.practica_cartas;

public class Baraja {
	
	public static void main(String[] args) {

		Carta Baraja[] = new Carta[52];
		
		
	}
	
	public static void iniBaraja(Carta Baraja[]) {
	
		int id = 0;
		for (int i = 1; i <= 13; i++) {
			Baraja[id] = new Carta(i, "picas", id);
			id++;
		}
		
		for (int i = 1; i <= 13; i++) {
			Baraja[id] = new Carta(i, "diamantes", id);
			id++;
		}
		
		for (int i = 1; i <= 13; i++) {
			Baraja[id] = new Carta(i, "tréboles", id);
			id++;
		}
		
		for (int i = 1; i <= 13; i++) {
			Baraja[id] = new Carta(i, "corazones", id);
			id++;
		}
		
	}
}
