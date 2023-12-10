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
			if (e.getSource() == ventana.getTamanio()) {
				ventana.setSize(Integer.parseInt(ventana.getCaja1().getText()),
				Integer.parseInt(ventana.getCaja2().getText()));
			} else {
			System.exit(0);
		}
	}
	
}
