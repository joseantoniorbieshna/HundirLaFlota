package vista;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import javax.swing.JButton;
import controlador.MyButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;


public class UI extends JFrame {

	private JPanel contentPane;
	private MyButton[][] botones = new MyButton[11][11];
	private JButton[][] botonesNoInteractivos = new JButton[11][11];
	private JLabel lblMessage;
	private JLabel lblTitle;
	private JLabel lblJugador;
	private JLabel lbDecirTurno;

	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 25, 653, 992);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Panel botones
		JPanel panel = new JPanel();
		panel.setBounds(0, 87, 636, 374);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(11, 11, 0, 0));
		//Panel Has Ganado
		lblMessage = new JLabel("");
		lblMessage.setForeground(new Color(0, 128, 0));
		lblMessage.setFont(new Font("Arial", Font.BOLD, 20));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(0, 472, 636, 50);
		contentPane.add(lblMessage);
		//Titulo
		lblTitle = new JLabel("HUNDIR LA FLOTA");
		lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(0, 0, 636, 50);
		contentPane.add(lblTitle);
		//Panel mi tablero
		JPanel panelVista = new JPanel();
		panelVista.setBounds(0, 571, 636, 374);
		contentPane.add(panelVista);
		panelVista.setLayout(new GridLayout(11, 11, 0, 0));
		
		//Texto Para mi tablero
		JLabel lblNewLabel2 = new JLabel("MI TABLERO");
		lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel2.setBounds(0, 519, 636, 26);
		contentPane.add(lblNewLabel2);
		
		//TEXTO 2 PARA MI TABLERO
		JLabel lblNewLabel = new JLabel("(Invisible para el otro Jugador)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 541, 636, 26);
		contentPane.add(lblNewLabel);
		//Texto JugadorActual
		lblJugador = new JLabel("Jugador");
		lblJugador.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblJugador.setHorizontalAlignment(SwingConstants.LEFT);
		lblJugador.setBounds(10, 29, 127, 43);
		contentPane.add(lblJugador);
		
		lbDecirTurno = new JLabel("Empieza Jugador 1");
		lbDecirTurno.setForeground(new Color(0, 128, 0));
		lbDecirTurno.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbDecirTurno.setHorizontalAlignment(SwingConstants.CENTER);
		lbDecirTurno.setBounds(202, 61, 206, 26);
		contentPane.add(lbDecirTurno);
		
		//Botones
		for(int y=0;y<botones.length;y++) {
			for(int x=0;x<botones[0].length;x++) {
				botones[y][x] = new MyButton("",y, x);
				panel.add(botones[y][x]);
				
				botonesNoInteractivos[y][x] = new JButton("");
				botonesNoInteractivos[y][x].setEnabled(false);
				panelVista.add(botonesNoInteractivos[y][x]);
			}
		}
		
		
	}

	public MyButton[][] getBotones() {
		return botones;
	}
	public JButton[][] getbotonesNoInteractivos() {
		return botonesNoInteractivos;
	}

	public JLabel getLblMessage() {
		return lblMessage;
	}

	public JLabel getLblJugador() {
		return lblJugador;
	}

	public JLabel getLbDecirTurno() {
		return lbDecirTurno;
	}
	
	
}
