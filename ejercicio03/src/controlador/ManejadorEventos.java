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
		int suma = Integer.parseInt(ventana.getCajaTexto1().getText())
				 + Integer.parseInt(ventana.getCajaTexto2().getText());
		ventana.setTitle(String.valueOf(suma));
	}

}
