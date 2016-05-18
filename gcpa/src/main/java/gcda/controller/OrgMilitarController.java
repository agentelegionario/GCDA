package gcda.controller;

import java.util.List;

import gcda.business.OrgMilitar;
import gcda.persistence.OrgMilitarDAO;

public class OrgMilitarController {

	OrgMilitarDAO dao;
	
	public OrgMilitarController() {
		dao = new OrgMilitarDAO();
	}
	
	public OrgMilitar EncontraOrgMilitar(Integer id){
		return dao.selectEntity(OrgMilitar.class, id);
	}
	public List<OrgMilitar> listarTodos(){
		return dao.listEntitys(OrgMilitar.class);
	}
}
