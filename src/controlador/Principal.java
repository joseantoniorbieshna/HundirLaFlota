package controlador;
import java.awt.EventQueue;

import vista.UI;

public class Principal {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new ParaUI();
					UI frame2 = new ParaUI();
					frame2.setLocation(800, 50);
					frame.setVisible(true);
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
