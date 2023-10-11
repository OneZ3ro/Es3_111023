import entities.Product;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Product pr1 = new Product("Art-book-1", "Book", 17.38);
//        Product pr2 = new Product("Art-book-2", "Book", 12.33);
//        Product pr3 = new Product("Art-book-3", "Book", 11.21);
//        Product pr4 = new Product("Art-book-4", "Book", 20.78);
//        Product pr5 = new Product("Art-book-5", "Book", 9.99);
//        Product pr6 = new Product("Art-baby-1", "Baby", 17.38);
//        Product pr7 = new Product("Art-baby-2", "Baby", 12.33);
//        Product pr8 = new Product("Art-baby-3", "Baby", 11.21);
//        Product pr9 = new Product("Art-baby-4", "Baby", 20.78);
//        Product pr10 = new Product("Art-baby-5", "Baby", 9.99);
//        Product pr11 = new Product("Art-boys-1", "Boys", 17.38);
//        Product pr12 = new Product("Art-boys-2", "Boys", 12.33);
//        Product pr13 = new Product("Art-boys-3", "Boys", 11.21);
//        Product pr14 = new Product("Art-boys-4", "Boys", 20.78);
//        Product pr15 = new Product("Art-boys-5", "Boys", 9.99);
        System.out.println("Quanti prodotti voi mettere nella tua categoria?");
        int risp1 = Integer.parseInt(input.nextLine());
        List<Product> arrProducts = new ArrayList<>(createProductArr("Books", risp1));
        System.out.println(arrProducts);
        input.close();
    }
    public static List<Product> createProductArr(String category, int howMany) {
        List<Product> arrProd = new ArrayList<>();
        Random rndm = new Random();
        for (int i = 0; i < howMany; i++) {
            double rounded = Math.round(rndm.nextDouble(100, 200) * 100.0) / 100.0;
            Product prod = new Product("Art-" + category + "-" + (i+1), category, rounded);
            arrProd.add(prod);
        }
        return arrProd;
    }


}
