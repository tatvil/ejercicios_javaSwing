package controlador;

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
			if (e.getSource() == ventana.getRadio1()) {
				ventana.setSize(640, 480);
				} else if (e.getSource() == ventana.getRadio2()) {
				ventana.setSize(800, 600);
				} else if (e.getSource() == ventana.getRadio3()) {
				ventana.setSize(1024, 768);
				}
		}
	}
