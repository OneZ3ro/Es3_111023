import entities.Costumer;
import entities.Order;
import entities.Product;
import entities.StringMod;

import java.util.*;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        StringMod wrapper = s -> "\n-------------------------------- " + s + " --------------------------------\n";
        List<Product> arrProducts = new ArrayList<>(createProductArr());
        Costumer costumer = new Costumer("Gino");
        Costumer costumer2 = new Costumer("Franco");
        Costumer costumer3 = new Costumer("Roberto");
        costumer2.setTier(2);
        costumer3.setTier(2);

        primoEs(arrProducts, wrapper);

        List<Order> ordine = new ArrayList<>();
        ordine.add(Order.Ordersetter(arrProducts, 6, costumer));
        secondoEs(ordine, wrapper);

        terzoEs(arrProducts, wrapper);

        ordine.add(Order.Ordersetter(arrProducts, 4, costumer2));
        ordine.add(Order.Ordersetter(arrProducts, 5, costumer3));

    }

    public static void primoEs(List<Product> arrProducts, StringMod wrapper) {
        System.out.println(wrapper.modify("Es1"));
        arrProducts.stream().filter(product -> product.getPrice() > 100 && product.getCategory().equals("Books")).forEach(System.out::println);
    }

    public static void secondoEs(List<Order> ordine, StringMod wrapper) {
        System.out.println(wrapper.modify("Es2"));
        System.out.println(wrapper.modify("Ordine completo"));
        for (int i = 0; i < ordine.size(); i++) {
            ordine.get(i).getProducts().forEach(System.out::println);
        }
        System.out.println(wrapper.modify("Ordine solo baby"));
        for (int i = 0; i < ordine.size(); i++) {
            ordine.get(i).getProducts().stream().filter(product -> product.getCategory().equals("Baby")).forEach(System.out::println);
        }
    }

    public static void terzoEs(List<Product> arrProducts, StringMod wrapper) {
        System.out.println(wrapper.modify("Es3"));
        List<Product> xyz = arrProducts.stream().filter(product -> product.getCategory().equals("Boys")).map(price -> {price.setPrice(Math.round((price.getPrice() * 0.9) * 100.0) / 100.0);return price;}).toList();
        xyz.forEach(System.out::println);
    }

    public static List<Product> createProductArr() {
        List<Product> arrProd = new ArrayList<>();
        Supplier<Product> prodSupp1 = () -> new Product("Art-book-1", "Books", 170.38);
        Supplier<Product> prodSupp2 = () -> new Product("Art-book-2", "Books", 42.33);
        Supplier<Product> prodSupp3 = () -> new Product("Art-book-3", "Books", 110.21);
        Supplier<Product> prodSupp4 = () -> new Product("Art-book-4", "Books", 70.78);
        Supplier<Product> prodSupp5 = () -> new Product("Art-book-5", "Book", 90.99);
        Supplier<Product> prodSupp6 = () -> new Product("Art-baby-1", "Baby", 170.38);
        Supplier<Product> prodSupp7 = () -> new Product("Art-baby-2", "Baby", 42.33);
        Supplier<Product> prodSupp8 = () -> new Product("Art-baby-3", "Baby", 110.21);
        Supplier<Product> prodSupp9 = () -> new Product("Art-baby-4", "Baby", 70.78);
        Supplier<Product> prodSupp10 = () -> new Product("Art-baby-5", "Baby", 90.99);
        Supplier<Product> prodSupp11 = () -> new Product("Art-boys-1", "Boys", 170.38);
        Supplier<Product> prodSupp12 = () -> new Product("Art-boys-2", "Boys", 42.33);
        Supplier<Product> prodSupp13 = () -> new Product("Art-boys-3", "Boys", 110.21);
        Supplier<Product> prodSupp14 = () -> new Product("Art-boys-4", "Boys", 70.78);
        Supplier<Product> prodSupp15 = () -> new Product("Art-boys-5", "Boys", 90.99);
        arrProd.add(prodSupp1.get());
        arrProd.add(prodSupp2.get());
        arrProd.add(prodSupp3.get());
        arrProd.add(prodSupp4.get());
        arrProd.add(prodSupp5.get());
        arrProd.add(prodSupp6.get());
        arrProd.add(prodSupp7.get());
        arrProd.add(prodSupp8.get());
        arrProd.add(prodSupp9.get());
        arrProd.add(prodSupp10.get());
        arrProd.add(prodSupp11.get());
        arrProd.add(prodSupp12.get());
        arrProd.add(prodSupp13.get());
        arrProd.add(prodSupp14.get());
        arrProd.add(prodSupp15.get());
        return arrProd;
    }


}
