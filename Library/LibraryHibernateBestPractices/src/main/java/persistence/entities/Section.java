package persistence.entities;

import javax.persistence.*;
import java.util.Set;

@NamedQueries({
        @NamedQuery(name = "findSectionByName", query = "select section from Section section where section.name = :name"),
        @NamedQuery(name = "deleteSectionByName", query = "delete from persistence.entities.Section section where name = :name"),
        @NamedQuery(name = "updateSection", query = "update from persistence.entities.Section section set section.authorSet = :authorSet where section.name = :name")
})

@Entity
@Table(name = "sections")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    //cream relatia ManyToMany intre entitatile Section si Author; Section este entitatea care initiaza operatiile de CRUD
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "authors_sections",
            joinColumns = {@JoinColumn(name = "sections_id")},
            inverseJoinColumns = {@JoinColumn(name = "authors_id")}
    )
    private Set<Author> authorSet;

    //In entiatatea Person avem jeja creata realatia ManyToMany intre entiatatile Section si Person
    //Person este entitatea care initiaza operatiile de CRUD

    public Section(String name, Set<Author> authorSet) {
        this.name = name;
        this.authorSet = authorSet;
    }

    public Section(String name) {
        this.name = name;
    }

    public Section() {

    }

    public String getName() {
        return name;
    }

    public Set<Author> getAuthorSet() {
        return authorSet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthorSet(Set<Author> authorSet) {
        this.authorSet = authorSet;
    }

    public String toString() {
        return this.name;
    }

}
