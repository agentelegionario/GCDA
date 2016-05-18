package gcda.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import gcda.business.User;

public class UsuarioDAO {

	private EntityManagerFactory factory;
	
	public UsuarioDAO() {
		factory = EntityManagerHolder.factory;
	}
	
	public void inserirUsuario(User usuario)
	{
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transacao = manager.getTransaction();
		
		transacao.begin();
			manager.persist(usuario);
		transacao.commit();
	}

	public User consultaUsuario(User usuario) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(User.class, usuario.getSiap()); 
	}
}
