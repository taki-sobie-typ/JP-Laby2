package zad7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ApplicationMain {
    public static void main(String[] args){
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product("Laptop","Marka1", 1.71F));
        productList.add(new Product("Tablet","Marka2", 2.61F));
        productList.add(new Product("Telefon","Marka3", 3.51F));
        productList.add(new Product("Sluchawki","Marka4", 4.41F));
        productList.add(new Product("Pendrive","Marka5", 5.31F));
        productList.add(new Product("Dysk","Marka6", 6.21F));
        productList.add(new Product("GPU","Marka7", 7.11F));

        System.out.println("Nie posortowana Lista:");
        for (Product product : productList) {
            System.out.println(product.getNazwa());
        }

        //productList.sort(Comparator.comparing(Product::getNazwa));
        Collections.sort(productList);

        System.out.println("\nPosortowana Lista:");
        for (Product product : productList) {
            System.out.println(product.getNazwa());
        }

        productList.sort(new PriceComparator());

        System.out.println("\nPosortowana Lista:");
        for (Product product : productList) {
            System.out.println(product.getNazwa());
        }

    }
}
