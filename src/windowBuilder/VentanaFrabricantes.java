package windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;

import windowBuilder.modelo.Fabricante;
import windowBuilder.modelo.controladores.ControladorFabricante;

import javax.swing.JButton;
import java.awt.Button;
import java.awt.GridLayout;

public class VentanaFrabricantes {

	Fabricante actual = null;
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel nombre;
	private JPanel panel;
	private JButton a;
	private JButton b;
	private JButton c;
	private JButton d;
	private JButton guardar;
	private JButton nuevo;
	private JButton editar;
	private JButton eliminar;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFrabricantes window = new VentanaFrabricantes();
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
	public VentanaFrabricantes() {
		initialize();
		this.actual = ControladorFabricante.getInstance().findPrimero();
		cargarActualEnPantalla();
	}
	
	private void cargarActualEnPantalla() {
		if (this.actual != null) {
			this.textField.setText("" + this.actual.getId());
			this.textField_1.setText(this.actual.getCif());
			this.textField_2.setText(this.actual.getNombre());
		}
			
	}
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel id = new JLabel("ID:");
		GridBagConstraints gbc_id = new GridBagConstraints();
		gbc_id.insets = new Insets(0, 0, 5, 5);
		gbc_id.anchor = GridBagConstraints.EAST;
		gbc_id.gridx = 0;
		gbc_id.gridy = 0;
		frame.getContentPane().add(id, gbc_id);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 0;
		frame.getContentPane().add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel cif = new JLabel("CIF:");
		GridBagConstraints gbc_cif = new GridBagConstraints();
		gbc_cif.anchor = GridBagConstraints.EAST;
		gbc_cif.insets = new Insets(0, 0, 5, 5);
		gbc_cif.gridx = 0;
		gbc_cif.gridy = 1;
		frame.getContentPane().add(cif, gbc_cif);
		
		JTextField jtfcif = new JTextField();
		GridBagConstraints gbc_jtfcif = new GridBagConstraints();
		gbc_jtfcif.insets = new Insets(0, 0, 5, 0);
		gbc_jtfcif.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfcif.gridx = 1;
		gbc_jtfcif.gridy = 1;
		frame.getContentPane().add(jtfcif, gbc_jtfcif);
		jtfcif.setColumns(10);
		
		nombre = new JLabel("Nombre:");
		GridBagConstraints gbc_nombre = new GridBagConstraints();
		gbc_nombre.insets = new Insets(0, 0, 5, 5);
		gbc_nombre.anchor = GridBagConstraints.EAST;
		gbc_nombre.gridx = 0;
		gbc_nombre.gridy = 2;
		frame.getContentPane().add(nombre, gbc_nombre);
		
		JTextField jtfnombre = new JTextField();
		GridBagConstraints gbc_jtfnombre = new GridBagConstraints();
		gbc_jtfnombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfnombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfnombre.gridx = 1;
		gbc_jtfnombre.gridy = 2;
		frame.getContentPane().add(jtfnombre, gbc_jtfnombre);
		jtfnombre.setColumns(10);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.gridwidth = 2;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 3;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new GridLayout(2, 1, 0, 0));
		
		a = new JButton("<<");
		panel.add(a);
		
		b = new JButton("<");
		panel.add(b);
		
		c = new JButton(">");
		panel.add(c);
		
		d = new JButton(">>");
		panel.add(d);
		
		guardar = new JButton("Guardar");
		panel.add(guardar);
		
		nuevo = new JButton("Nuevo");
		panel.add(nuevo);
		
		editar = new JButton("Editar");
		panel.add(editar);
		
		eliminar = new JButton("Eliminar");
		panel.add(eliminar);
		
	}

}
