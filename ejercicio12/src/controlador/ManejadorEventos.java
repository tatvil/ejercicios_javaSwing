package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import vista.Ventana;

public class ManejadorEventos implements ActionListener {
	private Ventana ventana;
	
	public ManejadorEventos(Ventana ventana) {
		this.ventana = ventana;
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JPanel panel = ventana.getPanel();
		if (e.getSource() == ventana.getColor1()) {
			panel.setBackground(Color.red);
		} else if (e.getSource() == ventana.getColor2()) {
			panel.setBackground(Color.green);
		} else {
			panel.setBackground(Color.blue);
		}
	}
}
