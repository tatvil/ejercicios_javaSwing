package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import controlador.ManejadorEventos;

public class Ventana extends JFrame{

	private JButton boton1;
	private JLabel etiqueta;
	private JTextField cajaTexto;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 150);
		setLocationRelativeTo(null);
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
		}
	
	private void inicializarComponentes() {
		etiqueta = new JLabel("Usuario:");
		etiqueta.setBounds(10, 10, 50, 20);
		cajaTexto = new JTextField();
		cajaTexto.setBounds(70, 10, 150, 20);
		boton1 = new JButton("Aceptar");
		boton1.setBounds(70, 50, 100, 30);
		add(etiqueta);
		add(cajaTexto);
		add(boton1);
		}
	
	public void establecerManejador(ManejadorEventos manejador) {
		boton1.addActionListener(manejador);
		}
	
	public JTextField getCajaTexto() {
		return cajaTexto;
		}


}
