  package onetoonemapping.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonemapping.dto.AdharCard;
import onetoonemapping.dto.Person;

public class PersonDao {
	public void savePerson(Person person) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tushar0409");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		AdharCard adharcard = person.getAdharCard();
		et.begin();
		em.persist(adharcard);
		em.persist(person);
		et.commit();
	}
	public void removePerson(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tushar0409");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Person person = em.find(Person.class, id);
		AdharCard adharcard = person.getAdharCard();
		if(person != null) {
		et.begin();
		em.remove(adharcard);
		em.remove(person);
		et.commit();
		}else {
			System.out.println("id is not present");
		}
	}
	public void findPerson(int id) { 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tushar0409");
		EntityManager em = emf.createEntityManager();			 
		Person person=em.find(Person.class, id);
		System.out.println(person); 
		 
	}
	public void updatePerson(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tushar0409");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Person person=em.find(Person.class, id);
		et.begin();
		em.merge(person);
		et.commit();
	}

}
