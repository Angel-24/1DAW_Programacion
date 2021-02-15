package TresEnRaya;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class C extends Actor {
	// Pienso que, aunque m�s adelante en el juego pueda haber varias bolas, en principio su di�metro no cambia
	public static final int ANCHO = 15;
	

	public C(int i, int j) {
		super();
		this.x = Tres.getInstancia().getWidth() / 2;
		this.y = Tres.getInstancia().getHeight() / 2;
	}


	public void paint(Graphics2D g){
		g.setColor(Color.ORANGE);

		g.fillRect(this.x, this.y, ANCHO, ANCHO);
	}

	
	public void act() {
/*		// Si la bola se toca el borde por la izquierda o por la derecha, su velocidad cambia de signo
		if (this.x < 0 || this.x > Tres.ANCHO - DIAMETRO) {
			this.velocidadX = 0 - this.velocidadX;
		}
		// Si la bola se toca el borde por arriba o por abajo, su velocidad cambia de signo
		if (this.y < 0 || this.y > Tres.ALTO - DIAMETRO) {
			this.velocidadY = 0 - this.velocidadY;
		}
		// Agregamos las velocidades respectivas a cada eje para la bola
		this.x += this.velocidadX;
		this.y += this.velocidadY;
		*/
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actua() {
		// TODO Auto-generated method stub
		
	}


}
