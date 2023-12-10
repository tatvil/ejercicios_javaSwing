package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import vista.Ventana;

public class ManejadorEventos implements ActionListener, ChangeListener {

	private Ventana ventana;
	
	public ManejadorEventos(Ventana ventana) {
		this.ventana = ventana;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		if (!ventana.getCheckBox1().isSelected()) {
			ventana.getBoton().setEnabled(false);
		} else {
			ventana.getBoton().setEnabled(true);
		}
	}
	
}
