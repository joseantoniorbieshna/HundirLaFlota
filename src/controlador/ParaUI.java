package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modulo.Casilla;
import Modulo.GestionDatos;
import Modulo.Tablero;
import vista.UI;

public class ParaUI extends UI {
	ControladorTableroTurno control = new ControladorTableroTurno();
	ActionListener comportamientoBoton;
	public ParaUI() {
		super();
		setComportamientoBoton();
		//SETEO EL COMPORTAMIENTO DE LOS BOTONES
		for(int y=0;y<getBotones().length;y++){
			for(int x=0;x<getBotones().length;x++) {
				getBotones()[y][x].addActionListener(comportamientoBoton);
			}
		}
		getLblJugador().setText(control.getJugador());
		printBotonesConTablero();
		
	}
	
	
	public void setComportamientoBoton() {
		this.comportamientoBoton = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//COMPROBAR SI ES JUGADOR 1
				if(control.getJugador().equalsIgnoreCase("jugador 1") && control.esturnoJugador1()
						//Y hacer movimiento es igual a true
						&& control.hacerMovimiento(((MyButton)e.getSource()).getPosY(), ((MyButton)e.getSource()).getPosX())) {
					
					Principal.frameJugador2.getLbDecirTurno().setText("TURNO");
					Principal.frameJugador1.getLbDecirTurno().setText("");
					
					printBotonesMiTablero(GestionDatos.tableroFlotaJugador2);
					
				}
				if(control.getJugador().equalsIgnoreCase("jugador 2") && !control.esturnoJugador1()
						&& control.hacerMovimiento(((MyButton)e.getSource()).getPosY(), ((MyButton)e.getSource()).getPosX()) ){
					
					Principal.frameJugador1.getLbDecirTurno().setText("TURNO");
					Principal.frameJugador2.getLbDecirTurno().setText("");
					printBotonesMiTablero(GestionDatos.tableroFlotaJugador1);
					
				}
				
				printBotonesConTablero();					
				if(control.decirHayGanador()) {
					getLblMessage().setText(control.getJugador()+". FELICIDADES HAS GANADO!!");
					Principal.frameJugador1.getLbDecirTurno().setText("");
					Principal.frameJugador2.getLbDecirTurno().setText("");
				}
				
			}
		};
	}
	
	public void printBotonesConTablero() {
		for(int y=0;y<control.getTablero().length;y++) {
			for(int x=0;x<control.getTablero()[0].length;x++) {
				//CAMBIO COLOR
				if (control.getTablero()[y][x]==Casilla.hitAgua) {
					getBotones()[y][x].setBackground(Color.blue);
					getBotones()[y][x].setText("X");
				}else if(control.getTablero()[y][x]==Casilla.hitBarco ) {
					getBotones()[y][x].setBackground(Color.red);
					getBotones()[y][x].setText("X");
				}
				/*else if(control.getTablero()[y][x]==Casilla.barco && modo==1) {
					getBotones()[y][x].setBackground(Color.green);
				}*/
			}
		}
	}
	
	public void printBotonesMiTablero(Casilla[][] tablero) {
		for(int y=0;y<tablero.length;y++) {
			for(int x=0;x<tablero[0].length;x++) {
				//CAMBIO COLOR
				if(tablero[y][x]==Casilla.barco ) {
					getbotonesNoInteractivos()[y][x].setBackground(Color.green);
				}
			}
		}
	}
	
	
}
