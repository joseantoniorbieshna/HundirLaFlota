package Modulo;

import java.util.Random;

public class Barco {
	private int[][] boatCords;
	
	public void generateBoatPosition(Casilla[][] tablero) {
		Random rand = new Random();
		int sizeBoat=3;
		boolean isVertical = rand.nextBoolean();  
		//generate pos
		int x = rand.nextInt((tablero.length-3))+1;
		int y = rand.nextInt((tablero[0].length-3))+1;
		
		if(!isVertical) {//Horizontal
			int[][] boatCords = {{y, x},{y, x+1},{y, x-1}};
			this.boatCords=boatCords;
		}else {//horizontal
			int[][] boatCords = {{y, x},{y+1, x},{y-1, x}};
			this.boatCords=boatCords;
		}
	}

	public int[][] getBoatCords() {
		return boatCords;
	}
	
	
	
	
}
