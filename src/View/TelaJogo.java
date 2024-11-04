package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JLabel;

import Controller.PalavraController;
import DTO.PalavraDTO;
import Model.PalavraModel;

public class TelaJogo extends TelaPadrao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String palavraOculta;
	private String palavraJogo;
	private String categotia;
	private String letrasCertas = "";
	private String letrasErradas = "";
	private PalavraModel palavra;
	private PalavraController controller = new PalavraController();
	private PalavraDTO dto = new PalavraDTO();

	private JLabel lbLetrasCertas;
	private JLabel lbLetrasErradas;
	private JLabel lbPalavra;
	private JLabel lbTentativas;
	private int tentativas = 6;

	public TelaJogo(String categoria) {
		super("Jogo");
		this.categotia = categoria;
		gerarPalavra();
		adicionarTitulo();
		criarPalavraOcultaJogo();
		adicionarTracejado();
		adicionarBotoes();
		adicionarInformacao();
		setVisible(true);
	}

	public void adicionarInformacao() {
		JLabel lbText = new JLabel("Tentativas");
		lbText.setBounds(30, 20, 170, 40);
		lbText.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 30));
		lbText.setHorizontalAlignment(JLabel.CENTER);
		add(lbText);

		lbTentativas = new JLabel(tentativas + "");
		lbTentativas.setBounds(30, 55, 170, 40);
		lbTentativas.setFont(new Font("Georgia", Font.BOLD | Font.BOLD, 30));
		lbTentativas.setHorizontalAlignment(JLabel.CENTER);
		add(lbTentativas);

		JLabel lbPontos = new JLabel("Pontos");
		lbPontos.setBounds(840, 20, 170, 40);
		lbPontos.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 30));
		lbPontos.setHorizontalAlignment(JLabel.CENTER);
		add(lbPontos);
		
		lbLetrasCertas = new JLabel(letrasCertas);
		lbLetrasCertas.setText("0 -");
		lbLetrasCertas.setBounds(300, 510, 400, 30);
		lbLetrasCertas.setFont(new Font("Georgia", Font.BOLD | Font.BOLD, 25));
		lbLetrasCertas.setHorizontalAlignment(JLabel.LEFT);
		lbLetrasCertas.setForeground(new Color(0, 200, 0));
		add(lbLetrasCertas);
		
		lbLetrasErradas = new JLabel(letrasErradas);
		lbLetrasErradas.setText("0 -");
		lbLetrasErradas.setBounds(300, 550, 400, 30);
		lbLetrasErradas.setFont(new Font("Georgia", Font.BOLD | Font.BOLD, 25));
		lbLetrasErradas.setHorizontalAlignment(JLabel.LEFT);
		lbLetrasErradas.setForeground(new Color(200, 0, 0));
		add(lbLetrasErradas);
	}

	public void atualizarPalavraOculta(String letra) {
		char a = letra.charAt(0);
		String p = palavraOculta;
		String p1 = "";
		String pa = palavraJogo;
		int cont = 0;
		for (int i = 0; i < p.length(); i++) {
			if (a == pa.charAt(i)) {
				p1 += letra;
				cont++;
			} else {
				p1 += p.charAt(i);
			}
		}

		letrasAcertosErros(cont, letra);

		palavraOculta = p1;
		lbPalavra.setText(palavraOculta);
		repaint();
	}

	public void letrasAcertosErros(int cont, String letra) {
		if (cont > 0) {
			letrasCertas += letra;
		} else {
			letrasErradas += letra;
		}
		String lc = letrasCertas.length() + " - " + letrasCertas;
		String le = letrasErradas.length() + " - "+ letrasErradas;
		
		lbLetrasCertas.setText(lc);
		lbLetrasErradas.setText(le);
		
	}

	private class OuvinteDosBotoes implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Sair")) {
				new TelaCategorias();
				dispose();
			} else {
				atualizarPalavraOculta(e.getActionCommand());
			}

		}

	}

	public void criarPalavraOcultaJogo() {
		String p = palavra.getNome();
		palavraOculta = "";
		palavraJogo = "";
		for (int i = 0; i < p.length(); i++) {
			palavraOculta += "_ ";
			palavraJogo += p.charAt(i) + " ";
		}

	}

	private void adicionarTracejado() {
		lbPalavra = new JLabel(palavraOculta);
		lbPalavra.setBounds(100, 260, 700, 50);
		lbPalavra.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 40));
		lbPalavra.setHorizontalAlignment(JLabel.CENTER);
		add(lbPalavra);
	}

	private void adicionarBotoes() {
		OuvinteDosBotoes ouvinte = new OuvinteDosBotoes();
		Font font = new Font("Georgia", Font.BOLD, 20);

		JButton btQ = new JButton("Q");
		btQ.setBounds(100, 330, 60, 50);
		btQ.setFont(font);
		btQ.addActionListener(ouvinte);
		add(btQ);

		JButton btW = new JButton("W");
		btW.setBounds(165, 330, 60, 50);
		btW.setFont(font);
		btW.addActionListener(ouvinte);
		add(btW);

		JButton btE = new JButton("E");
		btE.setBounds(230, 330, 60, 50);
		btE.setFont(font);
		btE.addActionListener(ouvinte);
		add(btE);

		JButton btR = new JButton("R");
		btR.setBounds(295, 330, 60, 50);
		btR.setFont(font);
		btR.addActionListener(ouvinte);
		add(btR);

		JButton btT = new JButton("T");
		btT.setBounds(360, 330, 60, 50);
		btT.setFont(font);
		btT.addActionListener(ouvinte);
		add(btT);

		JButton btY = new JButton("Y");
		btY.setBounds(425, 330, 60, 50);
		btY.setFont(font);
		btY.addActionListener(ouvinte);
		add(btY);

		JButton btU = new JButton("U");
		btU.setBounds(490, 330, 60, 50);
		btU.setFont(font);
		btU.addActionListener(ouvinte);
		add(btU);

		JButton btI = new JButton("I");
		btI.setBounds(555, 330, 60, 50);
		btI.setFont(font);
		btI.addActionListener(ouvinte);
		add(btI);

		JButton btO = new JButton("O");
		btO.setBounds(620, 330, 60, 50);
		btO.setFont(font);
		btO.addActionListener(ouvinte);
		add(btO);

		JButton btP = new JButton("P");
		btP.setBounds(685, 330, 60, 50);
		btP.setFont(font);
		btP.addActionListener(ouvinte);
		add(btP);

		JButton btA = new JButton("A");
		btA.setBounds(130, 385, 60, 50);
		btA.setFont(font);
		btA.addActionListener(ouvinte);
		add(btA);

		JButton btS = new JButton("S");
		btS.setBounds(195, 385, 60, 50);
		btS.setFont(font);
		btS.addActionListener(ouvinte);
		add(btS);

		JButton btD = new JButton("D");
		btD.setBounds(260, 385, 60, 50);
		btD.setFont(font);
		btD.addActionListener(ouvinte);
		add(btD);

		JButton btF = new JButton("F");
		btF.setBounds(325, 385, 60, 50);
		btF.setFont(font);
		btF.addActionListener(ouvinte);
		add(btF);

		JButton btG = new JButton("G");
		btG.setBounds(390, 385, 60, 50);
		btG.setFont(font);
		btG.addActionListener(ouvinte);
		add(btG);

		JButton btH = new JButton("H");
		btH.setBounds(455, 385, 60, 50);
		btH.setFont(font);
		btH.addActionListener(ouvinte);
		add(btH);

		JButton btJ = new JButton("J");
		btJ.setBounds(520, 385, 60, 50);
		btJ.setFont(font);
		btJ.addActionListener(ouvinte);
		add(btJ);

		JButton btK = new JButton("K");
		btK.setBounds(585, 385, 60, 50);
		btK.setFont(font);
		btK.addActionListener(ouvinte);
		add(btK);

		JButton btL = new JButton("L");
		btL.setBounds(650, 385, 60, 50);
		btL.setFont(font);
		btL.addActionListener(ouvinte);
		add(btL);

		JButton btZ = new JButton("Z");
		btZ.setBounds(165, 440, 60, 50);
		btZ.setFont(font);
		btZ.addActionListener(ouvinte);
		add(btZ);

		JButton btX = new JButton("X");
		btX.setBounds(230, 440, 60, 50);
		btX.setFont(font);
		btX.addActionListener(ouvinte);
		add(btX);

		JButton btC = new JButton("C");
		btC.setBounds(295, 440, 60, 50);
		btC.setFont(font);
		btC.addActionListener(ouvinte);
		add(btC);

		JButton btV = new JButton("V");
		btV.setBounds(360, 440, 60, 50);
		btV.setFont(font);
		btV.addActionListener(ouvinte);
		add(btV);

		JButton btB = new JButton("B");
		btB.setBounds(425, 440, 60, 50);
		btB.setFont(font);
		btB.addActionListener(ouvinte);
		add(btB);

		JButton btN = new JButton("N");
		btN.setBounds(490, 440, 60, 50);
		btN.setFont(font);
		btN.addActionListener(ouvinte);
		add(btN);

		JButton btM = new JButton("M");
		btM.setBounds(555, 440, 60, 50);
		btM.setFont(font);
		btM.addActionListener(ouvinte);
		add(btM);

		JButton btÇ = new JButton("Ç");
		btÇ.setBounds(620, 440, 60, 50);
		btÇ.setFont(font);
		btÇ.addActionListener(ouvinte);
		add(btÇ);

		JButton btTrocar = new JButton("Trocar");
		btTrocar.setBounds(790, 460, 200, 50);
		btTrocar.setFont(font);
		btTrocar.addActionListener(ouvinte);
		add(btTrocar);

		JButton btSair = new JButton("Sair");
		btSair.setBounds(790, 520, 200, 50);
		btSair.setFont(font);
		btSair.addActionListener(ouvinte);
		add(btSair);

	}

	public void adicionarTitulo() {
		JLabel lbTitulo = new JLabel(palavra.getNome());
		lbTitulo.setBounds(800, 300, 200, 40);
		lbTitulo.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
		// se for usar a cor branca no titulo
		// lbTitulo.setForeground(Color.WHITE);
		lbTitulo.setHorizontalAlignment(JLabel.CENTER);
		add(lbTitulo);
	}

	public void gerarPalavra() {
		dto.setCategoria(categotia);
		dto = controller.recuperarPalavra(dto);
		if (palavra != null) {
			if (palavra.getNome().equals(dto.getPalavra().getNome())) {
				dto = controller.recuperarPalavra(dto);
			}
		}

		this.palavra = dto.getPalavra();
	}

}
