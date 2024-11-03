package View;

import java.awt.Color;

import javax.swing.JFrame;

public class TelaPadrao extends JFrame {

	private static final long serialVersionUID = 1L;

	public TelaPadrao(String titulo) {
		setTitle(titulo);
		setSize(1050, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		//Color minhaCor = new Color(229, 229, 229);
		//getContentPane().setBackground(minhaCor);
		getContentPane().setBackground(Color.PINK);
		
		
		
	}

}
