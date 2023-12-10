package vista;

import javax.swing.JButton;
import javax.swing.JFrame;

import controlador.ManejadorEventos;

public class Principal extends JFrame{
	
	private JButton boton1, boton2,boton3;
	
	public Principal () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 290);
		setLocationRelativeTo(null);
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	private void inicializarComponentes() {
		boton1 = new JButton("1");
		boton1.setBounds(50, 50, 100, 40);
		boton2 = new JButton("2");
		boton2.setBounds(50, 100, 100, 40);
		boton3 = new JButton("3");
		boton3.setBounds(50, 150, 100, 40);
		add(boton1);
		add(boton2);
		add(boton3);
		}
	
	public void establecerManejador(ManejadorEventos manejador) {
		boton1.addActionListener(manejador);
		boton2.addActionListener(manejador);
		boton3.addActionListener(manejador);
		}
		
}
