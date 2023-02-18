package controlador;

import Modulo.Casilla;
import Modulo.GestionDatos;

public class Controlador {

	GestionDatos gestion = new GestionDatos();
	
	public Casilla[][] getTablero(){
		return gestion.getTablero().getTablero();
	}
	
	public boolean hacerMovimiento(int y,int x) {
		return gestion.hacerMovimiento(y, x);
	}
	
	public boolean decirHayGanador() {
		return gestion.getHasGanado();
	}
	
	public String getJugador() {
		if(gestion.getJugador()==1) {
			return "JUGADOR 1";
		}else {
			return "JUGADOR 2";
		}
	}
	
	public boolean esturnoJugador1() {
		return gestion.turnoJugador1();
	}
	
}
