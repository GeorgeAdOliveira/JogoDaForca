package Controller;

import DTO.PalavraDTO;
import Model.PalavraModel;

public class PalavraController {
	
	private PalavraModel palavra = new PalavraModel(); 
	
	public PalavraDTO recuperarPalavra(PalavraDTO dto) {
		return palavra.recuperarPalavra(dto);
	}
	
	public PalavraDTO adicionarPalavra(PalavraDTO dto) {
		return palavra.adicionarPalavra(dto);
	}

}
