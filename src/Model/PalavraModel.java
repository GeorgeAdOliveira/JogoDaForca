package Model;

import java.util.ArrayList;

import DAO.CentralDeInformacoesDAO;
import DTO.PalavraDTO;

public class PalavraModel {

	private String categoria;
	private String nome;
	private String dica;

	private CentralDeInformacoesDAO central = new CentralDeInformacoesDAO();

	public PalavraDTO recuperarPalavra(PalavraDTO dto) {
		return sortearPalavra(recuperarPalavrasCategoria(dto));
	}

	// método que recupera todas as palavras
	public PalavraDTO recuperarTodasAsPalavras(PalavraDTO dto) {
		return central.recuperarPalavras(dto);
	}

	// Recupera todas as palavras da categoria selecionada
	public PalavraDTO recuperarPalavrasCategoria(PalavraDTO dto) {
		ArrayList<PalavraModel> palavras = new ArrayList<>();
		for (PalavraModel p : recuperarTodasAsPalavras(dto).getPalavras()) {
			if (p.getCategoria().equalsIgnoreCase(dto.getCategoria())) {
				palavras.add(p);
			}
		}
		dto.setPalavras(palavras);
		return dto;
	}

	// método para sortear as palavras
	public PalavraDTO sortearPalavra(PalavraDTO dto) {
		int sort = (int) (Math.random() * (dto.getPalavras().size()));
		dto.setPalavra(dto.getPalavras().get(sort));
		return dto;
	}

	public PalavraDTO adicionarPalavra(PalavraDTO dto) {
		return central.adicionarPalavra(dto);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}

}
