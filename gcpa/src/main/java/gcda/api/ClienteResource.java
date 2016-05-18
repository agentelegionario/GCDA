package gcda.api;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import gcda.business.Cliente;
import gcda.controller.ClienteController;

/**
 * 
 * Classe respons�vel por conter os metodos REST de acesso ao webservice
 *
 * @author Douglas Costa <douglas.cst90@gmail.com>
 * @since 17/02/2013 02:05:23
 * @version 1.0
 */
@Path("/cliente")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteResource {

	/**
	 * 
	 * M�todo respons�vel por fazer chamada ao controller
	 *
	 * @return ArrayList<Cliente> 
	 * @author Douglas Costa <douglas.cst90@gmail.com.br>
	 * @since 17/02/2013 02:07:08
	 * @version 1.0
	 */
	@GET
	@Path("/listarTodos")	
	public ArrayList<Cliente> listarTodos(){
		System.out.println("ENTROU");
		return new ClienteController().listarTodos();
	}
}
