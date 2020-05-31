public class Employee {

    private String surname;
    private String name;
    private String department;

    public Employee(String surname, String name, String department) {
        this.surname = surname;
        this.name = name;
        this.department = department;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return this.surname + " " + this.name + ";" + this.department;
    }

    public boolean equals(Employee obj) {
        if (this.surname.equals(obj.getSurname()) && this.name.equals(obj.getName()) && this.department.equals(obj.getDepartment())) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.surname.length() + this.name.length() + this.department.length();
    }


}
