package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private String categotia;
	private PalavraModel palavra;
	private PalavraController controller = new PalavraController();
	private PalavraDTO dto = new PalavraDTO();

	public TelaJogo(String categoria) {
		super("Jogo");
		this.categotia = categoria;
		gerarPalavra();
		adicionarTitulo();
		adicionarBotoes();
		setVisible(true);
	}
	
	private class OuvinteDosBotoes implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Sair")) {
				new TelaCategorias();
				dispose();
			} else {
				
			}

		}

	}
	
	private void adicionarBotoes() {
		OuvinteDosBotoes ouvinte = new OuvinteDosBotoes();
		Font font = new Font("Georgia", Font.BOLD, 20);

		
		JButton btQ = new JButton("Q");
		btQ.setBounds(100, 390, 60, 50);
		btQ.setFont(font);
		btQ.addActionListener(ouvinte);
		add(btQ);
		
		JButton btW = new JButton("W");
		btW.setBounds(165, 390, 60, 50);
		btW.setFont(font);
		btW.addActionListener(ouvinte);
		add(btW);
		
		JButton btE = new JButton("E");
		btE.setBounds(230, 390, 60, 50);
		btE.setFont(font);
		btE.addActionListener(ouvinte);
		add(btE);
		
		JButton btR = new JButton("R");
		btR.setBounds(295, 390, 60, 50);
		btR.setFont(font);
		btR.addActionListener(ouvinte);
		add(btR);
		
		JButton btT = new JButton("T");
		btT.setBounds(360, 390, 60, 50);
		btT.setFont(font);
		btT.addActionListener(ouvinte);
		add(btT);
		
		JButton btY = new JButton("Y");
		btY.setBounds(425, 390, 60, 50);
		btY.setFont(font);
		btY.addActionListener(ouvinte);
		add(btY);
		
		JButton btU = new JButton("U");
		btU.setBounds(490, 390, 60, 50);
		btU.setFont(font);
		btU.addActionListener(ouvinte);
		add(btU);
		
		JButton btI = new JButton("I");
		btI.setBounds(555, 390, 60, 50);
		btI.setFont(font);
		btI.addActionListener(ouvinte);
		add(btI);
		
		JButton btO = new JButton("O");
		btO.setBounds(620, 390, 60, 50);
		btO.setFont(font);
		btO.addActionListener(ouvinte);
		add(btO);
		
		JButton btP = new JButton("P");
		btP.setBounds(685, 390, 60, 50);
		btP.setFont(font);
		btP.addActionListener(ouvinte);
		add(btP);
		
		JButton btA = new JButton("A");
		btA.setBounds(130, 445, 60, 50);
		btA.setFont(font);
		btA.addActionListener(ouvinte);
		add(btA);
		
		JButton btS = new JButton("S");
		btS.setBounds(195, 445, 60, 50);
		btS.setFont(font);
		btS.addActionListener(ouvinte);
		add(btS);
		
		JButton btD = new JButton("D");
		btD.setBounds(260, 445, 60, 50);
		btD.setFont(font);
		btD.addActionListener(ouvinte);
		add(btD);
		
		JButton btF = new JButton("F");
		btF.setBounds(325, 445, 60, 50);
		btF.setFont(font);
		btF.addActionListener(ouvinte);
		add(btF);
		
		JButton btG = new JButton("G");
		btG.setBounds(390, 445, 60, 50);
		btG.setFont(font);
		btG.addActionListener(ouvinte);
		add(btG);
		
		JButton btH = new JButton("H");
		btH.setBounds(455, 445, 60, 50);
		btH.setFont(font);
		btH.addActionListener(ouvinte);
		add(btH);
		
		JButton btJ = new JButton("J");
		btJ.setBounds(520, 445, 60, 50);
		btJ.setFont(font);
		btJ.addActionListener(ouvinte);
		add(btJ);
		
		JButton btK = new JButton("K");
		btK.setBounds(585, 445, 60, 50);
		btK.setFont(font);
		btK.addActionListener(ouvinte);
		add(btK);
		
		JButton btL = new JButton("L");
		btL.setBounds(650, 445, 60, 50);
		btL.setFont(font);
		btL.addActionListener(ouvinte);
		add(btL);
		
		

		JButton btSair = new JButton("Sair");
		btSair.setBounds(790, 520, 200, 50);
		btSair.setFont(font);
		btSair.addActionListener(ouvinte);
		add(btSair);
		
	}

	public void adicionarTitulo() {
		JLabel lbTitulo = new JLabel(palavra.getNome());
		lbTitulo.setBounds(370, 60, 300, 50);
		lbTitulo.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 40));
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
