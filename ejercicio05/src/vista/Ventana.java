package vista;

import javax.swing.*;
import controlador.ManejadorEventos;

public class Ventana extends JFrame {
	private JTextField cajaTexto1;
	private JLabel etiqueta1, etiqueta2;
	private JTextArea mensaje;
	private JScrollPane scroll;
	private JButton botonEnviar;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 250);
		setLocationRelativeTo(null);
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	private void inicializarComponentes() {
		etiqueta1 = new JLabel("mail:");
		etiqueta1.setBounds(20, 10, 200, 20);
		
		cajaTexto1 = new JTextField();
		cajaTexto1.setBounds(20, 35, 200, 20);
		
		etiqueta2 = new JLabel("mensaje:");
		etiqueta2.setBounds(20, 60, 80, 20);
		
		mensaje = new JTextArea();
		mensaje.setLineWrap(true);
		
		scroll = new JScrollPane(mensaje);
		scroll.setBounds(20, 85, 200, 100);
		
		botonEnviar = new JButton("Enviar");
        botonEnviar.setBounds(20, 190, 80, 25);
        
		add(etiqueta1);
		add(cajaTexto1);
		add(etiqueta2);
		add(scroll);
		add (botonEnviar);
	}
}
