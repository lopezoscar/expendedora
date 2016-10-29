package pantallas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class BarraMenu extends JMenuBar {

	private PanelManager manejador;
	
	public BarraMenu() {
	}
	
	public void establecerManejador(PanelManager handler) {
		this.manejador = handler;
	}
	
	public void armarBarra() {
		JMenu archivo = new JMenu("Archivo");
		
		JMenuItem salir = new JMenuItem("Salir");
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manejador.mostrarSalir();
			}
		});
		
		archivo.add(salir);
		
		JMenu paneles = new JMenu("Opciones");
		
		JMenuItem mostrarUnPanel = new JMenuItem("ABM");
		mostrarUnPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manejador.mostrarUnPanel();
			}
		});
		
		paneles.add(mostrarUnPanel);
		
		
		add(archivo);
		add(paneles);
		
	}

}