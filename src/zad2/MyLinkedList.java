package zad2;

import java.util.LinkedList;

public class MyLinkedList {
    public LinkedList<Integer> getLinkedList() {
        return linkedList;
    }

    Timer stopwatch = new Timer();
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    MyLinkedList(){

    }

    public String addTime(int what){
        stopwatch.start();
        linkedList.add(what);
        return stopwatch.stop();
    }

    public String findTime(int what){
        stopwatch.start();
        linkedList.add(what);
        return stopwatch.stop();
    }

    public String removeTime(int what){
        stopwatch.start();
        linkedList.remove(what);
        return stopwatch.stop();
    }

}
