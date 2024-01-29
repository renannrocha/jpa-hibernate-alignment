package aplicação;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		// busca no banco de dados por Id
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		
		System.out.println("pronto");
		em.close();
	}

}
