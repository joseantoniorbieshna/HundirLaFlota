import Modulo.Barco;
import Modulo.Tablero;

public class Main {
	public static void main(String[] args) {
		Tablero tablero = new Tablero();
		Barco barco = new Barco();
		
		tablero.visualizarTablero();
		barco.generateBoat(tablero.getTablero());
		
		for(int i=0;i<barco.getBoatCords().length;i++) {
				tablero.setValorPos(barco.getBoatCords()[i][0], barco.getBoatCords()[i][1], 1);
		}
		System.out.println("\n\n");
		tablero.visualizarTablero();
	}
}
