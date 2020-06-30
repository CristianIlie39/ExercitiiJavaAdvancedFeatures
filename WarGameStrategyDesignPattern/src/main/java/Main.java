import java.util.Scanner;

public class Main {

    //exemplificam design patternul comportamental Strategy

    public static void main(String[] args) {

        System.out.println("Menu");
        System.out.println("key 1 - you chose the defence strategy");
        System.out.println("key 2 - you chose the attack strategy");

        Scanner scanner = new Scanner(System.in);
        int optiune = scanner.nextInt();
        if (optiune == 1) {
            Strategy defenceStrategy = new DefenceStrategy();
            BattleField battleFieldDefence = new BattleField(defenceStrategy);
            battleFieldDefence.applyStrategy();
        } else if (optiune == 2) {
            Strategy attackStrategy = new AttackStrategy();
            BattleField battleFieldAttack = new BattleField(attackStrategy);
            battleFieldAttack.applyStrategy();
        } else {
            System.out.println("You have chosen an option that does not exist.");
        }
    }
}
