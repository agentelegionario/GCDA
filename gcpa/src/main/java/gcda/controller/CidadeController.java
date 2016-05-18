package gcda.controller;

import java.util.List;

import gcda.business.Cidade;
import gcda.persistence.CidadeDAO;

public class CidadeController {
	
	CidadeDAO dao;
	
	public CidadeController() {
		dao = new CidadeDAO();
	}
	
	public Cidade EncontraCidade(Integer id){
		return dao.selectEntity(Cidade.class, id);
	}

	public Cidade encontraCidadePorNome(String valor) {
		List<Cidade> cidades =  dao.listEntitys(Cidade.class);
		for (Cidade cidade : cidades) {
			if(cidade.getNome().equals(valor)) return cidade;
		}
		return null;
	}

	public void inserirCidade(Cidade cidade) {
		dao.insertEntity(cidade);
		
	}

}
