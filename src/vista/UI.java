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
	private JLabel lblMessage;
	private JLabel lblTitle;

	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 551);
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
		
		for(int y=0;y<botones.length;y++) {
			for(int x=0;x<botones[0].length;x++) {
				botones[y][x] = new MyButton("",y, x);
				panel.add(botones[y][x]);
			}
		}
		
		
	}

	public MyButton[][] getBotones() {
		return botones;
	}

	public JLabel getLblMessage() {
		return lblMessage;
	}
	
	
	
}
