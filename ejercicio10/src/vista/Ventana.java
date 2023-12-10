package vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.ManejadorEventos;

public class Ventana extends JFrame{

	private JLabel etiquetaNombre, etiquetaPais;
	private JComboBox comboPais;
	private JTextField textoNombre;
	private JButton boton;
	
	public Ventana() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(300,400);
			setLocationRelativeTo(null);
			setLayout(null);
			inicializarComponentes();
			setVisible(true);
		}
		
		@SuppressWarnings("unchecked")
		private void inicializarComponentes() {
			
			etiquetaNombre = new JLabel("Nombre:");
			etiquetaNombre.setBounds(10, 10, 50, 20);
			
			textoNombre = new JTextField();
			textoNombre.setBounds(70, 10, 200, 20);
			
			etiquetaPais = new JLabel("Pais:");
			etiquetaPais.setBounds(10, 60, 50, 20);
			
			String[] paises = { "Alemania", "Belgica", "Dinamarca", "España", "Francia", "Grecia", "Italia" };
			comboPais = new JComboBox(paises);
			comboPais.setBounds(70, 60, 200, 20);
			
			boton = new JButton("Aceptar");
			boton.setBounds(100, 230, 100, 30);
			
			add(etiquetaNombre);
			add(textoNombre);
			add(etiquetaPais);
			add(comboPais);
			add(boton);
		}
		
		public void establecerManejador(ManejadorEventos manejador) {
			boton.addActionListener(manejador);
			}
		
		public JButton getBoton() {
			return boton;
		}

		public JComboBox getComboPais() {
			return comboPais;
		}

		public JTextField getTextoNombre() {
			return textoNombre;
		}
}
