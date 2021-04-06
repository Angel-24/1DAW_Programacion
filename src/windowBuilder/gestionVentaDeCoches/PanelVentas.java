package windowBuilder.gestionVentaDeCoches;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelVentas extends JPanel {

	Venta actual = null;

	private JTextField jtfId;
	private JPanel panel;
	private JButton btnPrimero;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnUltimo;
	private JButton btnGuardar;
	private JButton btnNuevo;
	private JButton btnBorrar;
	private JLabel lblIdCliente;
	private JTextField jtfIdCliente;
	private JLabel lblIdConcesionario;
	private JTextField jtfIdConcesionario;
	private JLabel lblIdCoche;
	private JTextField jtfIdCoche;
	private JLabel lblFecha;
	private JTextField jtfFecha;
	private JLabel lblPrecioVenta;
	private JTextField jtfPrecioVenta;

	/**
	 * Create the application.
	 */
	public PanelVentas() {
		super();
		initialize();
		this.actual = ControladorVenta.getInstance().findPrimero();
		cargarActualEnPantalla();
	}

	/**
	 * 
	 */
	private void cargarActualEnPantalla() {
		if (this.actual != null) {
			this.jtfId.setText("" + this.actual.getId());
			this.jtfIdCliente.setText("" + this.actual.getIdCliente());
			this.jtfIdConcesionario.setText("" + this.actual.getIdConcesionario());
			this.jtfIdCoche.setText("" + this.actual.getIdCoche());
			this.jtfFecha.setText(this.actual.getFecha());
			this.jtfPrecioVenta.setText("" + this.actual.getPrecioVenta());
		}
	}
	
	/**
	 * 
	 */
	private void cargarActualDesdePantalla() {
		this.actual.setId(Integer.parseInt(jtfId.getText()));
		this.actual.setIdCliente(Integer.parseInt(jtfIdCliente.getText()));
		this.actual.setIdConcesionario(Integer.parseInt(jtfIdConcesionario.getText()));
		this.actual.setIdCoche(Integer.parseInt(jtfIdCoche.getText()));
		this.actual.setFecha(jtfFecha.getText());
		this.actual.setPrecioVenta(Integer.parseInt(jtfPrecioVenta.getText()));
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		this.setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Id:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		this.add(lblNewLabel, gbc_lblNewLabel);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 0;
		this.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		lblIdCliente = new JLabel("IdCliente: ");
		GridBagConstraints gbc_lblIdCliente = new GridBagConstraints();
		gbc_lblIdCliente.anchor = GridBagConstraints.EAST;
		gbc_lblIdCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdCliente.gridx = 0;
		gbc_lblIdCliente.gridy = 1;
		this.add(lblIdCliente, gbc_lblIdCliente);
		
		jtfIdCliente = new JTextField();
		GridBagConstraints gbc_jtfIdCliente = new GridBagConstraints();
		gbc_jtfIdCliente.insets = new Insets(0, 0, 5, 0);
		gbc_jtfIdCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfIdCliente.gridx = 1;
		gbc_jtfIdCliente.gridy = 1;
		this.add(jtfIdCliente, gbc_jtfIdCliente);
		jtfIdCliente.setColumns(10);
		
		lblIdConcesionario = new JLabel("IdConcesionario: ");
		GridBagConstraints gbc_lblIdConcesionario = new GridBagConstraints();
		gbc_lblIdConcesionario.anchor = GridBagConstraints.EAST;
		gbc_lblIdConcesionario.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdConcesionario.gridx = 0;
		gbc_lblIdConcesionario.gridy = 2;
		this.add(lblIdConcesionario, gbc_lblIdConcesionario);
		
		jtfIdConcesionario = new JTextField();
		GridBagConstraints gbc_jtfIdConcesionario = new GridBagConstraints();
		gbc_jtfIdConcesionario.insets = new Insets(0, 0, 5, 0);
		gbc_jtfIdConcesionario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfIdConcesionario.gridx = 1;
		gbc_jtfIdConcesionario.gridy = 2;
		this.add(jtfIdConcesionario, gbc_jtfIdConcesionario);
		jtfIdConcesionario.setColumns(10);
		
		lblIdCoche = new JLabel("IdCoche: ");
		GridBagConstraints gbc_lblIdCoche = new GridBagConstraints();
		gbc_lblIdCoche.anchor = GridBagConstraints.EAST;
		gbc_lblIdCoche.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdCoche.gridx = 0;
		gbc_lblIdCoche.gridy = 3;
		this.add(lblIdCoche, gbc_lblIdCoche);
		
		jtfIdCoche = new JTextField();
		GridBagConstraints gbc_jtfIdCoche = new GridBagConstraints();
		gbc_jtfIdCoche.insets = new Insets(0, 0, 5, 0);
		gbc_jtfIdCoche.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfIdCoche.gridx = 1;
		gbc_jtfIdCoche.gridy = 3;
		this.add(jtfIdCoche, gbc_jtfIdCoche);
		jtfIdCoche.setColumns(10);
		
		lblFecha = new JLabel("Fecha: ");
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.anchor = GridBagConstraints.EAST;
		gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFecha.gridx = 0;
		gbc_lblFecha.gridy = 4;
		this.add(lblFecha, gbc_lblFecha);
		
		jtfFecha = new JTextField();
		GridBagConstraints gbc_jtfFecha = new GridBagConstraints();
		gbc_jtfFecha.insets = new Insets(0, 0, 5, 0);
		gbc_jtfFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFecha.gridx = 1;
		gbc_jtfFecha.gridy = 4;
		this.add(jtfFecha, gbc_jtfFecha);
		jtfFecha.setColumns(10);
		
		lblPrecioVenta = new JLabel("PrecioVenta: ");
		GridBagConstraints gbc_lblPrecioVenta = new GridBagConstraints();
		gbc_lblPrecioVenta.anchor = GridBagConstraints.EAST;
		gbc_lblPrecioVenta.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioVenta.gridx = 0;
		gbc_lblPrecioVenta.gridy = 5;
		this.add(lblPrecioVenta, gbc_lblPrecioVenta);
		
		jtfPrecioVenta = new JTextField();
		GridBagConstraints gbc_jtfPrecioVenta = new GridBagConstraints();
		gbc_jtfPrecioVenta.insets = new Insets(0, 0, 5, 0);
		gbc_jtfPrecioVenta.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfPrecioVenta.gridx = 1;
		gbc_jtfPrecioVenta.gridy = 5;
		this.add(jtfPrecioVenta, gbc_jtfPrecioVenta);
		jtfPrecioVenta.setColumns(10);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 6;
		this.add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnPrimero = new JButton("<<");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorVenta.getInstance().findPrimero();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnPrimero);
		
		btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorVenta.getInstance().findAnterior(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnAnterior);
		
		btnSiguiente = new JButton(">");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorVenta.getInstance().findSiguiente(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnSiguiente);
		
		btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorVenta.getInstance().findUltimo();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnUltimo);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		panel.add(btnGuardar);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vaciarCampos();
			}
		});
		panel.add(btnNuevo);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrar();
			}
		});
		panel.add(btnBorrar);
	}

	/**
	 * 
	 */
	private void guardar () {
		cargarActualDesdePantalla();
		// Decido si se trata de guardar un registro existente o nuevo
		if (this.actual.getId() != 0) { // Modificación
			int regsAfec = ControladorVenta.getInstance().modificar(this.actual);
			if (regsAfec > 0) {
				JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
			}
		}
		else { // Alta -  nuevo
			int idNuevoReg = ControladorVenta.getInstance().nuevo(this.actual);
			if (idNuevoReg > 0) {
				this.jtfId.setText("" + idNuevoReg);
				JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
			}
		}
	}
	
	/**
	 * 
	 */
	private void vaciarCampos() {
		this.jtfId.setText("0");
		this.jtfIdCliente.setText("0");
		this.jtfIdConcesionario.setText("0");
		this.jtfIdCoche.setText("0");
		this.jtfFecha.setText("");
		this.jtfPrecioVenta.setText("0");
	}
	
	/**
	 * 
	 */
	private void borrar() {
		String posiblesRespuestas[] = {"Sí","No"};
		// En esta opci�n se utiliza un showOptionDialog en el que personalizo el icono mostrado
		int opcionElegida = JOptionPane.showOptionDialog(null, "¿Desea eliminar?", "Gestión venta de coches", 
		        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, posiblesRespuestas, posiblesRespuestas[1]);
	    if(opcionElegida == 0) {
	    	int regsAfectados = ControladorVenta.getInstance().borrar(this.actual.getId());
	    	if (regsAfectados > 0) {
	    		vaciarCampos();
	    		JOptionPane.showMessageDialog(null, "Eliminado correctamente");
	    	}
	    }
	}
}
