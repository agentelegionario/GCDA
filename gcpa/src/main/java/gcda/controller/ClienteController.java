package gcda.controller;

import java.util.ArrayList;

import gcda.business.Cliente;




/**
 * 
 * Classe respons�vel por ser o controlador entre o resource e a camada DAO
 *
 * @author Douglas Costa <douglas.cst90@gmail.com>
 * @since 17/02/2013 02:04:21
 * @version 1.0
 */
public class ClienteController {
	
	public ArrayList<Cliente> listarTodos(){
		System.out.println("Enyrado no Controller");
		Cliente c = new Cliente();
		c.setCpf("1234567890");
		c.setId(123);
		c.setNome("Alcides");
		ArrayList<Cliente> clientes =  new ArrayList<>();
		clientes.add(c);
		System.out.println("Saindo");
		return clientes;
		//return ClienteDAO.getInstance().listarTodos();
	}
	
}
