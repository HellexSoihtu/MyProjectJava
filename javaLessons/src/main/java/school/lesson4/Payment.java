package school.lesson4;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    List<Product> productList = new ArrayList<>();

    public Payment() {

    }
    public void showProducts() {
        productList.forEach(System.out::println);
    }
    public List<Product> getProductList() {
        return productList;
    }
    public void addProduct(String name, int price) {
        productList.add(new Product(name, price));
    }
    public class Product {
        public String name;
        public int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product name = " + name + "," + " price = " + price;
        }
    }

    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.addProduct("product1", 1);
        payment.addProduct("product2", 2);
        payment.addProduct("product3", 4);

        payment.showProducts();
    }
}