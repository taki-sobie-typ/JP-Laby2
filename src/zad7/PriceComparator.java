package zad7;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product product,Product otherProduct) {
        // Porównujemy produkty na podstawie ceny
        if (product.getCena() < otherProduct.getCena()) {
            return -1;
        } else if (product.getCena() > otherProduct.getCena()) {
            return 1;
        }
        return 0;
    }

}
