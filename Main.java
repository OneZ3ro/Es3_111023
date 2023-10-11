import entities.Costumer;
import entities.Order;
import entities.Product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int defaultDaysForDelivery = 2;
        List<Product> arrProducts = new ArrayList<>(createProductArr());
        Costumer costumer = new Costumer("Angelo");
        primoEs(arrProducts);
        List<Order> ordine = new ArrayList<>();
        ordine.add(Order.Ordersetter(arrProducts, 6, costumer));
        secondoEs(ordine);
    }

    public static void primoEs(List<Product> arrProducts) {
        arrProducts.stream().filter(product -> product.getPrice() > 100 && product.getCategory().equals("Books")).forEach(elem -> System.out.println(elem));
    }
//    public static List<Product> createProductArr(String category, int howMany) {
//        List<Product> arrProd = new ArrayList<>();
//        Random rndm = new Random();
//        for (int i = 0; i < howMany; i++) {
//            double rounded = Math.round(rndm.nextDouble(10, 200) * 100.0) / 100.0;
//            Product prod = new Product("Art-" + category + "-" + (i+1), category, rounded);
//            arrProd.add(prod);
//        }
//        return arrProd;
//    }

    public static void secondoEs(List<Order> ordine) {
        for (int i = 0; i < ordine.size(); i++) {
            ordine.get(i).getProducts().stream().filter(product -> product.getCategory().equals("Baby")).forEach(elem -> System.out.println(elem));
        }
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
