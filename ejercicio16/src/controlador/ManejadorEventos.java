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
		int resultado;
		int numero1 = Integer.parseInt(ventana.getCaja1().getText());
		int numero2 = Integer.parseInt(ventana.getCaja2().getText());
		if (ventana.getRadio1().isSelected()) {
			resultado = numero1 + numero2;
		} else {
			resultado = numero1 - numero2;
		}
		ventana.getEtiqueta3().setText("el resultado es " + resultado);
	}
}
