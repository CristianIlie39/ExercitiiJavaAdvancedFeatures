package business.service;

import business.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import persistence.dao.PersonDAO;
import persistence.entities.Person;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonDAO personDAO;

    public void insert(PersonDTO personDTO) {
        Person person = new Person();
        person.setSurname(personDTO.getSurname());
        person.setFirstName(personDTO.getFirstName());
        person.setAddress(personDTO.getAddress());
        person.setAge(personDTO.getAge());
        personDAO.insert(person);
    }

    public Integer deletePersonBySurname(String surname) {
        Integer numberOfPersonsDeleted = personDAO.deletePersonBySurname(surname);
        return numberOfPersonsDeleted;
    }

    public List<PersonDTO> findBySurname(String surname) {
        List<Person> personListBySurname = personDAO.findBySurname(surname);
        List<PersonDTO> personDTOListBySurname = new ArrayList<>();
        for (Person person : personListBySurname) {
            PersonDTO personDTO = new PersonDTO();
            personDTO.setSurname(person.getSurname());
            personDTO.setFirstName(person.getFirstName());
            personDTO.setAge(person.getAge());
            personDTOListBySurname.add(personDTO);
        }
        return personDTOListBySurname;
    }

    public List<PersonDTO> findByAge(int age) {
        List<Person> personListByAge = personDAO.findByAge(age);
        List<PersonDTO> personDTOListByAge = new ArrayList<>();
        for (Person person : personListByAge) {
            PersonDTO personDTO = new PersonDTO();
            personDTO.setSurname(person.getSurname());
            personDTO.setFirstName(person.getFirstName());
            personDTO.setAge(person.getAge());
            personDTOListByAge.add(personDTO);
        }
        return personDTOListByAge;
    }

    public Integer updatePerson(String surname, String address) {
        Integer numberOfPersonsUpdated = personDAO.updatePersonBySurname(surname, address);
        return numberOfPersonsUpdated;
    }

}
