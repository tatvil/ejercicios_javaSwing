package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import controlador.ManejadorEventos;

public class Ventana extends JFrame {
	private JButton boton;
	private JLabel etiqueta1, etiqueta2;
	private JTextArea mensaje1, mensaje2;
	private JScrollPane pane1, pane2;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 270);
		setLocationRelativeTo(null);
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	private void inicializarComponentes() {
		etiqueta1 = new JLabel("mensaje 1:");
		etiqueta1.setBounds(20, 20, 80, 20);
		
		mensaje1 = new JTextArea();
		mensaje1.setLineWrap(true);
		
		pane1 = new JScrollPane(mensaje1);
		pane1.setBounds(20, 45, 200, 100);
		
		etiqueta2 = new JLabel("mensaje 2:");
		etiqueta2.setBounds(235, 20, 80, 20);
		
		mensaje2 = new JTextArea();
		mensaje2.setLineWrap(true);
		
		pane2 = new JScrollPane(mensaje2);
		pane2.setBounds(235, 45, 200, 100);
		
		boton = new JButton("Comparar");
		boton.setBounds(170, 170, 100, 30);
		
		add(etiqueta1);
		add(pane1);
		add(etiqueta2);
		add(pane2);
		add(boton);
	}
	
		public void establecerManejador(ManejadorEventos manejador) {
			boton.addActionListener(manejador);
		}
		
		public JTextArea getMensaje1() {
			return mensaje1;
		}
		public JTextArea getMensaje2() {
			return mensaje2;
		}
}
