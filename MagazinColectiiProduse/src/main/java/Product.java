public class Product {

    private String category;
    private String name;
    private String section; //l-am fi lasat Int doar daca am fi avut de facut operatii cu Int-uri; altfel il lasam String pt ca e mai usor de operat in cazul acestui execitiu
    private String price;
    private String discount;

    public Product(String category, String name, String section, String price, String discount) {
        this.category = category;
        this.name = name;
        this.section = section;
        this.price = price;
        this.discount = discount;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }

    public String getPrice() {
        return price;
    }

    public String getDiscount() {
        return discount;
    }

    public String toString() {
        return this.category + ";" + this.name + ";" + this.section + ";" + this.price + ";" + this.discount;
    }

}
