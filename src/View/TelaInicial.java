package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class TelaInicial extends TelaPadrao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TelaInicial() {
		super("Tela Inicio");
		adicionarBotoes();
		adicionarTitulo();
		setVisible(true);
	}

	public void adicionarTitulo() {

		JLabel lbTitulo = new JLabel("JOGO DA FORCA");
		lbTitulo.setBounds(260, 120, 500, 50);
		lbTitulo.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 40));
		// se for usar a cor branca no titulo
		// lbTitulo.setForeground(Color.WHITE);
		lbTitulo.setHorizontalAlignment(JLabel.CENTER);
		add(lbTitulo);
	}

	private class OuvinteDosBotoes implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			switch (e.getActionCommand()) {
			case "Iniciar Jogo":
				new TelaCategorias(0);
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
