package sdp.prototype;
public class MainPrototype {
    public static void main(String[] args) {
        Product originalProduct = new Product("Laptop", 1500.0);
        Product clonedProduct = originalProduct.clone();

        System.out.println("Original: " + originalProduct);
        System.out.println("Clone: " + clonedProduct);
    }
}

