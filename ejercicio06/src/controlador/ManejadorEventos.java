package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.Ventana;

public class ManejadorEventos implements ActionListener {
	private Ventana ventana;
	
	public ManejadorEventos (Ventana ventana) {
		this.ventana = ventana;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String texto;
		
		if (ventana.getMensaje().getText().contains("Argentina")) {
			texto = "El mensaje contiene la cadena 'Argentina'";
		} else {
			texto = "El mensaje NO contiene la cadena 'Argentina'";
		}
		
		JOptionPane.showMessageDialog(null, texto, "",JOptionPane.ERROR_MESSAGE);
	}
}
