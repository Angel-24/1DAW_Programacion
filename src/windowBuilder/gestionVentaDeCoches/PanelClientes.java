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
import javax.swing.JCheckBox;

public class PanelClientes {

	Cliente actual = null;
	
	private JFrame frame;
	
	private JTextField jtfId;
	private JLabel lblNombre;
	private JTextField jtfNombre;
	private JLabel lblApellidos;
	private JTextField jtfApellidos;
	
	private JPanel panel;
	
	private JButton btnPrimero;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnUltimo;
	private JButton btnGuardar;
	private JButton btnNuevo;
	private JButton btnBorrar;
	private JLabel lblLocalidad;
	private JTextField jtfLocalidad;
	private JLabel lblDniNie;
	private JTextField jtfDniNie;
	private JLabel lblFechaNac;
	private JTextField jtfFechaNac;
	private JCheckBox chckbxActivo;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelClientes window = new PanelClientes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PanelClientes() {
		initialize();
		this.actual = ControladorCliente.getInstance().findPrimero();
		cargarActualEnPantalla();
	}

	/**
	 * 
	 */
	private void cargarActualEnPantalla() {
		if (this.actual != null) {
			this.jtfId.setText("" + this.actual.getId());
			this.jtfNombre.setText(this.actual.getNombre());
			this.jtfApellidos.setText(this.actual.getApellidos());
			this.jtfLocalidad.setText(this.actual.getLocalidad());
			this.jtfDniNie.setText(this.actual.getDniNie());
			this.jtfFechaNac.setText(this.actual.getFechaNac());
			this.chckbxActivo.setSelected(true);
//			this.chckbxActivo.setText("" + this.actual.getActivo());
		}
	}
	
	/**
	 * 
	 */
	private void cargarActualDesdePantalla() {
		this.actual.setId(Integer.parseInt(jtfId.getText()));
		this.actual.setNombre(jtfNombre.getText());
		this.actual.setApellidos(jtfApellidos.getText());
		this.actual.setLocalidad(jtfLocalidad.getText());
		this.actual.setDniNie(jtfDniNie.getText());
		this.actual.setFechaNac(jtfFechaNac.getText());
//		this.actual.setActivo(1);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 525, 235);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {0, 0, 0};
		gridBagLayout.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblId = new JLabel(" Id: ");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		frame.getContentPane().add(lblId, gbc_lblId);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 0;
		frame.getContentPane().add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		lblNombre = new JLabel("Nombre: ");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 1;
		frame.getContentPane().add(lblNombre, gbc_lblNombre);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 1;
		frame.getContentPane().add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos: ");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 0;
		gbc_lblApellidos.gridy = 2;
		frame.getContentPane().add(lblApellidos, gbc_lblApellidos);
		
		jtfApellidos = new JTextField();
		GridBagConstraints gbc_jtfApellidos = new GridBagConstraints();
		gbc_jtfApellidos.insets = new Insets(0, 0, 5, 0);
		gbc_jtfApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellidos.gridx = 1;
		gbc_jtfApellidos.gridy = 2;
		frame.getContentPane().add(jtfApellidos, gbc_jtfApellidos);
		jtfApellidos.setColumns(10);
		
		lblLocalidad = new JLabel("Localidad: ");
		GridBagConstraints gbc_lblLocalidad = new GridBagConstraints();
		gbc_lblLocalidad.anchor = GridBagConstraints.EAST;
		gbc_lblLocalidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocalidad.gridx = 0;
		gbc_lblLocalidad.gridy = 3;
		frame.getContentPane().add(lblLocalidad, gbc_lblLocalidad);
		
		jtfLocalidad = new JTextField();
		GridBagConstraints gbc_jtfLocalidad = new GridBagConstraints();
		gbc_jtfLocalidad.insets = new Insets(0, 0, 5, 0);
		gbc_jtfLocalidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfLocalidad.gridx = 1;
		gbc_jtfLocalidad.gridy = 3;
		frame.getContentPane().add(jtfLocalidad, gbc_jtfLocalidad);
		jtfLocalidad.setColumns(10);
		
		lblDniNie = new JLabel("DniNie: ");
		GridBagConstraints gbc_lblDniNie = new GridBagConstraints();
		gbc_lblDniNie.anchor = GridBagConstraints.EAST;
		gbc_lblDniNie.insets = new Insets(0, 0, 5, 5);
		gbc_lblDniNie.gridx = 0;
		gbc_lblDniNie.gridy = 4;
		frame.getContentPane().add(lblDniNie, gbc_lblDniNie);
		
		jtfDniNie = new JTextField();
		GridBagConstraints gbc_jtfDniNie = new GridBagConstraints();
		gbc_jtfDniNie.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDniNie.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDniNie.gridx = 1;
		gbc_jtfDniNie.gridy = 4;
		frame.getContentPane().add(jtfDniNie, gbc_jtfDniNie);
		jtfDniNie.setColumns(10);
		
		lblFechaNac = new JLabel("FechaNac: ");
		GridBagConstraints gbc_lblFechaNac = new GridBagConstraints();
		gbc_lblFechaNac.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblFechaNac.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaNac.gridx = 0;
		gbc_lblFechaNac.gridy = 5;
		frame.getContentPane().add(lblFechaNac, gbc_lblFechaNac);
		
		jtfFechaNac = new JTextField();
		GridBagConstraints gbc_jtfFechaNac = new GridBagConstraints();
		gbc_jtfFechaNac.insets = new Insets(0, 0, 5, 0);
		gbc_jtfFechaNac.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFechaNac.gridx = 1;
		gbc_jtfFechaNac.gridy = 5;
		frame.getContentPane().add(jtfFechaNac, gbc_jtfFechaNac);
		jtfFechaNac.setColumns(10);
		
		chckbxActivo = new JCheckBox("Activo");
//		chckbxActivo.setSelected(true);
		GridBagConstraints gbc_chckbxActivo = new GridBagConstraints();
		gbc_chckbxActivo.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxActivo.gridx = 0;
		gbc_chckbxActivo.gridy = 6;
		frame.getContentPane().add(chckbxActivo, gbc_chckbxActivo);
		

		
		
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 7;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnPrimero = new JButton("<<");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCliente.getInstance().findPrimero();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnPrimero);
		
		btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCliente.getInstance().findAnterior(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnAnterior);
		
		btnSiguiente = new JButton(">");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCliente.getInstance().findSiguiente(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnSiguiente);
		
		btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorCliente.getInstance().findUltimo();
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
			int regsAfec = ControladorCliente.getInstance().modificar(this.actual);
			if (regsAfec > 0) {
				JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
			}
		}
		else { // Alta -  nuevo
			int idNuevoReg = ControladorCliente.getInstance().nuevo(this.actual);
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
		this.chckbxActivo.setSelected(false);
//		this.chckbxActivo.setText("0");
		this.jtfLocalidad.setText("");
		this.jtfNombre.setText("");
		this.jtfApellidos.setText("");
		this.jtfDniNie.setText("");
		this.jtfFechaNac.setText("");
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
	    	int regsAfectados = ControladorCliente.getInstance().borrar(this.actual.getId());
	    	if (regsAfectados > 0) {
	    		vaciarCampos();
	    		JOptionPane.showMessageDialog(null, "Eliminado correctamente");
	    	}
	    }
	}
}
