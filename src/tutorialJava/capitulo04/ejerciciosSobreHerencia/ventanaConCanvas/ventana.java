package tutorialJava.capitulo04.ejerciciosSobreHerencia.ventanaConCanvas;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class ventana {

	public ventana() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		
		JFrame ventana = new JFrame("Polígonos");
		ventana.setBounds(100,100,800,600);
		
		ventana.getContentPane().setLayout(new BorderLayout());
		MiCanvas canvas = new MiCanvas();
		
		canvas.setBackground(Color.decode("#AEAEAE"));
		ventana.getContentPane().add(canvas, BorderLayout.CENTER);
		
		ventana.setVisible(true);
	}

}
