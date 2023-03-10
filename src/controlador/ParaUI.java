package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modulo.Casilla;
import Modulo.GestionDatos;
import vista.UI;

public class ParaUI extends UI {
	Controlador control = new Controlador();
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
	
	//ACTION LISTENER(COMPORTAMIENTO BOTON)
	public void setComportamientoBoton() {
		this.comportamientoBoton = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//COMPROBAR SI ES JUGADOR 1
				hacerMovimiento(control.soyJugador1YesMiTurno(),e,Principal.frameJugador2, Principal.frameJugador1);
				hacerMovimiento(control.soyJugador2YesMiTurno(),e,Principal.frameJugador1, Principal.frameJugador2);

				printBotonesConTablero();	
				
				if(control.decirHayGanador()) {
					getLblMessage().setText("FELICIDADES HAS GANADO!!");
					if(control.soyJugador1YesMiTurno()) {
						Principal.frameJugador2.getLblMessage().setText("HAS PERDIDO!!");
						Principal.frameJugador2.getLblMessage().setForeground(new Color(255,0,0));
					}
					if(control.soyJugador2YesMiTurno()) {
						Principal.frameJugador1.getLblMessage().setText("HAS PERDIDO!!");
						Principal.frameJugador1.getLblMessage().setForeground(new Color(255,0,0));
					}
					Principal.frameJugador1.getLbDecirTurno().setText("");
					Principal.frameJugador2.getLbDecirTurno().setText("");
				}
				
			}
		};
	}
	
	//IMPRIMIR TABLERO PARA JUGAR
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
	
	//IMPRIMIR TABLERO INVISIBLE PARA EL OTRO JUGADOR
	public void printBotonesMiTablero(Casilla[][] tablero) {
		for(int y=0;y<tablero.length;y++) {
			for(int x=0;x<tablero[0].length;x++) {
				//CAMBIO COLOR
				if(tablero[y][x]==Casilla.barco || tablero[y][x]==Casilla.hitBarco) {
					getbotonesNoInteractivos()[y][x].setBackground(Color.green);
				}
			}
		}
	}
	public void hacerMovimiento(boolean eresJugador,ActionEvent e,ParaUI paraTurno, ParaUI paraEsperarTurno) {
		if(eresJugador
				&& control.hacerMovimiento(((MyButton)e.getSource()).getPosY(), ((MyButton)e.getSource()).getPosX())) {
			
			paraTurno.getLbDecirTurno().setText("TURNO");
			paraTurno.getLbDecirTurno().setForeground(new Color(0, 128, 0));
			paraEsperarTurno.getLbDecirTurno().setText("ESPERA TURNO");
			paraEsperarTurno.getLbDecirTurno().setForeground(new Color(0, 64, 255));
			
			if(control.getJugador().equalsIgnoreCase("Jugador 1"))
				printBotonesMiTablero(GestionDatos.tableroFlotaJugador2);
			if(control.getJugador().equalsIgnoreCase("Jugador 2"))
				printBotonesMiTablero(GestionDatos.tableroFlotaJugador1);
			
		}
	}
	
	
}
