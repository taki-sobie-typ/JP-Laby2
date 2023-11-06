package zad2;
import java.lang.Math;
import java.util.ArrayList;
import java.util.LinkedList;

public class Tests {
    MyArrayList myArrayList = new MyArrayList();
    MyLinkedList myLinkedList = new MyLinkedList();
    public void runTests(int numbersToGenerate){
    int count = numbersToGenerate;

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("WYNIKI!!!:\n\nADD TIMES");

    int generated = (int)(Math.random()*100);
        for(int i=count;i>0;i--){
        stringBuilder.append("\narrayAddTime:");
        stringBuilder.append(myArrayList.addTime(generated));

        stringBuilder.append("\nlinkedAddTime:");
        stringBuilder.append(myLinkedList.addTime(generated));

        generated = (int)(Math.random()*100);
    }
        stringBuilder.append("\n\nTak wyglądają tabele:\nArray: "+myArrayList.getArrayList()
                +"\nLinked: "+myLinkedList.getLinkedList()
        );

        stringBuilder.append("\n\nFIND TIMES:");
        stringBuilder.append("\narrayFindTime:");
        stringBuilder.append(myArrayList.findTime(generated));

        stringBuilder.append("\nlinkedFindTime:");
        stringBuilder.append(myLinkedList.findTime(generated));

        stringBuilder.append("\n\nREMOVE TIMES:");
        stringBuilder.append("\narrayRemoveTime:");
        stringBuilder.append(myArrayList.removeTime(count/2));


        stringBuilder.append("\nlinkedRemoveTime:");
        stringBuilder.append(myLinkedList.removeTime(count/2));

        JOptionUserDialog jOptionUserDialog = new JOptionUserDialog();
        jOptionUserDialog.printMessage(stringBuilder.toString());

}
}
