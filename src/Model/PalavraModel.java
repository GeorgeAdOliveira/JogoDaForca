package Model;

import DAO.CentralDeInformacoesDAO;
import DTO.PalavraDTO;

public class PalavraModel {
	
	private String nome;
	
	private String Categoria;

	
	private CentralDeInformacoesDAO central = new CentralDeInformacoesDAO();
	
	public PalavraDTO recuperarPalavras(PalavraDTO dto) {
		return central.recuperarPalavras(dto);
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
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

}
