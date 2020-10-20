package tutorialJava.capitulo1.ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {
		float euribor;
		float diferencial;
		float capital;
		float plazos;
//		int ;
		
		String str = JOptionPane.showInputDialog("Euribor: ");
		euribor = Float.parseFloat(str);
		str = JOptionPane.showInputDialog("Diferencial: ");
		diferencial = Float.parseFloat(str);
		str = JOptionPane.showInputDialog("Capital: ");
		capital = Float.parseFloat(str);
		str = JOptionPane.showInputDialog("Plazos: ");
		plazos = Float.parseFloat(str);
		
		float interesAnual = capital * (euribor + diferencial);
		float interesMensual = (interesAnual / plazos) / (plazos - 1);
		
		System.out.println("El interés mensual es: " + interesMensual);
	}
}
