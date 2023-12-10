package vista;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import controlador.ManejadorEventos;

public class Ventana extends JFrame {

	JMenuBar barra;
	JMenu menuOpciones;
	JMenuItem color1, color2, color3;
	JPanel panel;
	
	public Ventana () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 200);
		setLocationRelativeTo(null);
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	private void inicializarComponentes() {
		barra = new JMenuBar();
		setJMenuBar(barra);
		
		menuOpciones = new JMenu("Opciones");
		barra.add(menuOpciones);
		
		color1 = new JMenuItem("rojo");
		color2 = new JMenuItem("verde");
		color3 = new JMenuItem("azul");
		
		menuOpciones.add(color1);
		menuOpciones.add(color2);
		menuOpciones.add(color3);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 200, 200);
		add(panel);
	}
	
	public void establecerManejador(ManejadorEventos manejador) {
		color1.addActionListener(manejador);
		color2.addActionListener(manejador);
		color3.addActionListener(manejador);
		}

	public JMenuItem getColor1() {
		return color1;
	}

	public JMenuItem getColor2() {
		return color2;
	}

	public JMenuItem getColor3() {
		return color3;
	}

	public JPanel getPanel() {
		return panel;
	}
}
