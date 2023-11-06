package zad3;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Scanner;

public class Dictionary {
    private HashMap<String, String> hashMap = new HashMap<String, String>();

    private TreeMap<String, String> treeMap = new TreeMap<String, String>();

    Scanner scanner = new Scanner(System.in);
    Dictionary(){

    }

    public void dictAdding(int howMeny){
        for(int i=0;i<howMeny;i++){
            System.out.println("Dodaj słowo oraz definicje do słownika:");
            String word = scanner.nextLine();
            String definition = scanner.nextLine();

            addToHashMap(word, definition);
            addToTreeMap(word, definition);
        }
    }

    private void addToHashMap(String word, String definition){
        hashMap.put(word, definition);

    }

    private void addToTreeMap(String word, String definition){
        treeMap.put(word, definition);

    }

    public HashMap<String, String> getHashMap() {
        return hashMap;
    }

    public TreeMap<String, String> getTreeMap() {
        return treeMap;
    }

}
