package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;

public class UI extends JFrame {

	private JPanel contentPane;
	private JButton[][] botones = new JButton[11][11];

	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(11, 11, 0, 0));
		
		for(int y=0;y<botones.length;y++) {
			for(int x=0;x<botones[0].length;x++) {
				botones[y][x] = new JButton("");
				panel.add(botones[y][x]);
			}
		}
		
		
	}
}
