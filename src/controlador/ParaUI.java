package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modulo.Casilla;
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
		
		printBotonesConTablero(0);
		
	}
	
	
	public void setComportamientoBoton() {
		this.comportamientoBoton = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//COMPROBAR SI ES JUGADOR 1
				if(control.getJugador().equalsIgnoreCase("jugador1") && control.esturnoJugador1()) {
					control.hacerMovimiento(((MyButton)e.getSource()).getPosY(), ((MyButton)e.getSource()).getPosX());
				}
				if(control.getJugador().equalsIgnoreCase("jugador2") && !control.esturnoJugador1()){
					control.hacerMovimiento(((MyButton)e.getSource()).getPosY(), ((MyButton)e.getSource()).getPosX());	
				}
				
				printBotonesConTablero(0);					
				if(control.decirHayGanador()) {
					getLblMessage().setText("Felicidades has Ganados");
				}
				
			}
		};
	}
	
	public void printBotonesConTablero(int modo) {
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
				else if(control.getTablero()[y][x]==Casilla.barco && modo==1) {
					getBotones()[y][x].setBackground(Color.green);
				}
			}
		}
	}
	
	
}