package Modulo;

public class GestionDatos {
	private Tablero tablero = new Tablero();
	private Barco barco = new Barco();
	private int turno=0;
	
	public GestionDatos() {
		//INICIAMOS TABLERO CON BARCO
		this.barco.generateBoatPosition(this.tablero.getTablero());
		this.tablero.setBarcoEnTablero(barco.getBoatCords());
		
	}
	public void hacerMovimiento(int y,int x) {
		Casilla casillaSeleccionada = tablero.getValorPos(y, x);
		//SI CASILLA ES BARCO O AGUA CAMBIAR A HIT
		if(casillaSeleccionada==Casilla.barco) {
			tablero.setValorPos(y, x, Casilla.hitBarco);
			turno++;
		}else if(casillaSeleccionada==Casilla.agua) {
			tablero.setValorPos(y, x, Casilla.hitAgua);
			turno++;
		}
	}
	public void imprimirTablero() {
		tablero.visualizarTablero();
	}
	public void imprimirTableroJugador() {
		tablero.visualizarTableroVisibleJugador();
	}
}
