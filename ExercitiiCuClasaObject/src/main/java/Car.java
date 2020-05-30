public class Car {

    private String marca;
    private String model;
    private int nrUsi;

    public Car(String marca, String model, int nrUsi) {
        this.marca = marca;
        this.model = model;
        this.nrUsi = nrUsi;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public int getNrUsi() {
        return nrUsi;
    }

    public String toString() {
        return this.marca + " " + this.model + " " + this.nrUsi;
    }

    public boolean equals(Car obj) {
        if (this.marca.equals(obj.getMarca()) && this.model.equals(obj.getModel()) && this.nrUsi == obj.nrUsi) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.marca.length() + this.model.length() + this.nrUsi;
    }


}
