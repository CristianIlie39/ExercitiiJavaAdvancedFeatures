public abstract class ShapeDecorator {

    protected Shape shapeToDecorate; //am adaugat un atribut ---> am aplicat relatia de compozitie: has-a

    public ShapeDecorator(Shape shapeToDecorate) {
        this.shapeToDecorate = shapeToDecorate;
    }

    public abstract void draw();
}
