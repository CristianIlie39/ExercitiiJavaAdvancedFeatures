public class Americano extends Coffee {

    public Americano(String productName, int productPrice,int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public Americano() {

    }

    public String toString() {
        return this.productName + ";" + this.productPrice + ";" + this.productQuantity;
    }

}
