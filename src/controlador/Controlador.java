package controlador;

import Modulo.Casilla;
import Modulo.GestionDatos;

public class Controlador {

	GestionDatos gestion = new GestionDatos();
	
	public Casilla[][] getTablero(){
		return gestion.getTablero().getTablero();
	}
	
	public void hacerMovimiento(int y,int x) {
		gestion.hacerMovimiento(y, x);
	}
	
	public boolean decirHayGanador() {
		return gestion.getHasGanado();
	}
	
	public String getJugador() {
		if(gestion.getJugador()==1) {
			return "Jugador1";
		}else {
			return "Jugador2";
		}
	}
	
	public boolean esturnoJugador1() {
		return gestion.turnoJugador1();
	}
	
}
