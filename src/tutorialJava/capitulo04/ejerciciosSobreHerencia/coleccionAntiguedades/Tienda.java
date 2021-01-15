package tutorialJava.capitulo04.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Tienda {

	public static void main(String[] args) {
		
		Joya Rubi = new Joya("Anillo Rubí       ", "Joya ", 45.5, 257, "Origen", "Oro");
		Libro Enciclopedia = new Libro("Libro viejo       ","Libro", 11.80, 116,"Origen","Autor");
		Roca Fosil = new Roca("Fósil desenterrado","Rocas",300.0, 0, "??", "Origen","Reptil","Neolítico");
		Pieza Motor = new Pieza("Pieza Mecánica","Herramientas",29.20, 89,"Origen", "Maquinaria", "Barco naufragado");
		
		System.out.println(Rubi + "\n\n" + Enciclopedia + "\n\n" + Fosil + "\n\n" + Motor);
		
	}
}
