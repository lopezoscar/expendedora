package pantallas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BotoneraPanel extends JPanel {

	private PanelManager m;

	public BotoneraPanel(PanelManager m) {
		this.m = m;
		armarBotoneraPanel();
	}
	
	public void armarBotoneraPanel() {
		JButton af = new JButton("Agregar Fichas");
		JButton cancelBtn = new JButton("Cancelar");

		this.add(af);
		this.add(cancelBtn);

		af.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//aca no grabo, alguien tiene que usar este boton desde afuera
			}
		});

		cancelBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("CANCEL!!");
			}
		});
	}

}
