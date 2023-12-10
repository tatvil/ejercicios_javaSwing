package vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.ManejadorEventos;

public class Ventana extends JFrame{

	private JLabel etiquetaHex, etiquetaDec, etiquetaR, etiquetaG, etiquetaB;
	private JComboBox comboR, comboG, comboB;
	private JTextField hexR, hexG, hexB;
	private JButton boton;
	
	public Ventana() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(300,400);
			getContentPane().setBackground(new Color(0, 0, 0));
			setLocationRelativeTo(null);
			setLayout(null);
			inicializarComponentes();
			setVisible(true);
		}
		
		private void inicializarComponentes() {
			
			etiquetaHex = new JLabel("DECIMAL");
			etiquetaHex.setBounds(70, 10, 100, 20);
			etiquetaHex.setForeground(new Color(255,255,255));
			
			etiquetaDec = new JLabel("HEXADECIMAL");
			etiquetaDec.setBounds(170, 10, 100, 20);
			etiquetaDec.setForeground(new Color(255,255,255));
			
			etiquetaR = new JLabel("Rojo:");
			etiquetaR.setBounds(10, 60, 50, 20);
			etiquetaR.setForeground(new Color(255,255,255));
			
			comboR = new JComboBox();
			comboR.setBounds(70, 60, 75, 20);
			
			hexR = new JTextField();
			hexR.setBounds(170, 60, 75, 20);
			
			etiquetaG = new JLabel("Verde:");
			etiquetaG.setBounds(10, 110, 50, 20);
			etiquetaG.setForeground(new Color(255,255,255));
			
			comboG = new JComboBox();
			comboG.setBounds(70, 110, 75, 20);
			
			hexG = new JTextField();
			hexG.setBounds(170, 110, 75, 20);
			
			etiquetaB = new JLabel("Azul:");
			etiquetaB.setBounds(10, 170, 50, 20);
			etiquetaB.setForeground(new Color(255,255,255));
			
			comboB = new JComboBox();
			comboB.setBounds(70, 170, 75, 20);
			
			hexB = new JTextField();
			hexB.setBounds(170, 170, 75, 20);
			
			boton = new JButton("Fijar color");
			boton.setBounds(100, 230, 100, 30);
			
			for (int i = 0; i <=255; i++)
			{
				comboR.addItem(String.valueOf(i));
				comboG.addItem(String.valueOf(i));
				comboB.addItem(String.valueOf(i));
			}
			
			add(etiquetaDec);
			add(etiquetaHex);
			add(etiquetaR);
			add(comboR);
			add(hexR);
			add(etiquetaG);
			add(comboG);
			add(hexG);
			add(etiquetaB);
			add(comboB);
			add(hexB);
			add(boton);
		}
		
		public void establecerManejador(ManejadorEventos manejador) {
			boton.addActionListener(manejador);
			hexR.addActionListener(manejador);
			hexG.addActionListener(manejador);
			hexB.addActionListener(manejador);
			}
		
		public JComboBox getComboR() {
			return comboR;
			}

		public JComboBox getComboG() {
			return comboG;
		}

		public JComboBox getComboB() {
			return comboB;
		}

		public JTextField getHexR() {
			return hexR;
		}

		public JTextField getHexG() {
			return hexG;
		}

		public JTextField getHexB() {
			return hexB;
		}

		public void setComboR(int selectedValue) {
		    comboR.setSelectedItem(String.valueOf(selectedValue));
		}

		public void setComboG(int selectedValue) {
		    comboG.setSelectedItem(String.valueOf(selectedValue));
		}

		public void setComboB(int selectedValue) {
		    comboB.setSelectedItem(String.valueOf(selectedValue));
		}

		public JButton getBoton() {
			return boton;
		}
		
}
