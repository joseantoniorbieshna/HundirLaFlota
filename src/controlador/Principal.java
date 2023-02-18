package controlador;
import java.awt.EventQueue;

import vista.UI;

public class Principal {

	public static ParaUI frameJugador1;
	public static ParaUI frameJugador2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameJugador1 = new ParaUI();
					frameJugador2 = new ParaUI();
					frameJugador2.setLocation(800, 25);
					frameJugador2.setVisible(true);
					frameJugador1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
