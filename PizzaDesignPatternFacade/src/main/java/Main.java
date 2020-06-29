import java.util.Scanner;

public class Main {

    /* Exemplificam design pattern-ul Facade
     - ne ajuta sa ascundem complexitatea crearii unui obiect si ofera o interfata sau o clasa (un singur punct de
       intrare sau un singur loc) prin care sa cream obiecte
     */

    public static void main(String[] args) {

        System.out.println("Meniu");
        System.out.println("1 - pizza casei");
        System.out.println("2 - pizza quattro stagioni");
        System.out.println("3 - pizza quattro formaggi");
        System.out.println("4 - pizza vegetariana");

        Scanner scanner = new Scanner(System.in);
        PizzaMaker pizzaMaker = new PizzaMaker();
        int optiune = scanner.nextInt();
        if (optiune == 1) {
            pizzaMaker.makePizzaCasei();
        } else if (optiune == 2) {
            pizzaMaker.makePizzaQuattroStagioni();
        } else if (optiune == 3) {
            pizzaMaker.makePizzaQuattroFormaggi();
        } else if (optiune == 4) {
            pizzaMaker.makePizzaVegetariana();
        } else {
            System.out.println("Optiunea introdusa nu exista");
        }
    }
}
