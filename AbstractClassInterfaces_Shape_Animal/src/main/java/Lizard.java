public class Lizard extends Animal implements Omnivorous, Domestic {

    public String move() {
        return "The lizard crawls";
    }

    public String eat() {
        return "The lizard eats both grass and meat.";
    }

    public boolean pet() {
        return true;
    }

}
