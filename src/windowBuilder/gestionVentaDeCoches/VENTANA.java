package windowBuilder.gestionVentaDeCoches;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class VENTANA extends JFrame {

	private JTabbedPane jTabbedPane = null;
	
	private static VENTANA instance = null;
	
	/**
	 * 
	 * @return
	 */
	public static VENTANA getInstance () {
		if (instance == null) {
			instance = new VENTANA();
		}
		return instance;
	}
	
	/**
	 * 
	 */
	public VENTANA() {
		super("Gestión de venta de coches");
		this.setBounds(0, 0, 600, 400);
		
		this.setJMenuBar(new MenuBar());
		
		this.setLayout(new BorderLayout());
		this.add(getPanelPrincipal(), BorderLayout.CENTER);
	}

	/**
	 * 
	 * @return
	 */
	private JTabbedPane getPanelPrincipal() {
		jTabbedPane = new JTabbedPane();
		
		jTabbedPane.add("Fabricantes", new PanelFabricantes());
		jTabbedPane.add("Coches", new PanelCoches());
		jTabbedPane.add("Clientes", new PanelClientes());
		jTabbedPane.add("Concesionarios", new PanelConcesionarios());
		jTabbedPane.add("Ventas", new PanelVentas());
		
		return jTabbedPane;
	}
	
	
	
	
	
	/**
	 * @return the jTabbedPane
	 */
	public JTabbedPane getjTabbedPane() {
		return jTabbedPane;
	}


	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		VENTANA.getInstance().setVisible(true);
	}

}
