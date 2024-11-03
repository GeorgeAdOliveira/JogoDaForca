package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TelaInicial extends TelaPadrao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TelaInicial() {
		super("Tela Inicio");
		adicionarBotoes();
		setVisible(true);
	}

	private class OuvinteDosBotoes implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			switch (e.getActionCommand()) {
			case "Iniciar Jogo":
				new TelaCategorias(); 
				dispose();
				break;
			case "Sair":
				dispose();
				break;
			}

		}

	}

	private void adicionarBotoes() {
		OuvinteDosBotoes ouvinte = new OuvinteDosBotoes();
		Font font = new Font("Georgia", Font.BOLD, 20);

		JButton btIniciar = new JButton("Iniciar Jogo");
		btIniciar.setBounds(420, 280, 200, 50);
		btIniciar.setFont(font);
		btIniciar.addActionListener(ouvinte);
		add(btIniciar);

		JButton btSair = new JButton("Sair");
		btSair.setBounds(420, 350, 200, 50);
		btSair.setFont(font);
		btSair.addActionListener(ouvinte);
		add(btSair);

	}

}
