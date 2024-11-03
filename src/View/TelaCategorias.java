package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class TelaCategorias extends TelaPadrao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TelaCategorias() {
		super("Categorias");
		adicionarTitulo();
		adicionarBotoes();
		setVisible(true);
	}

	private class OuvinteDosBotoes implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Sair")) {
				new TelaInicial();
				dispose();
			} else {
				new TelaJogo(e.getActionCommand());
				dispose();
			}

		}

	}

	public void adicionarTitulo() {
		JLabel lbTitulo = new JLabel("Categorias");
		lbTitulo.setBounds(370, 60, 300, 50);
		lbTitulo.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 40));
		// se for usar a cor branca no titulo
		// lbTitulo.setForeground(Color.WHITE);
		lbTitulo.setHorizontalAlignment(JLabel.CENTER);
		add(lbTitulo);
	}

	private void adicionarBotoes() {
		OuvinteDosBotoes ouvinte = new OuvinteDosBotoes();
		Font font = new Font("Georgia", Font.BOLD, 20);

		JButton btAnimal = new JButton("Animal");
		btAnimal.setBounds(300, 180, 200, 50);
		btAnimal.setFont(font);
		btAnimal.addActionListener(ouvinte);
		add(btAnimal);

		JButton btProf = new JButton("Profissão");
		btProf.setBounds(300, 250, 200, 50);
		btProf.setFont(font);
		btProf.addActionListener(ouvinte);
		add(btProf);

		JButton btCores = new JButton("Cor");
		btCores.setBounds(300, 320, 200, 50);
		btCores.setFont(font);
		btCores.addActionListener(ouvinte);
		add(btCores);

		JButton btEsporte = new JButton("Esporte");
		btEsporte.setBounds(300, 390, 200, 50);
		btEsporte.setFont(font);
		btEsporte.addActionListener(ouvinte);
		add(btEsporte);

		JButton btPais = new JButton("País");
		btPais.setBounds(540, 180, 200, 50);
		btPais.setFont(font);
		btPais.addActionListener(ouvinte);
		add(btPais);

		JButton btFilme = new JButton("Filme");
		btFilme.setBounds(540, 250, 200, 50);
		btFilme.setFont(font);
		btFilme.addActionListener(ouvinte);
		add(btFilme);

		JButton btFruta = new JButton("Fruta");
		btFruta.setBounds(540, 320, 200, 50);
		btFruta.setFont(font);
		btFruta.addActionListener(ouvinte);
		add(btFruta);

		JButton btComida = new JButton("Comida");
		btComida.setBounds(540, 390, 200, 50);
		btComida.setFont(font);
		btComida.addActionListener(ouvinte);
		add(btComida);

		JButton btSair = new JButton("Sair");
		btSair.setBounds(790, 520, 200, 50);
		btSair.setFont(font);
		btSair.addActionListener(ouvinte);
		add(btSair);

	}

}
