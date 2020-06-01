import java.lang.ref.SoftReference;

public class Student {

    private String surname;
    private String name;
    private String group;
    private String optional;

    public Student(String surname, String name, String group, String optional) {
        this.surname = surname;
        this.name = name;
        this.group = group;
        this.optional = optional;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getOptional() {
        return optional;
    }

    public String toString() {
        return this.surname + " " + this.name + " " + this.group + " " + this.optional;
    }

}
