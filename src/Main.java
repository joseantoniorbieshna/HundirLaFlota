import java.util.Scanner;

import Modulo.Barco;
import Modulo.Tablero;
import Modulo.Casilla;
import Modulo.GestionDatos;

public class Main {
	public static void main(String[] args) {
		GestionDatos gestion = new GestionDatos();
		gestion.imprimirTablero();
		System.out.println("ELEGIR POS Y :");
		int y= new Scanner(System.in).nextInt();
		System.out.println("ELEGIR POS X :");
		int x= new Scanner(System.in).nextInt();
		gestion.hacerMovimiento(y, x);
		System.out.println("\n");
		gestion.imprimirTableroJugador();
	}
}
