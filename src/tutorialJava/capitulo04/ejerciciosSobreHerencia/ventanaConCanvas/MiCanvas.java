package tutorialJava.capitulo04.ejerciciosSobreHerencia.ventanaConCanvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;

public class MiCanvas extends Canvas {

	public MiCanvas() {
		// TODO Auto-generated constructor stub
	}

	public MiCanvas(GraphicsConfiguration config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	public void paint(Graphics g) {
	super.paint(g);
	
	g.setColor(Color.black);
	g.fillRect(100, 100, 100, 100);
	g.setColor(Color.darkGray);
	g.fillOval(300, 300, 200, 200);
	g.setColor(Color.black);
	int x[] = new int[] {300,370,450};
	int y[] = new int[] {300,275,350};
	g.fillPolygon(x,y,3);
	}
}
