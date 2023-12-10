package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.Ventana;

public class ManejadorEventos implements ActionListener {
	
	private Ventana ventana;
	
	public ManejadorEventos(Ventana ventana) {
	this.ventana = ventana;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		String eleccion=ventana.getCombo().getSelectedItem().toString();
		
		if (eleccion=="amarillo") {
			ventana.getContentPane().setBackground(new Color(255,255,0));
		} else if (eleccion == "rojo") {
			ventana.getContentPane().setBackground(new Color(255,0,0));
		} else if (eleccion == "azul") {
			ventana.getContentPane().setBackground(new Color(0,0,255));
		} else if (eleccion == "verde") {
			ventana.getContentPane().setBackground(new Color(0,255,0));
		} else if (eleccion == "blanco") {
			ventana.getContentPane().setBackground(new Color(255,255,255));
		}
		
		

	}
}
