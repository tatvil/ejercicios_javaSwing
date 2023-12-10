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
		
		try {
			if (!ventana.getHexR().getText().isEmpty()) {
				ventana.setComboR(Integer.parseInt(ventana.getHexR().getText(), 16));
			}
		
			if (!ventana.getHexG().getText().isEmpty()) {
				ventana.setComboG(Integer.parseInt(ventana.getHexG().getText(), 16));
			}
		
			if (!ventana.getHexB().getText().isEmpty()) {
				ventana.setComboB(Integer.parseInt(ventana.getHexB().getText(), 16));
			}
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(ventana, "Ingrese un número hexadecimal válido.", "Error", JOptionPane.ERROR_MESSAGE);
		}
			
		int rojo  = Integer.parseInt(ventana.getComboR().getSelectedItem().toString());
		int verde = Integer.parseInt(ventana.getComboG().getSelectedItem().toString());
		int azul  = Integer.parseInt(ventana.getComboB().getSelectedItem().toString());
		
		ventana.getContentPane().setBackground(new Color(rojo,verde,azul));
//		ventana.getBoton().setBackground(new Color(rojo,verde,azul));
	}
}