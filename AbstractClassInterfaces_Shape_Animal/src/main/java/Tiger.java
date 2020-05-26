public class Tiger extends Animal implements Carnivorous, Wild {

    public String move() {
        return "The tiger is running.";
    }

    public String eat() {
        return "The tiger eats meat.";
    }

    public boolean pet() {
        return false;
    }

}
