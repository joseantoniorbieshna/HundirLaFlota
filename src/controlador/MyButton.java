package controlador;

import javax.swing.JButton;

public class MyButton extends JButton {

	private int posY;
	private int posX;
	
	public MyButton(String text,int posY,int posX) {
		super(text);
		this.posY = posY;
		this.posX = posX;
	}
	//GETTER
	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}	
	
}
