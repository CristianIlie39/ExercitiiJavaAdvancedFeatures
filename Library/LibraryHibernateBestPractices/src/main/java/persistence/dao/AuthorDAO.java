package persistence.dao;

import config.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import persistence.entities.Author;

import javax.persistence.Query;
import java.util.List;

@Repository
public class AuthorDAO {

    public void insert(Author author) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        session.close();
    }

    public Long countAuthors(String surname, String firstName) {
        Session session =HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query countAuthorsQuery = session.createNamedQuery("countAuthorBySurnameAndFirstName");
        countAuthorsQuery.setParameter("surname", surname);
        countAuthorsQuery.setParameter("firstName", firstName);
        Long numberOfAuthors = (Long)(countAuthorsQuery.getSingleResult());
        session.getTransaction().commit();
        session.close();
        return numberOfAuthors;
    }

    public Integer deleteAuthorBySurname(String surname) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query deleteAuthorBySurname = session.createNamedQuery("deleteAuthorBySurname");
        deleteAuthorBySurname.setParameter("surname", surname);
        Integer numberOfDeletedAuthors = deleteAuthorBySurname.executeUpdate();
        session.getTransaction().commit();
        session.close();
        return numberOfDeletedAuthors;
    }

    public List<Author> findAuthorBySurname(String surname) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query findAuthorBySurnameQuery = session.createNamedQuery("findAuthorBySurname");
        findAuthorBySurnameQuery.setParameter("surname", surname);
        List<Author> authorListBySurname = findAuthorBySurnameQuery.getResultList();
        session.getTransaction().commit();
        session.close();
        return authorListBySurname;
    }

    public Long countAuthorBySurname(String surname) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query countAuthorQuery = session.createNamedQuery("countAuthorBySurname");
        countAuthorQuery.setParameter("surname", surname);
        Long numberOfAuthors = (Long)(countAuthorQuery.getSingleResult());
        session.getTransaction().commit();
        session.close();
        return numberOfAuthors;
    }

    public Integer updateAuthor(String surname, String firstName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query updateAuthorQuery = session.createNamedQuery("updateAuthor");
        updateAuthorQuery.setParameter("surname", surname);
        updateAuthorQuery.setParameter("firstName", firstName);
        Integer numberOfAuthorsUpdated = updateAuthorQuery.executeUpdate();
        session.getTransaction().commit();
        session.close();
        return numberOfAuthorsUpdated;
    }


    public List<Author> findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query findAllQuery = session.createNamedQuery("findAll");
        List<Author> authorList = findAllQuery.getResultList();
        session.getTransaction().commit();
        session.close();
        return authorList;
    }


}
