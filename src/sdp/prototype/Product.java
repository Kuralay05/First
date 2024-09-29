package sdp.prototype;
public class Product implements CloneableProduct {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Product clone() {
        return new Product(this.name, this.price);
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: " + price;
    }
}

