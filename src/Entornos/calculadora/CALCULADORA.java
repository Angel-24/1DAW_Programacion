package Entornos.calculadora;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class CALCULADORA extends JFrame {

	public JTabbedPane jTabbedPane = null;
	
	public static CALCULADORA instance = null;
	public JTextField result;
	public JTextField txt1;
	public JTextField txt2;
	Component cerrar = null;
	int eleccion;
	
	/**
	 * 
	 * @return
	 */
	public static CALCULADORA getInstance () {
		if (instance == null) {
			instance = new CALCULADORA();
		}
		return instance;
	}
	
	/**
	 * 
	 */
	public CALCULADORA() {
		super("¿Calculadora?");
		this.setBounds(400, 250, 600, 240);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{30, 215, 88, 0, 30, 0};
		gbl_panel.rowHeights = new int[]{55, 40, 25, 50, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		result = new JTextField();
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setEditable(false);
		result.setColumns(10);
		GridBagConstraints gbc_result = new GridBagConstraints();
		gbc_result.fill = GridBagConstraints.HORIZONTAL;
		gbc_result.gridwidth = 3;
		gbc_result.insets = new Insets(0, 0, 5, 5);
		gbc_result.gridx = 1;
		gbc_result.gridy = 0;
		panel.add(result, gbc_result);
		
		JLabel num1 = new JLabel("Un número:   ");
		GridBagConstraints gbc_num1 = new GridBagConstraints();
		gbc_num1.anchor = GridBagConstraints.EAST;
		gbc_num1.insets = new Insets(0, 0, 5, 5);
		gbc_num1.gridx = 1;
		gbc_num1.gridy = 1;
		panel.add(num1, gbc_num1);
		
		txt1 = new JTextField();
		txt1.setColumns(10);
		GridBagConstraints gbc_txt1 = new GridBagConstraints();
		gbc_txt1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt1.insets = new Insets(0, 0, 5, 5);
		gbc_txt1.gridx = 2;
		gbc_txt1.gridy = 1;
		panel.add(txt1, gbc_txt1);
		
		JLabel num2 = new JLabel("Otro número:   ");
		GridBagConstraints gbc_num2 = new GridBagConstraints();
		gbc_num2.anchor = GridBagConstraints.EAST;
		gbc_num2.insets = new Insets(0, 0, 5, 5);
		gbc_num2.gridx = 1;
		gbc_num2.gridy = 2;
		panel.add(num2, gbc_num2);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		GridBagConstraints gbc_txt2 = new GridBagConstraints();
		gbc_txt2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt2.insets = new Insets(0, 0, 5, 5);
		gbc_txt2.gridx = 2;
		gbc_txt2.gridy = 2;
		panel.add(txt2, gbc_txt2);
		
		JPanel panel_botones = new JPanel();
		GridBagConstraints gbc_panel_botones = new GridBagConstraints();
		gbc_panel_botones.gridwidth = 5;
		gbc_panel_botones.fill = GridBagConstraints.BOTH;
		gbc_panel_botones.gridx = 0;
		gbc_panel_botones.gridy = 3;
		panel.add(panel_botones, gbc_panel_botones);
		panel_botones.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_operaciones = new JPanel();
		FlowLayout fl_panel_operaciones = (FlowLayout) panel_operaciones.getLayout();
		fl_panel_operaciones.setVgap(15);
		fl_panel_operaciones.setHgap(30);
		panel_botones.add(panel_operaciones, BorderLayout.NORTH);
		
		JButton sumar = new JButton("Sumar");
		panel_operaciones.add(sumar);
		sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sumar();
//				result = txt1 + txt2;
			}
		});
		

		
		JButton restar = new JButton("Restar");
		panel_operaciones.add(restar);
		restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});

		
		JPanel panel_salir = new JPanel();
		panel_botones.add(panel_salir, BorderLayout.EAST);
		
		JButton salir = new JButton("SALIR");
		panel_salir.add(salir);
		salir.setAlignmentX(Component.RIGHT_ALIGNMENT);
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				cerrar1();
			}
		});
	}




	/**
	 * 
	 * @param args
	 */
	
	public JTextField gettxt1() {
		return txt1;
	}
	
	public void settxt1(JTextField txt1) {
		this.txt1 = txt1;
	}
	
	public JTextField gettxt2() {
		return txt2;
	}
	
	public void settxt2(JTextField txt2) {
		this.txt2 = txt2;
	}
	
	private void sumar() {
		if (result != null) {
			result.setText("" + txt1 + txt2);
			
		}
	}
	
	public static void main(String[] args) {
		CALCULADORA.getInstance().setVisible(true);
	}
	
	private void cerrar1() {
		String [] opciones ={"Sí","No"};
		eleccion = JOptionPane.showOptionDialog(cerrar,"¿Quieres cerrar la aplicación?","",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opciones, "Sí");
		if (eleccion == JOptionPane.YES_OPTION) {
			cerrar2();
		}
	}
	
	private void cerrar2() {
		String [] opciones ={"Sí","No"};
		int eleccion = JOptionPane.showOptionDialog(cerrar,"¿Seguro?","",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opciones, "Sí");
		if (eleccion == JOptionPane.YES_OPTION) {
			cerrar3();
		}
	}
	
	private void cerrar3() {
		String [] opciones ={"Sí","No"};
		int eleccion = JOptionPane.showOptionDialog(cerrar,"¿De verdad?","",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opciones, "Sí");
		if (eleccion == JOptionPane.YES_OPTION) {
			cerrar4();
		}
	}
	
	private void cerrar4() {
		String [] opciones ={"Sí","No"};
		int eleccion = JOptionPane.showOptionDialog(cerrar,"¿Quieres cambiar de opinión?","",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opciones, "Sí");
		if (eleccion == JOptionPane.NO_OPTION) {
			cerrar5();
		}
	}

	private void cerrar5() {
		String [] opciones ={"¡SÍ!","¡NO!"};
		int eleccion = JOptionPane.showOptionDialog(cerrar,"¿Estás completamente seguro?","",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opciones, "Sí");
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);;
		}
	}
	
}
