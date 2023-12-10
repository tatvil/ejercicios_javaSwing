package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import controlador.ManejadorEventos;

public class Ventana extends JFrame {

	private JMenuBar barra;
	private JMenu menuOpciones;
	private JMenuItem tamanio, salir;
	private JLabel etiqueta1, etiqueta2;
	private JTextField caja1, caja2;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
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
		
		tamanio = new JMenuItem("Cambiar tamaño de la ventana");
		salir = new JMenuItem("Salir");
		
		menuOpciones.add(tamanio);
		menuOpciones.add(salir);
		
		etiqueta1 = new JLabel("Ancho");
		etiqueta1.setBounds(50, 20, 50, 30);
		
		caja1 = new JTextField();
		caja1.setBounds(105, 20, 50, 30);
		
		etiqueta2 = new JLabel("Alto");
		etiqueta2.setBounds(50, 55, 50, 30);
		
		caja2 = new JTextField();
		caja2.setBounds(105, 55, 50, 30);
		
		add(etiqueta1);
		add(etiqueta2);
		add(caja1);
		add(caja2);
	}
	
	public void establecerManejador(ManejadorEventos manejador) {
		tamanio.addActionListener(manejador);
		salir.addActionListener(manejador);
		}
	public JMenuItem getTamanio() {
		return tamanio;
		}
	
	public JTextField getCaja1() {
		return caja1;
		}
	
	public JTextField getCaja2() {
		return caja2;
		}
}
