package zad7;
import java.lang.Comparable;

public class Product implements Comparable<Product> {
    public String getNazwa() {
        return nazwa;
    }

    private String nazwa;

    public String getMarka() {
        return marka;
    }

    private String marka;

    public float getCena() {
        return cena;
    }

    private float cena;
    Product(String nazwa, String marka, float cena){
        this.nazwa = nazwa;
        this.cena = cena;
        this.marka = marka;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return -1*this.nazwa.compareTo(otherProduct.getNazwa());
    }


}
