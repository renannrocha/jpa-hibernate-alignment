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
		
		// remover do banco de dados
		Pessoa p2 = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p2);
		em.getTransaction().commit();
		
		System.out.println("pronto");
		em.close();
	}

}
