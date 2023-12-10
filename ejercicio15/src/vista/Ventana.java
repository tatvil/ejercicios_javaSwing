package vista;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import controlador.ManejadorEventos;

public class Ventana extends JFrame {

	private JRadioButton radio1, radio2, radio3;
	private ButtonGroup grupo;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	private void inicializarComponentes() {
		
		radio1 = new JRadioButton("640x480");
		radio1.setBounds(50, 20, 100, 30);
		
		radio2 = new JRadioButton("800x600");
		radio2.setBounds(50, 50, 100, 30);
		
		radio3 = new JRadioButton("1024x768");
		radio3.setBounds(50, 80, 100, 30);
		
		grupo = new ButtonGroup();
		grupo.add(radio1);
		grupo.add(radio2);
		grupo.add(radio3);
		
		add(radio1);
		add(radio2);
		add(radio3);

	}
	
	public void establecerManejador(ManejadorEventos manejador) {
		radio1.addActionListener(manejador);
		radio2.addActionListener(manejador);
		radio3.addActionListener(manejador);
		}

	public JRadioButton getRadio1() {
		return radio1;
	}

	public JRadioButton getRadio2() {
		return radio2;
	}

	public JRadioButton getRadio3() {
		return radio3;
	}
}
