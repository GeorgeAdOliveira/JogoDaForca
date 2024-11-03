package DTO;

import java.util.ArrayList;

import Model.PalavraModel;

public class PalavraDTO {
	
	private PalavraModel palavra;
	private String categoria;
	
	private ArrayList<PalavraModel> palavras;

	public ArrayList<PalavraModel> getPalavras() {
		return palavras;
	}

	public void setPalavras(ArrayList<PalavraModel> palavras) {
		this.palavras = palavras;
	}

	public PalavraModel getPalavra() {
		return palavra;
	}

	public void setPalavra(PalavraModel palavra) {
		this.palavra = palavra;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
