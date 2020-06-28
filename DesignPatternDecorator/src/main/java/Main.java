import java.util.Scanner;

public class Main {

    //exemplificam design pattern-ul Decorator

    public static void main(String[] args) {

        System.out.println("Menu");
        System.out.println("Key 1 - Triangle");
        System.out.println("Key 2 - Circle");
        System.out.println("Key 3 - Rectangle");
        System.out.println("Key 4 - TriangleDecorator");
        System.out.println("Key 5 - CircleDecorator");
        System.out.println("Key 6 - RectangleDecorator");

        Scanner scanner = new Scanner(System.in);
        int optiune = scanner.nextInt();
        if (optiune == 1) {
            Shape triangle = new Triangle();
            triangle.draw();
        } else if (optiune == 2) {
            Shape circle = new Circle();
            circle.draw();
        } else if (optiune == 3) {
            Shape rectangle = new Rectangle();
            rectangle.draw();
        } else if (optiune == 4) {
            Shape triangle = new Triangle();
            ShapeDecorator triangleDecorator = new TriangleDecorator(triangle);
            triangleDecorator.draw();
        } else if (optiune == 5) {
            Shape circle = new Circle();
            ShapeDecorator circleDecorator = new CircleDecorator(circle);
            circleDecorator.draw();
        } else if (optiune == 6) {
            Shape rectangle = new Rectangle();
            ShapeDecorator rectangleDecorator = new RectangleDecorator(rectangle);
            rectangleDecorator.draw();
        } else {
            System.out.println("Ati ales o optiune care nu exista!");
        }
    }
}
