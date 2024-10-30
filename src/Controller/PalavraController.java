package Controller;

import DTO.PalavraDTO;
import Model.PalavraModel;

public class PalavraController {
	
	private PalavraModel palavra = new PalavraModel(); 
	
	public PalavraDTO recuperarPalavras(PalavraDTO dto) {
		return palavra.recuperarPalavras(dto);
	}
	
	public PalavraDTO adicionarPalavra(PalavraDTO dto) {
		return palavra.adicionarPalavra(dto);
	}

}
