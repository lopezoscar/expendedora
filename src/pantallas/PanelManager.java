package pantallas;


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PanelManager {

	private JFrame frame;
	private BarraMenu menuOpciones;
	private UnPanel unPanel;
	private JButton coca;
	
	public PanelManager() {
		// TODO Auto-generated constructor stub
	}
	
	public void armarManager() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		

		menuOpciones = new BarraMenu();
		menuOpciones.armarBarra();
		menuOpciones.establecerManejador(this);
		frame.setJMenuBar(menuOpciones);
		
		unPanel = new UnPanel(this);
		unPanel.armarUnPanel();
		
		
	}



	public void showFrame() {
		frame.setVisible(true);
	
	}

	

	public void mostrarSalir() {
		int response = JOptionPane.showConfirmDialog(frame, "Esta seguro?");
		if (response == JOptionPane.OK_OPTION) {
			System.exit(0);
		}
	}
	
	public void mostrarUnPanel() {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(unPanel);
		frame.getContentPane().validate();//RE-dispongo los elementos segun el layout
		frame.getContentPane().repaint();//RE-pinto los elementos dispuestos en el paso anterior
		
	}

	
}