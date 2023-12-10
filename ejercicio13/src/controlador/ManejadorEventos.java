package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana;

public class ManejadorEventos implements ActionListener {
	private Ventana ventana;
	
	public ManejadorEventos(Ventana ventana) {
			this.ventana = ventana;
		}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == ventana.getTam1()) {
				ventana.setSize(400, 400);
				ventana.getPanel().setSize(400, 400);
			}
			if (e.getSource() == ventana.getTam2()) {
				ventana.setSize(600, 600);
				ventana.getPanel().setSize(600, 600);
			}
			if (e.getSource() == ventana.getRojo()) {
				ventana.getPanel().setBackground(Color.red);
			}
			if (e.getSource() == ventana.getVerde()) {
				ventana.getPanel().setBackground(Color.green);
			}
		}
}
