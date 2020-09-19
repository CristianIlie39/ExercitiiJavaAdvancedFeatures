package business.service;

import business.dto.AuthorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import persistence.dao.AuthorDAO;
import persistence.entities.Author;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorDAO authorDAO;

    public void insert(AuthorDTO authorDTO) {
        Author author = new Author();
        author.setSurname(authorDTO.getSurname());
        author.setFirstName(authorDTO.getFirstName());
        authorDAO.insert(author);
    }

    public Long countAuthors(String surname, String firstName) {
        Long numberOfAuthors = authorDAO.countAuthors(surname, firstName);
        return numberOfAuthors;
    }

    public Integer deleteAuthorBySurname(String surname) {
        Integer numberOfDeletedAuthors = authorDAO.deleteAuthorBySurname(surname);
        return numberOfDeletedAuthors;
    }

    public List<AuthorDTO> findAuthorBySurname(String surname) {
        List<Author> authorList = authorDAO.findAuthorBySurname(surname);
        List<AuthorDTO> authorDTOList = new ArrayList<>();
        for (Author author : authorList) {
            AuthorDTO authorDTO = new AuthorDTO();
            authorDTO.setSurname(author.getSurname());
            authorDTO.setFirstName(author.getFirstName());
            authorDTOList.add(authorDTO);
        }
        return authorDTOList;
    }

    public Long countAuthorBySurname(String surname) {
        Long numberOfAuthorsBySurname = authorDAO.countAuthorBySurname(surname);
        return numberOfAuthorsBySurname;
    }

    public Integer updateAuthor(String surname, String firstName) {
        Integer numberOfAuthorsUpdated = authorDAO.updateAuthor(surname, firstName);
        return numberOfAuthorsUpdated;
    }

    public List<AuthorDTO> findAll() {
        AuthorDTO authorDTO = new AuthorDTO();
        List<Author> authorListAll = authorDAO.findAll();
        List<AuthorDTO> authorDTOList = new ArrayList<>();
        for (Author author : authorListAll) {
            authorDTO.setSurname(author.getSurname());
            authorDTO.setFirstName(author.getFirstName());
            authorDTOList.add(authorDTO);
        }
        return authorDTOList;
    }

}
