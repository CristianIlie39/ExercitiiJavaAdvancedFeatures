package business.service;

import business.dto.AuthorDTO;
import business.dto.SectionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import persistence.dao.SectionDAO;
import persistence.entities.Author;
import persistence.entities.Section;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SectionService {

    @Autowired
    SectionDAO sectionDAO;

    public void insert(SectionDTO sectionDTO) {
        Set<Author> authorSet = new HashSet<>();
        for (AuthorDTO authorDTO : sectionDTO.getAuthorDTOSet()) {
            Author author = new Author();
            author.setSurname(authorDTO.getSurname());
            author.setFirstName(authorDTO.getFirstName());
            authorSet.add(author);
        }
        Section section = new Section();
        section.setName(sectionDTO.getName());
        section.setAuthorSet(authorSet);
        sectionDAO.insert(section);
    }

    public Integer deleteSectionByName(String name) {
        Integer numberOfSectionsDeleted = sectionDAO.deleteSectionByName(name);
        System.out.println("business -> numarul de sectiuni sterse este: " + numberOfSectionsDeleted);
        return numberOfSectionsDeleted;
    }

    public List<SectionDTO> findByName(String name) {
        List<Section> sectionListByName = sectionDAO.findByName(name);
        List<SectionDTO> sectionDTOListByName = new ArrayList<>();
        for (Section section : sectionListByName) {
            SectionDTO sectionDTO = new SectionDTO();
            sectionDTO.setName(section.getName());
            sectionDTOListByName.add(sectionDTO);
        }
        return sectionDTOListByName;
    }

    public Integer updateSection(String name, Set<AuthorDTO> authorDTOSet) {
        Set<Author> authorSet = new HashSet<>();
        for (AuthorDTO authorDTO : authorDTOSet)  {
            Author author = new Author();
            author.setSurname(authorDTO.getSurname());
            author.setFirstName(authorDTO.getFirstName());
            authorSet.add(author);
        }
        Integer numberOfSectionsUpdated = sectionDAO.updateSection(name, authorSet);
        return numberOfSectionsUpdated;
    }

}
