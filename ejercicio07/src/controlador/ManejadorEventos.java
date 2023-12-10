package controlador;

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
		String texto, contenido1, contenido2;
		
		contenido1 = ventana.getMensaje1().getText();
		contenido2 = ventana.getMensaje2().getText();
		
		if (contenido1.equalsIgnoreCase(contenido2)) {
			texto = "Los mensajes son iguales";
		} else {
			texto = "Los mensajes son distintos";
		}
		
		JOptionPane.showMessageDialog(null, texto, "",JOptionPane.INFORMATION_MESSAGE);
	}
	
}
