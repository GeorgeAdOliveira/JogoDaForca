package DTO;

import java.util.ArrayList;

import Model.PalavraModel;

public class PalavraDTO {
	
	private PalavraModel palavra;
	
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

}
