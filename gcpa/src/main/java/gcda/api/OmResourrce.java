package gcda.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import gcda.business.Cliente;
import gcda.business.OrgMilitar;
import gcda.controller.ClienteController;
import gcda.controller.OrgMilitarController;

@Path("/om")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OmResourrce {

	
	@GET
	@Path("/listarTodos")	
	public List<OMDto> listarTodos(){
		OrgMilitarController c = new OrgMilitarController();
		List<OMDto> listDto = new ArrayList<>();
		for (OrgMilitar orgMilitar : c.listarTodos()) {
			OMDto omDto = converterToDto(orgMilitar);
			listDto.add(omDto);
		}
		return listDto;
		
	}

	private OMDto converterToDto(OrgMilitar orgMilitar) {
		OMDto omDto = new OMDto();
		omDto.setId(orgMilitar.getId());
		omDto.setNome(orgMilitar.getNome());
		omDto.setSigla(orgMilitar.getSigla());
		return omDto;
	}
}
