package controlador;

import vista.Ventana;

public class Main {
	
	public static void main(String[] args) {
		Ventana miVentana = new Ventana();
		ManejadorEventos manejador = new ManejadorEventos(miVentana);
		miVentana.establecerManejador(manejador);
		}
	}
