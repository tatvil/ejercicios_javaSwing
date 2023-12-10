package controlador;
import vista.Principal;

public class Main {

	public static void main(String[] args) {

			Principal miVentana = new Principal();
			
			ManejadorEventos manejador = new ManejadorEventos(miVentana);
			miVentana.establecerManejador(manejador);
			}

	}
