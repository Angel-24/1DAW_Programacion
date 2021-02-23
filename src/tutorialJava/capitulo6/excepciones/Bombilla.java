package tutorialJava.capitulo6.excepciones;

import javax.swing.JOptionPane;

public class Bombilla {

	public static void main(String[] args) throws NohaybombillaException, PalabraOfensivaException, SoloEspaciosException, PocasPalabrasException {
		
		String f = JOptionPane.showInputDialog("Escribe una frase...");
		pideFrase(f);
		
	}

	public static void pideFrase(String f) throws NohaybombillaException, PalabraOfensivaException, SoloEspaciosException, PocasPalabrasException {
		
		try {
			
			int i;
			
			String[] palabras = f.split(" ");
			
			for (i = 0; i < palabras.length; i++) {
				
				if (f.isEmpty()) throw new SoloEspaciosException(f);
				else if (!(f.contains("bombilla"))) throw new NohaybombillaException(f);
				else if (f.contains("tonto") || f.contains("tonta") || f.contains("idiota")) throw new PalabraOfensivaException(f);
			}

				if (i < 3) throw new PocasPalabrasException(f);
			
			System.out.println("\"" +f+ "\" es una frase aceptable.");
			
		}
		catch (NohaybombillaException e) {
			System.out.println("La frase \"" +f+ "\" no incluye la palabra \"Bombilla\"");
		}
		catch (PalabraOfensivaException e) {
			System.out.println("La frase \"" +f+ "\" incluye alguna que otra palabra ofesiva.");
		}
		catch (SoloEspaciosException e) {
			System.out.println("La frase \"" +f+ "\" está en blanco, por lo que no es una frase (obviamente).");
		}
		catch (PocasPalabrasException e) {
			System.out.println("La frase \"" +f+ "\" contiene menos de tres palabras. Esfuérzate un poco más.");
		}
		
		return;
	}
}
