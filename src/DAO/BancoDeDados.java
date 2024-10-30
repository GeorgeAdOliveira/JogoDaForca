package DAO;

import java.util.ArrayList;
import Model.PalavraModel;

public class BancoDeDados {
	
	private ArrayList<PalavraModel> palavras = new ArrayList<PalavraModel>();

	public ArrayList<PalavraModel> getPalavras() {
		return palavras;
	}

	public void setPalavras(ArrayList<PalavraModel> palavras) {
		this.palavras = palavras;
	}

}
