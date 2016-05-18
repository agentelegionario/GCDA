package gcda.controller;

import gcda.business.Rota;
import gcda.persistence.RotaDAO;

public class RotaController {
	
	RotaDAO dao;
	
	public RotaController() {
		dao = new RotaDAO();
	}
	
	public Rota EncontraRota(Integer id){
		return dao.selectEntity(Rota.class, id);
	}

}
