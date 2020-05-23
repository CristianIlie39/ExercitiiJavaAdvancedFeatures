import java.util.Scanner;

public class Main {

    //sa se modeleze urmatoarele entitati
    //un student care o sa aiba nume, prenume, o nota la matematica, o nota la informatica si o nota la fizica, si un atribut "admis la Politehnica" care va fi boolean
    //se vor introduce de la tastatura numele, prenumele si notele studentului
    //clasa parinte va fi Person
    //folosim o interfata pe a gestiona notele si adminterea la facultate; admiterea se va calcula in functie de medii
    //daca media notelor este mai mica decat 6, sa se arunce o exceptie "BadGradesException"

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Va rog sa introduceti numele studentului");
        String nume = scanner.nextLine();
        System.out.println("Va rog sa introduceti prenumele studentului");
        String prenume = scanner.nextLine();
        System.out.println("Va rog sa introduceti nota la matematica");
        int notaMate = scanner.nextInt();
        System.out.println("Va rog sa introduceti nota la fizica");
        int notaFiz = scanner.nextInt();
        System.out.println("Va rog sa introduceti nota la informatica");
        int notaInfo = scanner.nextInt();

        System.out.println("Ati intodus numele, prenumele studentului si notele la matematica, fizica si informatica: " + nume + " " + prenume + " " + notaMate + " " + notaFiz + " " + notaInfo);

        Student student = new Student(nume, prenume, notaMate, notaFiz, notaInfo);

        try {
            student.computeAverage();
        }catch (BadGradesException e) {
            System.out.println("A fost o problema cu calcularea mediei " + e.getMessage());
        }

        System.out.println("Rezultatul admiterii este: " + student.getAdmisPoli());

    }

    //sa se creeze si sa se trateze exceptia atunci cand notele sunt mai mari decat 10 si mai mici decat 1
    //sa se mai adauge urmatorul compertament prin intermediul unei interfete: sa se calculeze media doar la matematica si la fizica si sa se adauge un camp "Admis la facultatea de fizica" si sa se calculeze media la matematica si informatica si sa existe un camp "Admis la info"
    //sa se mai adauge ao exceptie si sa se arunce atunci cand media este 10 perfect la oricare din cele 3 materii si sa se afiseze mesajul "Felicitari! Aveti 10 perfect!"
    //de adaugat o interfata cu comportamente care pot fi implementate - 1 sau 2

}
