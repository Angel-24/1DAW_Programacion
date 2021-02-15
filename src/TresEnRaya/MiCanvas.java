package TresEnRaya;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.util.List;



public class MiCanvas extends Canvas {

	List<Actor> actores = null;
	
	public MiCanvas (List<Actor> actores) {
		this.actores = actores;
	}

	public MiCanvas(GraphicsConfiguration config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void paint(Graphics g) {
		// Pinto el fondo
		this.setBackground(Color.DARK_GRAY);
		
		// Pinto cada uno de los actores
		for (Actor a : this.actores) {
			a.paint(g);
		}
	}
}