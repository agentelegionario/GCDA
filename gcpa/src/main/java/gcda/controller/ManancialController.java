package gcda.controller;

import gcda.business.Manancial;
import gcda.business.Rota;
import gcda.persistence.ManancialDAO;
import gcda.persistence.RotaDAO;

public class ManancialController {

	ManancialDAO dao;
	
	public ManancialController() {
		dao = new ManancialDAO();
	}
	
	public Manancial EncontraManancial(Integer id){
		return dao.selectEntity(Manancial.class, id);
	}
	public void InserirManacial(Manancial m){
		dao.insertEntity(m);
	}
}
