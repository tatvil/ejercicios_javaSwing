package vista;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controlador.ManejadorEventos;

public class Ventana extends JFrame {
	private JRadioButton radio1, radio2;
	private ButtonGroup grupo;
	private JLabel etiqueta1, etiqueta2, etiqueta3;
	private JTextField caja1, caja2;
	private JButton boton;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 300);
		setLocationRelativeTo(null);
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	private void inicializarComponentes() {

		etiqueta1 = new JLabel("numero 1:");
		etiqueta1.setBounds(20, 20, 100, 30);
		
		caja1 = new JTextField();
		caja1.setBounds(100, 20, 50, 30);
		
		etiqueta2 = new JLabel("numero 2:");
		etiqueta2.setBounds(20, 55, 100, 30);
		
		caja2 = new JTextField();
		caja2.setBounds(100, 55, 50, 30);
		
		radio1 = new JRadioButton("sumar");
		radio1.setBounds(60, 90, 100, 30);
		
		radio2 = new JRadioButton("restar");
		radio2.setBounds(60, 125, 100, 30);
		
		grupo = new ButtonGroup();
		grupo.add(radio1);
		grupo.add(radio2);
		
		boton = new JButton("Aceptar");
		boton.setBounds(40, 170, 100, 30);
		
		etiqueta3 = new JLabel();
		etiqueta3.setBounds(20, 210, 150, 30);
	
		add(etiqueta1);
		add(caja1);
		add(etiqueta2);
		add(caja2);
		add(radio1);
		add(radio2);
		add(boton);
		add(etiqueta3);
		}
	public void establecerManejador(ManejadorEventos manejador) {
		boton.addActionListener(manejador);
		}

	public JRadioButton getRadio1() {
		return radio1;
	}

	public JLabel getEtiqueta3() {
		return etiqueta3;
	}

	public JTextField getCaja1() {
		return caja1;
	}

	public JTextField getCaja2() {
		return caja2;
	}
}
