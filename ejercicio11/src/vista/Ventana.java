package vista;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controlador.ManejadorEventos;

public class Ventana extends JFrame {
	private JLabel etiqueta;
	private JCheckBox checkBox1;
	private JButton boton;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,200);
		setLocationRelativeTo(null);
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	private void inicializarComponentes() {
		checkBox1 = new JCheckBox();
		checkBox1.setBounds(10, 10, 30, 30);
		
		etiqueta = new JLabel("¿Estas de acuerdo con las normas del servicio?");
		etiqueta.setBounds(40, 10, 400, 40);
		
		boton = new JButton("Aceptar");
		boton.setBounds(100, 100, 100, 30);
		boton.setEnabled(false);
		
		add(checkBox1);
		add(etiqueta);
		add (boton);
	}
	
	public void establecerManejador(ManejadorEventos manejador) {
		checkBox1.addChangeListener(manejador);
		boton.addActionListener(manejador);
		}

	public JCheckBox getCheckBox1() {
		return checkBox1;
	}

	public void setBoton(JButton boton) {
		this.boton = boton;
	}
	
	public JButton getBoton() {
		return boton;
	}

	
	
	
}
