package business.dto;

import java.util.Set;

public class PersonDTO {

    private String surname;
    private String firstName;
    private String address;
    private int age;
    private Set<BookDTO> bookDTOSet;
    private Set<AuthorDTO> authorDTOSet;
    private Set<SectionDTO> sectionDTOSet;

    public PersonDTO(String surname, String firstName, String address, int age, Set<BookDTO> bookDTOSet, Set<AuthorDTO> authorDTOSet, Set<SectionDTO> sectionDTOSet) {
        this.surname = surname;
        this.firstName = firstName;
        this.address = address;
        this.age = age;
        this.bookDTOSet = bookDTOSet;
        this.authorDTOSet = authorDTOSet;
        this.sectionDTOSet = sectionDTOSet;
    }

    public PersonDTO(String surname, String firstName, String address, int age) {
        this.surname = surname;
        this.firstName = firstName;
        this.address = address;
        this.age = age;
    }

    public PersonDTO() {

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<BookDTO> getBookDTOSet() {
        return bookDTOSet;
    }

    public void setBookDTOSet(Set<BookDTO> bookDTOSet) {
        this.bookDTOSet = bookDTOSet;
    }

    public Set<AuthorDTO> getAuthorDTOSet() {
        return authorDTOSet;
    }

    public void setAuthorDTOSet(Set<AuthorDTO> authorDTOSet) {
        this.authorDTOSet = authorDTOSet;
    }

    public Set<SectionDTO> getSectionDTOSet() {
        return sectionDTOSet;
    }

    public void setSectionDTOSet(Set<SectionDTO> sectionDTOSet) {
        this.sectionDTOSet = sectionDTOSet;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
