package controlador;

import javax.swing.SwingUtilities;

import vista.Ventana;

public class Main {

	public static void main(String[] args) {

	    SwingUtilities.invokeLater(() -> new Ventana());
		}

	}
