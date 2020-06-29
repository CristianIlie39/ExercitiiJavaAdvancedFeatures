import java.util.Scanner;

public class Main {

    //Exemplificam design pattern-ul Facade

    public static void main(String[] args) {
        Meniu.displayMeniu();
        CarMaker carMaker = new CarMaker();
        Scanner scanner = new Scanner(System.in);
        int optiune = scanner.nextInt();
        if (optiune == 1) {
            carMaker.makeAudi();
        } else if (optiune == 2) {
            carMaker.makeSeat();
        } else if (optiune == 3) {
            carMaker.makeVolkswagen();
        } else {
            System.out.println("You have chosen an option that does not exist.");
        }
    }
}
