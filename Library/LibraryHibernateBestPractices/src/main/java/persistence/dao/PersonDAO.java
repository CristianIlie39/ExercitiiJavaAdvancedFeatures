package persistence.dao;

import config.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import persistence.entities.Person;

import javax.persistence.Query;
import java.util.List;

@Repository
public class PersonDAO {

    public void insert(Person person) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        session.close();
    }

    public Integer deletePersonBySurname(String surname) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query deletePersonByNameQuery = session.createNamedQuery("deletePersonBySurname");
        deletePersonByNameQuery.setParameter("surname", surname);
        Integer numberOfPersonsDeleted = deletePersonByNameQuery.executeUpdate();
        session.getTransaction().commit();
        session.close();
        return numberOfPersonsDeleted;
    }

    public List<Person> findBySurname(String surname) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query findPersonBySurnameQuery = session.createNamedQuery("findPersonBySurname");
        findPersonBySurnameQuery.setParameter("surname", surname);
        List<Person> personList = findPersonBySurnameQuery.getResultList();
        session.getTransaction().commit();
        session.close();
        return personList;
    }

    public List<Person> findByAge(int age) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query findPersonByAgeQuery = session.createNamedQuery("findPersonByAge");
        findPersonByAgeQuery.setParameter("age", age);
        List<Person> personList = findPersonByAgeQuery.getResultList();
        session.getTransaction().commit();
        session.close();
        return personList;
    }

    public Integer updatePersonBySurname(String surname, String address) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query updatePersonBySurnameQuery = session.createNamedQuery("updatePersonBySurname");
        updatePersonBySurnameQuery.setParameter("surname", surname);
        updatePersonBySurnameQuery.setParameter("address", address);
        Integer numberOfPersonsUpdated = updatePersonBySurnameQuery.executeUpdate();
        session.getTransaction().commit();
        session.close();
        return numberOfPersonsUpdated;
    }
}


