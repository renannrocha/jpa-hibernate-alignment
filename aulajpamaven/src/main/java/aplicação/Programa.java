package aplicação;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com"); 
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com"); 
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com"); 
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		// salvar no banco de dados
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p2);
		em.getTransaction().commit();
		
		System.out.println("pronto");

	}

}
