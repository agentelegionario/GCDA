package cdpa.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import gcda.business.User;
import gcda.persistence.EntityManagerHolder;
import gcda.persistence.UsuarioDAO;

public class TesteInserirUsuario {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = EntityManagerHolder.factory;
		User usuario = new User();
		usuario.setPassword("123");
		usuario.setEmail("alcides.francisco@ufpe.br");
		usuario.setTimeStamp(new Date());
		usuario.setName("Alcides");
		usuario.setSiap(2154606);
		usuario.setPhone("22268152");
		
		
		UsuarioDAO dao = new UsuarioDAO();
		
		dao.inserirUsuario(usuario);
		EntityManager manager = factory.createEntityManager();
		//System.out.println(manager.find(User.class, usuario.getSiap())); 
		
		//System.out.println(dao.consultaUsuario(usuario));
		
	}

}
