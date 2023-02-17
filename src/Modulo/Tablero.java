package Modulo;
public class Tablero {
	private Casilla[][]tablero = new Casilla[11][11];
	//valor 0 para agua
	//valor 1 hit agua
	//valor 2 barco
	//valor 3 barco hit
	public Tablero() {
		//RELLENAR TABLERO
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[0].length;j++) {
				tablero[i][j]=Casilla.agua;
			}
		}
	}
	
	
	
	public Casilla[][] getTablero() {
		return tablero;
	}
	public Casilla getValorPos(int y,int x) {
		return this.tablero[y][x];
	}
	
	public void setValorPos(int y,int x, Casilla valor) {
		tablero[y][x] = valor;
	}
	public void visualizarTablero() {
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[0].length;j++) {
				System.out.print(tablero[i][j].getValorNumCasilla()+" ");
			}
			System.out.println("");
		}
	}
	public void visualizarTableroVisibleJugador() {
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[0].length;j++) {
				if(tablero[i][j]==Casilla.agua || tablero[i][j]==Casilla.hitAgua || tablero[i][j]==Casilla.hitBarco) {
				System.out.print(tablero[i][j].getValorNumCasilla()+" ");
				}else{
					System.out.print(Casilla.agua.getValorNumCasilla()+" ");
				}
				
			}
			System.out.println("");
		}
	}
	
	public boolean comprobarHasCaidoBarco() {
		
		for(int x=0;x<this.tablero.length;x++) {
			for(int y=0;y<this.tablero[0].length;y++) {
				if(this.tablero[x][y]==Casilla.barco) {
					return false;
				}
			}
		}
		return true;
	}
	public void setBarcoEnTablero(int[][] barcoPos) {
		for(int i=0;i<barcoPos.length;i++) {
			setValorPos(barcoPos[i][0], barcoPos[i][1], Casilla.barco);
		}
	}
	
}
