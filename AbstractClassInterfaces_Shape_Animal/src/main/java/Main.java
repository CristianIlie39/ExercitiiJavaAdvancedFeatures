public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        System.out.println(circle.draw());
        System.out.println(circle.perimeter());
        System.out.println(circle.arial());

        System.out.println(rectangle.draw());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.arial());

        System.out.println(square.draw());
        System.out.println(square.perimeter());
        System.out.println(square.arial());

        System.out.println();

        Shape circle1 = new Circle();
        Shape rectangle1 = new Rectangle();
        Shape square1 = new Square();

        System.out.println(circle1.draw());
        System.out.println(rectangle1.draw());
        System.out.println(square1.draw());

        Calculable circle2 = new Circle();
        Calculable rectangle2 = new Rectangle();
        Calculable square2 = new Square();

        System.out.println(circle2.perimeter());
        System.out.println(circle2.arial());
        System.out.println(rectangle2.perimeter());
        System.out.println(rectangle2.arial());
        System.out.println(square2.perimeter());
        System.out.println(square2.arial());

        //modelam animale
        //care zboara, alearga, se tarasc, innoata
        //porumbel, tigru, soparla, crocodil

        Crocodile crocodile = new Crocodile();
        Dove dove = new Dove();
        Lizard lizard = new Lizard();
        Tiger tiger = new Tiger();

        System.out.println(crocodile.move());
        System.out.println(crocodile.eat());
        System.out.println(crocodile.pet());

        System.out.println(dove.eat());
        System.out.println(dove.move());
        System.out.println(dove.pet());

        System.out.println(lizard.move());
        System.out.println(lizard.eat());
        System.out.println(lizard.pet());

        System.out.println(tiger.move());
        System.out.println(tiger.eat());
        System.out.println(tiger.pet());

        System.out.println();

        Animal crocodile1 = new Crocodile();
        Animal dove1 = new Dove();
        Animal lizard1 = new Lizard();
        Animal tiger1 = new Tiger();

        System.out.println(crocodile1.move());
        System.out.println(crocodile1.sleep());
        System.out.println(dove1.move());
        System.out.println(dove1.sleep());
        System.out.println(lizard1.move());
        System.out.println(lizard1.sleep());
        System.out.println(tiger1.move());
        System.out.println(tiger1.sleep());

        System.out.println();

        Carnivorous crocodile2 = new Crocodile();
        Domestic dove2 = new Dove();
        Omnivorous lizard2 = new Lizard();
        Carnivorous tiger2 = new Tiger();

        System.out.println(crocodile2.eat());
        System.out.println(dove2.pet());
        System.out.println(lizard2.eat());
        System.out.println(tiger2.eat());

        System.out.println();

        Wild crocodile3 = new Crocodile();
        Herbivorous dove3 = new Dove();
        Domestic lizard3 = new Lizard();
        Wild tiger3 = new Tiger();

        System.out.println(crocodile3.pet());
        System.out.println(dove3.eat());
        System.out.println(lizard3.pet());
        System.out.println(tiger3.pet());



    }

}
