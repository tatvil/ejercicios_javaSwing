package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import controlador.ManejadorEventos;

public class Ventana extends JFrame{

	private JButton boton1;
	private JTextField cajaTexto1, cajaTexto2;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 150);
		setLocationRelativeTo(null);
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}

	public JTextField getCajaTexto1() {
		return cajaTexto1;
	}

	public JTextField getCajaTexto2() {
		return cajaTexto2;
	}
	
	private void inicializarComponentes() {
		cajaTexto1 = new JTextField();
		cajaTexto1.setBounds(50, 10, 100, 20);
		cajaTexto2 = new JTextField();
		cajaTexto2.setBounds(50, 40, 100, 20);
		boton1 = new JButton("Sumar");
		boton1.setBounds(50, 70, 100, 30);
		add(cajaTexto1);
		add(cajaTexto2);
		add(boton1);
		}
	
	public void establecerManejador(ManejadorEventos manejador) {
		boton1.addActionListener(manejador);
		}

}
