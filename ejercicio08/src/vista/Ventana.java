package vista;

import javax.swing.*;
import controlador.ManejadorEventos;

public class Ventana extends JFrame{
	
	private JComboBox combo;
	
	public Ventana() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(250,200);
			setLocationRelativeTo(null);
			setLayout(null);
			inicializarComponentes();
			setVisible(true);
		}
		
		private void inicializarComponentes() {
			String[] colores = { "rojo", "amarillo", "azul", "verde", "blanco" };
			combo = new JComboBox(colores);
			combo.setBounds(20, 20, 100, 20);
			
			add(combo);
		}
		
		public void establecerManejador(ManejadorEventos manejador) {
			combo.addActionListener(manejador);
			}
		
		public JComboBox getCombo() {
			return combo;
			}
}
