public class Main {

    public static void main(String[] args) {

        //exercitii cu clasa Object ---> clasa parinte a tuturor obiectelor in Java
        //metoda: toString() ---> transformam un obiect intr-un string; returneaza un string
        //metoda: equals(Object obj) ---> vedem daca 2 obiecte sunt egale; returneaza un boolean
        //metoda: hashCode() ---> ne arata amprenta digitala a unui obiect; returneaza un int
        //intotdeauna cand suprascriem metoda equals trebuie sa suprascriem si metoda hashCode, pt ca daca 2 obiecte sunt egale dpvd al metodei equals trebuie sa fie egale si dpdv al metodei hashCode

        Student student = new Student("Ionescu", "Viorel", "Scolilor, 40");
        Student student1 = new Student("Popescu", "Ion", "Dorobantilor, 50");
        Student student2 = new Student("Ionescu", "Viorel", "Scolilor, 40");

        if (student.equals(student2)) {
            System.out.println("Studentii sunt egali");
        } else {
            System.out.println("Studentii nusunt egali");
        }

        if (student.hashCode() == student2.hashCode()) {
            System.out.println("Cei doi studenti sunt egali");
        } else {
            System.out.println("Cei doi studenti nu sunt egali");
        }

        System.out.println(student.hashCode());

        Car car = new Car("Mercedes", "GLK", 5);
        Car car1 = new Car("Audi", "A8", 5);

        System.out.println("Prima masina este: " + car);
        System.out.println("A doua masina este: " + car1);

        if (car.equals(car1)) {
            System.out.println("Masinile sunt identice");
        } else {
            System.out.println("Masinile sunt diferite");
        }

        if (car.hashCode() == car1.hashCode()) {
            System.out.println("Masinile sunt la fel");
        } else {
            System.out.println("Masinile nu sunt la fel");
        }

        System.out.println(car.hashCode());



    }

}
