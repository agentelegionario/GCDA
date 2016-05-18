package gcda.persistence;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public abstract class EntityDao<E>{
	private EntityManagerFactory factory;
	
	public EntityDao(){
		factory = EntityManagerHolder.factory;
	}	
	
	public void insertEntity(E entity) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		System.out.println(entity);
		transaction.begin();
		manager.merge(entity);
		transaction.commit();
		manager.close();
	}
	
	public List<E> listEntitys(Class<E> classe) {
		
		String jpql = "select e from "+classe.getName()+" e";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<E> query = manager.createQuery(jpql, classe);
		return query.getResultList();
	}
	
	public void updateEntity(E entity) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transation = manager.getTransaction();
		transation.begin();
		manager.merge(entity);
		transation.commit();
		manager.close();
	}
	
	public void deleteEntity(Class<E> classe, Integer id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		E entityManaged = manager.find(classe, id);
		transaction.begin();
		manager.remove(entityManaged);
		transaction.commit();
		manager.close();
	}
	public E selectEntity(Class<E> classe, Integer id){
		
		EntityManager manager = factory.createEntityManager();
		E e = manager.find(classe, id);
		manager.close();
		return e;
		
	}
	public List<E> selectEntityWhere(Class<E> classe, String columm, String value) {
		
		String jpql = "select e from "+classe.getName()+" e where " + columm + " like " + value;
		System.out.println(jpql);
		EntityManager manager = factory.createEntityManager();
		TypedQuery<E> query = manager.createQuery(jpql, classe);
		return query.getResultList();
	}
}

	