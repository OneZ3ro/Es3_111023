package entities;

import java.util.Random;

public class Product {
    private long id;
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        Random rndm = new Random();
        this.name = name;
        this.category = category;
        this.price = price;
        this.id = rndm.nextInt(1000, 2000);
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                "}\n";
    }
}
