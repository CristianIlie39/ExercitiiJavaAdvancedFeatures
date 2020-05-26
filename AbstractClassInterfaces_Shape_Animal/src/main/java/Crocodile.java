public class Crocodile extends Animal implements Carnivorous, Wild {

    public String move() {
        return "The crocodile swims.";
    }

    public String eat() {
        return "The crocodile eats meat.";
    }

    @Override
    public boolean pet() {
        return false;
    }
}
