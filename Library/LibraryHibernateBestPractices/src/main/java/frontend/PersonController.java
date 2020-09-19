package frontend;

import business.dto.PersonDTO;
import business.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping(path = "/insertPerson")
    public String insertPerson(@RequestBody PersonDTO personToInsert) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setSurname(personToInsert.getSurname());
        personDTO.setFirstName(personToInsert.getFirstName());
        personDTO.setAge(personToInsert.getAge());
        personDTO.setAddress(personToInsert.getAddress());
        personDTO.setBookDTOSet(personToInsert.getBookDTOSet());
        personDTO.setAuthorDTOSet(personToInsert.getAuthorDTOSet());
        personDTO.setSectionDTOSet(personToInsert.getSectionDTOSet());
        personService.insert(personToInsert);
        System.out.println("Persoana introdusa este: " + personToInsert.getSurname() + " " + personToInsert.getFirstName() +
                ", are adresa in orasul " + personToInsert.getAddress() + " si are varsta de " + personToInsert.getAge() +
                " ani.");
        return "Persoana introdusa este: " + personToInsert.getSurname() + " " + personToInsert.getFirstName() +
                ", are adresa in orasul " + personToInsert.getAddress() + " si are varsta de " + personToInsert.getAge() +
                " ani.";
    }

    @DeleteMapping(path = "/deletePerson")
    public String deletePersonByName(String surname) {
        Integer numberOfPersonsDeleted = personService.deletePersonBySurname(surname);
        if (numberOfPersonsDeleted > 0) {
            return "Persoana a fost stearsa cu succes";
        } else {
            return "Persoana nu a fost stearsa cu succes";
        }
    }

    @GetMapping(path = "/getPersonBySurname")
    public ResponseEntity<List<PersonDTO>> findBySurname(@RequestParam String surname) {
        List<PersonDTO> personDTOList = personService.findBySurname(surname);
        if (personDTOList.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(personDTOList);
        }
    }

    @PutMapping(path = "/updatePerson")
    public String updatePerson(String surname, String address) {
        Integer numberOfPersonsUpdated = personService.updatePerson(surname, address);
        if (numberOfPersonsUpdated > 0) {
            return "Persoana a fost updatata cu succes";
        } else {
            return "Persoana nu a fost updatata cu succes";
        }
    }
}
