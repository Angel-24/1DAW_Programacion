package TresEnRaya;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
/**
 * Clase que representa cualquier actor que interviene en el juego
 *
 */
public abstract class Actor{
	// Propiedades privadas de cada actor
	protected int x, y;
	protected int ancho=30, alto=30;


	public Actor() {
		
	}




	public Actor(int x, int y, int ancho, int alto) {
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
	}

	public abstract void paint(Graphics g); 

	public abstract void actua ();

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}


	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}


	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}


	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}


	/**
	 * @return the width
	 */
	public int getWidth() {
		return ancho;
	}


	/**
	 * @param width the width to set
	 */
	public void setWidth(int ancho) {
		this.ancho = ancho;
	}


	/**
	 * @return the height
	 */
	public int getHeight() {
		return alto;
	}


	/**
	 * @param height the height to set
	 */
	public void setHeight(int alto) {
		this.alto = alto;
	}


//	public String getImg() {
//		return img;
//	}


//	public void setImg(String img) {
//		this.img = img;
//	}
	
}
