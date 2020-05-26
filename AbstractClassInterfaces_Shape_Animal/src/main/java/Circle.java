public class Circle extends Shape implements Calculable {

    @Override
    public String draw() {
        return "Desenez un cerc";
    }

    public String perimeter() {
        return "Se calculeaza perimetrul cercului";
    }

    public String arial() {
        return "Se calculeaza aria cercului";
    }

}
