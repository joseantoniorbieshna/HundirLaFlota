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


public class UI extends JFrame {

	private JPanel contentPane;
	private MyButton[][] botones = new MyButton[11][11];
	private JButton[][] botonesNoInteractivos = new JButton[11][11];
	private JLabel lblMessage;
	private JLabel lblTitle;
	private JLabel lblNewLabel;

	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 653, 985);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 72, 636, 374);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(11, 11, 0, 0));
		
		lblMessage = new JLabel("");
		lblMessage.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(0, 443, 636, 58);
		contentPane.add(lblMessage);
		
		lblTitle = new JLabel("HUNDIR LA FLOTA");
		lblTitle.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 11, 617, 50);
		contentPane.add(lblTitle);
		
		JPanel panelVista = new JPanel();
		panelVista.setBounds(0, 571, 636, 374);
		contentPane.add(panelVista);
		panelVista.setLayout(new GridLayout(11, 11, 0, 0));
		
		lblNewLabel = new JLabel("MI TABLERO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 541, 636, 26);
		contentPane.add(lblNewLabel);
		
		
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
}
