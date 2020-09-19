package persistence.dao;

import config.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import persistence.entities.Author;
import persistence.entities.Section;

import javax.persistence.Query;
import java.util.List;
import java.util.Set;

@Repository
public class SectionDAO {

    public void insert(Section section) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(section);
        session.getTransaction().commit();
        session.close();
    }

    public Integer deleteSectionByName(String name) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query deleteSectionByNameQuery = session.createNamedQuery("deleteSectionByName");
        deleteSectionByNameQuery.setParameter("name", name);
        Integer numberOfSectionDeleted = deleteSectionByNameQuery.executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("persistence -> numarul de sectiuni sterse este: " + numberOfSectionDeleted);
        return numberOfSectionDeleted;
    }

    public List<Section> findByName(String name) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query findSectionByNameQuery = session.createNamedQuery("findSectionByName");
        findSectionByNameQuery.setParameter("name", name);
        List<Section> sectionList = findSectionByNameQuery.getResultList();
        session.getTransaction().commit();
        session.close();
        return sectionList;
    }

    public Integer updateSection(String name, Set<Author> authorSet) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query updateSectionQuery = session.createNamedQuery("updateSection");
        updateSectionQuery.setParameter("name", name);
        updateSectionQuery.setParameter("authorSet", authorSet);
        Integer numberOfSectionsUpdated = updateSectionQuery.executeUpdate();
        session.getTransaction().commit();
        session.close();
        return numberOfSectionsUpdated;
    }


}
