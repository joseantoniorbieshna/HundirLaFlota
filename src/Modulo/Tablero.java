package Modulo;
public class Tablero {
	private int[][]tablero = new int[11][11];
	//valor 0 para agua
	//valor 1 hit agua
	//valor 2 barco
	//valor 3 barco hit
	public Tablero() {
		//RELLENAR TABLERO
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[0].length;j++) {
				tablero[i][j]=0;
			}
		}
	}
	
	
	
	public int[][] getTablero() {
		return tablero;
	}

	public void setValorPos(int x,int y, int valor) {
		tablero[x][y] = valor;
	}
	public void visualizarTablero() {
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[0].length;j++) {
				System.out.print(tablero[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
}
