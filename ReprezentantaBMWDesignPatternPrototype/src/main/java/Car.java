public class Car {

    private String name;
    private String model;
    private String engine;
    private String color;

    public Car(String name, String model, String engine, String color) {
        this.name = name;
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Pentru a implementa design pattern Prototype suprascriem metoda clone() din clasa Object
    public Car clone() {
        return new Car(this.name, this.model, this.engine, this.color);
    }

    public String toString() {
        return this.name + "," + this.model + "," + this.engine + "," + this.color;
    }

}
