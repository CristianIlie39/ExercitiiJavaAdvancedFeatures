public class Student {

    private String surname;
    private String name;
    private String address;

    public Student(String surname, String name, String address) {
        this.surname = surname;
        this.name = name;
        this.address = address;
    }

    public Student() {

    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return this.surname + " " + this.name + " " + this.address;
    }

    public boolean equals(Student obj) {
        if (this.surname.equals(obj.getSurname()) && this.name.equals(obj.getName()) && this.address.equals(obj.getAddress())) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.surname.length() + this.name.length() + this.address.length();
    }


}
