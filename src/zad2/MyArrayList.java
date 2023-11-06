package zad2;

import java.util.ArrayList;

public class MyArrayList {
    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    Timer stopwatch = new Timer();
    MyArrayList(){

    }

    public String addTime(int what){
        stopwatch.start();
        arrayList.add(what);
        return stopwatch.stop();
    }

    public String findTime(int what){
        stopwatch.start();
        arrayList.add(what);
        return stopwatch.stop();
    }

    public String removeTime(int what){
        stopwatch.start();
        arrayList.remove(what);
        return stopwatch.stop();
    }
}
