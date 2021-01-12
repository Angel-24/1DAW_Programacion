package tutorialJava.capitulo04.ejerciciosSobreHerencia.articulosComestibles;

public class Tienda {

	public static void main(String[] args) {
		
		Perecedero Manzana = new Perecedero("Manzana",1.5,11,"2021");
		NoPerecedero Lápiz = new NoPerecedero("Lápiz  ",0.80,17);
		Perecedero Piña = new Perecedero("Piña   ",3.0,12,"2021");
		NoPerecedero Cable = new NoPerecedero("Cable  ",1.20,18);
		
		System.out.println(Manzana + "\n" + Lápiz + "\n" + Piña + "\n" + Cable);
		
	}
}
