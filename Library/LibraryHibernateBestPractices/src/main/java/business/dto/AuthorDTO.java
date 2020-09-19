package business.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class AuthorDTO {

    @NotBlank(message = "surname field cannot be blank")
    @NotEmpty(message = "surname field cannot be empty")
    @Pattern(regexp = "([a-zA-Z])*")
    @NotNull
    private String surname;

    @NotBlank(message = "firstName field cannot be blank")
    @NotEmpty(message = "firstName field cannot be empty")
    @NotNull
    @Pattern(regexp = "([a-zA-Z])*")
    private String firstName;

    public AuthorDTO(String surname, String firstName) {
        this.surname = surname;
        this.firstName = firstName;
    }

    public AuthorDTO() {

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

    @Override
    public String toString() {
        return "AuthorDTO{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
