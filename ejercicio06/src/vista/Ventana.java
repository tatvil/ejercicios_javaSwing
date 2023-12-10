package vista;

import javax.swing.*;

import controlador.ManejadorEventos;

public class Ventana extends JFrame{
	private  JButton boton;
	private JLabel etiqueta1;
	private JTextArea mensaje;
	private JScrollPane pane;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 270);
		setLocationRelativeTo(null);
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	private void inicializarComponentes() {
		etiqueta1 = new JLabel("mensaje:");
		etiqueta1.setBounds(20, 20, 80, 20);
		mensaje = new JTextArea();
		mensaje.setLineWrap(true);
		pane = new JScrollPane(mensaje);
		pane.setBounds(20, 45, 200, 100);
		boton = new JButton("Aceptar");
		boton.setBounds(60, 170, 100, 30);
		add(etiqueta1);
		add(pane);
		add(boton);
	}
	
	public void establecerManejador(ManejadorEventos manejador) {
		boton.addActionListener(manejador);
		}
	
	public JTextArea getMensaje() {
		return mensaje;
	}

}
