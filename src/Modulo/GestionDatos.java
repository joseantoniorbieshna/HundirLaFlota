package Modulo;

public class GestionDatos {
	private Tablero tablero = new Tablero();
	private Barco barco = new Barco();
	private static int turno=0;
	private boolean hasGanado=false;
	private static int aumentarIdJugador=1;
	public int jugador;
	public static Casilla[][]tableroFlotaJugador1;
	public static Casilla[][]tableroFlotaJugador2;
	
	public GestionDatos() {
		jugador=aumentarIdJugador;
		aumentarIdJugador++;
		
		//INICIAMOS TABLERO CON BARCO
		this.barco.generateBoatPosition(this.tablero.getTablero());
		this.tablero.setBarcoEnTablero(barco.getBoatCords());
		
		//SET STATIC JUGADOR
		if(jugador==1) {
			tableroFlotaJugador1 = this.tablero.getTablero();
		}else {
			tableroFlotaJugador2 = this.tablero.getTablero();
		}
		
	}
	
	
	public void hacerMovimiento(int y,int x) {
		Casilla casillaSeleccionada = tablero.getValorPos(y, x);
		//SI CASILLA ES BARCO O AGUA CAMBIAR A HIT
		if(casillaSeleccionada==Casilla.barco && !hasGanado) {
			tablero.setValorPos(y, x, Casilla.hitBarco);
			hasGanado=tablero.comprobarHasCaidoBarco();
			turno++;
		}else if(casillaSeleccionada==Casilla.agua && !hasGanado) {
			tablero.setValorPos(y, x, Casilla.hitAgua);
			hasGanado=tablero.comprobarHasCaidoBarco();
			turno++;
		}
	}
	public boolean getHasGanado() {
		return hasGanado;
	}
	
	public Tablero getTablero() {
		return tablero;
	}
	public int getJugador() {
		return this.jugador;
	}
	public boolean turnoJugador1() {
		return turno%2==0;
	}
	
	
}
