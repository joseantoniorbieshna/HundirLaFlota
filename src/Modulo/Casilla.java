package Modulo;

public enum Casilla {
	agua(0),hitAgua(1),barco(2),hitBarco(3);
	
	private int valorNumCasilla;
	private Casilla(int valorEnNumero) {
		this.valorNumCasilla = valorEnNumero;
	}
	public int getValorNumCasilla() {
		return valorNumCasilla;
	}
}
