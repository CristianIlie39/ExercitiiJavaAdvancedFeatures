public class Dove extends Animal implements Domestic, Herbivorous {

    public String move() {
        return "The dove flies.";
    }

    public boolean pet() {
        return true;
    }

    public String eat() {
        return "The dove eats grass";
    }

}
