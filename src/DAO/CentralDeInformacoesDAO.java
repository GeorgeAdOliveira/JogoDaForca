package DAO;

import DTO.PalavraDTO;

public class CentralDeInformacoesDAO {
	
	private BancoDeDados bd;

	public PalavraDTO recuperarPalavras(PalavraDTO dto) {
		dto.setPalavras(Persistencia.getInstance().recuperar().getPalavras());
		return dto;
	}
	
	public PalavraDTO adicionarPalavra (PalavraDTO dto) {
		bd = Persistencia.getInstance().recuperar();
		bd.getPalavras().add(dto.getPalavra());
		Persistencia.getInstance().salvar(bd);
		return dto;
	}


}
