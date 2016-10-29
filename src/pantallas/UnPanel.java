package pantallas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import exceptions.ServicioException;
import modelo.Expendedora;
import modelo.Producto;
import servicios.ExpendedoraService;
import servicios.ExpendedoraServiceImpl;

public class UnPanel extends JPanel {
	
	private PanelManager m;
	
	public UnPanel(PanelManager m) {
		super();
		this.m = m;
	}
	
	public void armarUnPanel() {
		this.setLayout(new BorderLayout());
		JButton j = new JButton("Agregar fichas");
		
		add(j, BorderLayout.SOUTH);
		
		
		j.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("PRODUCTO LISTADO ");
				ExpendedoraService expendedoraService = new ExpendedoraServiceImpl();
				try {
					for(Producto p : expendedoraService.listarTodos()){
						
					}
					
				} catch (ServicioException ek) {
					// TODO Auto-generated catch block
					ek.printStackTrace();
				}
				m.mostrarUnPanel();
			}
			
		});
		
		
	}

}
