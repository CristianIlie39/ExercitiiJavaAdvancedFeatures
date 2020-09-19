package frontend;

import business.dto.AuthorDTO;
import business.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping(path = "/insertAuthor")
    public String insertAuthor(@RequestBody @Valid AuthorDTO authorToInsert) {
        AuthorDTO authorDTO = new AuthorDTO();
        authorDTO.setSurname(authorToInsert.getSurname());
        authorDTO.setFirstName(authorToInsert.getFirstName());
        Long numberOfAuthors = authorService.countAuthors(authorDTO.getSurname(), authorDTO.getFirstName());
        if (numberOfAuthors == 0) {
            authorService.insert(authorDTO);
            System.out.println("A fost inserat autorul cu numele: " + authorToInsert.getSurname() + " " + authorToInsert.getFirstName());
            return "Autorul a fost inserat cu succes";
        } else {
            System.out.println("Exista un autor identic in baza de date");
            return "Exista un autor identic in baza de date";
        }
    }

    @DeleteMapping(path = "/deleteAuthorBySurname")
    public String deleteAuthorBySurname(@RequestParam String surname) {
        Integer numberOfAuthors = authorService.deleteAuthorBySurname(surname);
        if (numberOfAuthors > 0) {
            return "Autorul a fost sters cu succes";
        } else {
            return "Autorul nu a fost sters cu succes";
        }
    }

    @GetMapping(path = "/findAuthor")
    public ResponseEntity<List<AuthorDTO>> findAuthorBySurname(@RequestParam String surname) {
        List<AuthorDTO> authorDTOList = authorService.findAuthorBySurname(surname);
        if (authorDTOList.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(authorDTOList);
        }
    }

    @PutMapping(path = "/updateAuthor")
    public String updateAuthor(@RequestParam String surname, @RequestParam String firstName) {
        Long numberOfAuthorsBySurname = authorService.countAuthorBySurname(surname);
        if (numberOfAuthorsBySurname == 1) {
            Integer numberOfAuthorsUpdated = authorService.updateAuthor(surname, firstName);
            if (numberOfAuthorsUpdated > 0) {
                return "Prenumele autorului a fost updatat cu succes";
            } else {
                return "Autorul nu a fost updatat cu succes";
            }
        } else if (numberOfAuthorsBySurname > 1) {
            return "Te rog sa restrangi aria de cautare";
        } else {
            return "A aparut o eroare";
        }

    }


}
