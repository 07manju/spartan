package mock;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

@Component
public class Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(Dto dto) {
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
	}

	public Dto fetch(String email) {
		Dto find = entityManager.find(Dto.class, email);
		return find;
	}
}
