package zad1;

public class ApplicationMain {
    public static void main(String[] args) {
        WordInserter wordInserter = new WordInserter(5);
        wordInserter.insertStart();

        System.out.println("\nHashSet:"+String.valueOf(wordInserter.getHashSet()));
        System.out.println("TreeSet:"+String.valueOf(wordInserter.getTreeSet())+"\n");

        wordInserter.deleteStart();
    }
}