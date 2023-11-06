package zad3;
import javax.management.StringValueExp;
import java.util.Scanner;

public class ApplicationMain {
    public static void  main(String[] args){
       Dictionary dictionary = new Dictionary();
       Scanner scanner = new Scanner(System.in);

       System.out.println("Ile słów chcesz umieścić w słowniku?");
       dictionary.dictAdding(scanner.nextInt());

       System.out.println(dictionary.getHashMap());
       System.out.println(dictionary.getTreeMap());

    }
}
