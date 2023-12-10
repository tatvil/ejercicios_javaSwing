package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana;

public class ManejadorEventos implements ActionListener {
	private Ventana ventana;
	
	public ManejadorEventos (Ventana ventana) {
		this.ventana = ventana;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String contrasena = String.copyValueOf(ventana.getCajaTexto2().getPassword());
 		
		if (ventana.getCajaTexto1().getText().equals("juan") && contrasena.equals("abc123")) {
			ventana.setTitle("correcto");
		} else {
			ventana.setTitle("incorrecto");
		}
	}
}
