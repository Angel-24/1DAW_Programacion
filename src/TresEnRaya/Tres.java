package TresEnRaya;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import TresEnRaya.Actor;
import TresEnRaya.C;
import TresEnRaya.ControladorRaton;
import TresEnRaya.MiCanvas;

public class Tres extends Canvas {
	// Variables est�ticas
	private MiCanvas canvas = null;
	public static final int ANCHO = 600;
	public static final int ALTO = 600;
	
	List<Actor> actores = new ArrayList<Actor>();

	C cuadrado = null;

	// Ventana
	JFrame ventana = null;

	// Variable para patr�n Singleton
	private static Tres instancia = null;
	
	/**
	 * Getter Singleton
	 * @return
	 */
	public synchronized static Tres getInstancia () {
		if (instancia == null) {
			instancia = new Tres();
		}
		return instancia;
	}
	
	
	
	/**
	 * Constructor
	 */
	public Tres() {
		// Creaci�n de la ventana
		ventana = new JFrame("Tres en Raia");
		// Obtenemos el panel principal del JFrame
		JPanel panel = (JPanel) ventana.getContentPane();
		// Utilizo un BorderLayout para colocar el Canvas sobre el JPanel
		panel.setLayout(new BorderLayout());
		// Agregamos el Canvas al panel de manera que ocupe todo el espacio disponible
		panel.add(this, BorderLayout.CENTER);
		// Dimensionamos el JFrame
		ventana.setBounds( 0, 0, ANCHO, ALTO);
		// Hacemos el JFrame visible
		ventana.setVisible(true);
		// Con el siguiente c�digo preguntamos al usuario si realmente desea cerrar la aplicaci�n, cuando
		// pulse sobre el aspa de la ventana
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		ventana.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		});
		// Con ignoreRepaint le decimos al JFrame que no debe repintarse cuando el Sistema Operativo se lo indique,
		// nosotros nos ocupamos totalmente del refresco de la pantalla
		ventana.setIgnoreRepaint(true);
		// La ventana no podr� redimensionarse
		ventana.setResizable(false);
		// Hacemos que el Canvas obtenga autom�ticamente el foco del programa para que, si se pulsa una tecla, la pulsaci�n
		// se transmita directamente al Canvas.
		this.requestFocus();
		// Para resolver un problema de sincronizaci�n con la memoria de v�deo de Linux, utilizamos esta l�nea
		Toolkit.getDefaultToolkit().sync();
		
		// Agrego los controladores de rat�n y de teclado
		this.addMouseMotionListener(new ControladorRaton());
	}
	
	

	/**
	 * Al cerrar la aplicaci�n preguntaremos al usuario si est� seguro de que desea salir.
	 */
	private void cerrarAplicacion() {
		String [] opciones ={"Aceptar","Cancelar"};
		int eleccion = JOptionPane.showOptionDialog(ventana,"¿Quieres cerrar la aplicación?","",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	public void initWorld() {

		canvas = new MiCanvas(actores);
		
	}
		public List<Actor> creaActores() {
			List<Actor> actores = new ArrayList<Actor>();
			C cuadrado = new C(35, 30);
			actores.add(cuadrado);

			
			return actores;
	}
	
/*	public void paintWorld() {
		// Obtenemos el objeto Graphics (la brocha) desde la estrategia de doble b�ffer
		canvas = new MiCanvas(actores);
		// Lo primero que hace cada frame es pintar un rect�ngulo tan grande como la escena,
		// para superponer la escena anterior.
		g.setColor(Color.black);
		g.fillRect( 0, 0, getWidth(), getHeight());

		// Ejecutamos el m�todo paint de cada uno de los actores
		for (Actor actor : this.actores) {
			actor.paint(g);
		}
	}
*/
	public void updateWorld() {
		// Actualizaci�n de todos los actores
		for (Actor actor : this.actores) {
			actor.actua();
		}
	}
	
	
	
	public void game() {
		// Inicializaci�n del juego
		//initWorld();
		// Este bucle se ejecutar� mientras el objeto Canvas sea visible.
		while (this.isVisible()) {
			// Tomamos el tiempo en milisegundos antes de repintar el frame
			//long millisAntesDeConstruirEscena = System.currentTimeMillis();
			// Actualizamos y pintamos el nuevo frame
//			updateWorld();
//			paintWorld();

		}
		canvas = new MiCanvas(actores);
	}


	public static void main(String[] args) {
		Tres.getInstancia().game();
	}
}
