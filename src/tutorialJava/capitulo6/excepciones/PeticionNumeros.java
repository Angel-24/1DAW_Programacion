package tutorialJava.capitulo6.excepciones;

import javax.swing.JOptionPane;

public class PeticionNumeros {

	public static void main(String[] args) throws NoEsParException {

		int n=0;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número PAR:"));
		pideNumeroPar(n);
		
	}

	public static void pideNumeroPar(int n) throws NoEsParException {
		
		try {
			if (n%2!=0) throw new NoEsParException(n);
			System.out.println("El número "+n+" es par.");
		}
		catch (NoEsParException e) {
			System.out.println("El número "+n+" es impar...");
		}
		
		return;
	}
}
