package WK_7;

import java.util.ArrayList;

/**
 * Customer class represents a customer.
 */
class Customer {
    int customerId;
    String name;

    /**
     * Constructor for Customer
     */
    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    /**
     * Displays customer details
     */
    public void viewCustomer() {
        System.out.println("Customer: " + name);
    }
}

/**
 * Product class represents a product.
 */
class Product {
    int productId;
    String productName;
    double price;

    /**
     * Constructor for Product
     */
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    /**
     * Displays product details
     */
    public void getDetails() {
        System.out.println(productName + " - $" + price);
    }
}

/**
 * ShoppingCart class manages products in cart.
 */
class ShoppingCart {
    ArrayList<Product> products = new ArrayList<>();

    /**
     * Adds product to cart
     */
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.productName + " added to cart");
    }

    /**
     * Calculates total price
     */
    public double calculateTotalPrice() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }
}

/**
 * Main class for Shopping Cart System.
 */
public class ShoppingCartSystem {

    /**
     * Main method
     */
    public static void main(String[] args) {

        Customer c1 = new Customer(1, "John");
        Product p1 = new Product(101, "Laptop", 800);
        Product p2 = new Product(102, "Mouse", 20);

        ShoppingCart cart = new ShoppingCart();

        c1.viewCustomer();
        cart.addProduct(p1);
        cart.addProduct(p2);

        System.out.println("Total Price: $" + cart.calculateTotalPrice());
    }
}
