package zad1;

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;
import java.util.Scanner;

public class WordInserter {
    private int wordNumber;
    private HashSet hashSet = new HashSet();
    private TreeSet treeSet = new TreeSet();

    private Scanner scanner = new Scanner(System.in);

    public WordInserter(int wordNumber){
        this.wordNumber = wordNumber;
    }

    public void insertStart(){
        long timeHash;
        long timeTree;
        System.out.println("Zacznij wpisywać imiona.");
        for(int i=wordNumber;i>0;i--){
            System.out.printf("-> ");
            String word = scanner.nextLine();

            timeHash = System.nanoTime();
            addToHashSet(word);
            timeHash -= System.nanoTime();
            System.out.println("Nano time of HashSet:"+(-1*timeHash));

            timeTree = System.nanoTime();
            addToTreeSet(word);
            timeTree -= System.nanoTime();
            System.out.println("Nano time of TreeSet:"+(-1*timeTree));
        }
    }

    public void deleteStart(){
        System.out.println("Zacznij wpisywać imiona do usunięcia.");


        boolean condition = true;

        while(condition){
            System.out.printf("-> ");
            String word = scanner.nextLine();

            System.out.println("Nano time of deleteHash:"+deleteFromHashSet(word));
            System.out.println("Nano time of deleteTree:"+deleteFromTreeSet(word));

            System.out.printf("Czy kontynuować?:\n-> ");
            if(!Objects.equals(scanner.nextLine(), "y")){
               condition = false;
            }
        }
    }

    private boolean addToTreeSet(String word){
        try{
            treeSet.add(word);
            return true;
        }
        catch (Exception e){
            System.out.println("Something went wrong, try different word");
        }
        return false;
    }

    private boolean addToHashSet(String word){
        try{
            hashSet.add(word);
            return true;
        }
        catch (Exception e){
            System.out.println("Something went wrong, try different word");
        }
        return false;
    }

    public TreeSet getTreeSet() {
        return treeSet;
    }

    public HashSet getHashSet() {
        return hashSet;
    }

    private long deleteFromTreeSet(String word) {
        long time = 0;
        try{
            time = System.nanoTime();
            treeSet.remove(word);
            time -= System.nanoTime();
        }
        catch (Exception e){
            System.out.printf("This word does not exist in TreeSet try different");
        }
        return -1*time;
    }

    private long deleteFromHashSet(String word) {
        long time = 0;
        try{
            time = System.nanoTime();
            hashSet.remove(word);
            time -= System.nanoTime();
        }
        catch (Exception e){
            System.out.println("This word does not exist in HashSet try different");
        }
        return -1*time;
    }
}
