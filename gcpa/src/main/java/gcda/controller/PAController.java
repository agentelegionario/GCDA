package gcda.controller;

import gcda.business.PAbastecimento;
import gcda.persistence.PAbastecimentoDAO;

public class PAController {

	PAbastecimentoDAO dao;
	
	public PAController() {
		dao = new PAbastecimentoDAO();
	}
	
	public void inserirPAbastecimento(PAbastecimento pa) {
		dao.insertEntity(pa);
		
	}
}
