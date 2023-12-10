package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controlador.ManejadorEventos;

public class Ventana extends JFrame{

	private JButton boton1;
	private JTextField cajaTexto1;
	private JPasswordField cajaTexto2;
	private JLabel etiqueta1, etiqueta2;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 150);
		setLocationRelativeTo(null);
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	private void inicializarComponentes() {
		etiqueta1 = new JLabel("Usuario:");
		etiqueta1.setBounds(10, 10, 80, 20);
		
		cajaTexto1 = new JTextField();
		cajaTexto1.setBounds(95, 10, 100, 20);
		
		etiqueta2 = new JLabel("Contraseña:");
		etiqueta2.setBounds(10, 35, 80, 20);
		
		cajaTexto2 = new JPasswordField();
		cajaTexto2.setBounds(95, 35, 100, 20);
		
		boton1 = new JButton("Aceptar");
		boton1.setBounds(50, 65, 100, 30);
		
		add(etiqueta1);
		add(cajaTexto1);
		add(etiqueta2);
		add(cajaTexto2);
		add(boton1);
	}

	public JTextField getCajaTexto1() {
		return cajaTexto1;
	}

	public JPasswordField getCajaTexto2() {
		return cajaTexto2;
	}
	
	public void establecerManejador(ManejadorEventos manejador) {
		boton1.addActionListener(manejador);
	}

}
