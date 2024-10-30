package Controller;

import DTO.PalavraDTO;
import Model.PalavraModel;

public class Main {
	public static void main(String[] args) {
		
//		PalavraModel p = new PalavraModel();
//		p.setNome("PEIXE");
//		p.setCategoria("ANIMAL");
//		
		PalavraDTO dto = new PalavraDTO();
//		dto.setPalavra(p);
//		
		PalavraController pc = new PalavraController();
//		pc.adicionarPalavra(dto);
		dto = pc.recuperarPalavras(dto);
		for (PalavraModel palavra : dto.getPalavras()) {
			//if(palavra.getCategoria().equals("ANIMAL")) {
				System.out.println(palavra.getNome());
				System.out.println(palavra.getCategoria());
			//}
			
		}
		
		
	}

}
