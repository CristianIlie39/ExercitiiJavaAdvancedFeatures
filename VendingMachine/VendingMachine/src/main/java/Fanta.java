public class Fanta extends Drink {

    public Fanta(String productName, int productPrice,int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public Fanta() {

    }

    public String toString() {
        return this.productName + ";" + this.productPrice + ";" + this.productQuantity;
    }

}
