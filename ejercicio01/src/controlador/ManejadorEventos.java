package controlador;

import vista.Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ManejadorEventos implements ActionListener {
	private Principal principal;
	
	public ManejadorEventos(Principal principal) {
		this.principal = principal;
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		principal.setTitle(boton. getText());
		}

}
