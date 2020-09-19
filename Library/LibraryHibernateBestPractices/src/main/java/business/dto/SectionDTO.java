package business.dto;

import java.util.Set;

public class SectionDTO {

    private String name;
    private Set<AuthorDTO> authorDTOSet;

    public SectionDTO(String name, Set<AuthorDTO> authorDTOSet) {
        this.name = name;
        this.authorDTOSet = authorDTOSet;
    }

    public SectionDTO() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<AuthorDTO> getAuthorDTOSet() {
        return authorDTOSet;
    }

    public void setAuthorDTOSet(Set<AuthorDTO> authorDTOSet) {
        this.authorDTOSet = authorDTOSet;
    }

    @Override
    public String toString() {
        return "SectionDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
