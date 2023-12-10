package vista;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import controlador.ManejadorEventos;

public class Ventana extends JFrame {

	JMenuBar barraMenu;
	JMenu menuOpciones, menuTamaño, menuColor;
	JMenuItem tam1, tam2, rojo, verde;
	JPanel panel;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
		}
	
	private void inicializarComponentes() {
		barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		menuOpciones = new JMenu("Opciones");
		barraMenu.add(menuOpciones);
		menuTamaño = new JMenu("Tamaño de la ventana");
		menuColor = new JMenu("Color de fondo");
		menuOpciones.add(menuTamaño);
		menuOpciones.add(menuColor);
		tam1 = new JMenuItem("400x400");
		tam2 = new JMenuItem("600x600");
		menuTamaño.add(tam1);
		menuTamaño.add(tam2);
		rojo = new JMenuItem("Rojo");
		verde = new JMenuItem("Verde");
		menuColor.add(rojo);
		menuColor.add(verde);
		// se necesita un panel para cambiar el color de fondo
		panel = new JPanel();
		panel.setBounds(0, 0, 300, 200);
		add(panel);
		}
	
	public void establecerManejador(ManejadorEventos manejador) {
		tam1.addActionListener(manejador);
		tam2.addActionListener(manejador);
		rojo.addActionListener(manejador);
		verde.addActionListener(manejador);
		}
	
	public JMenuItem getTam1() {
		return tam1;
		}
	
	public JMenuItem getTam2() {
		return tam2;
		}
	
	public JMenuItem getRojo() {
		return rojo;
		}
	
	public JMenuItem getVerde() {
		return verde;
		}
	
	public JPanel getPanel() {
		return panel;
		}
}
