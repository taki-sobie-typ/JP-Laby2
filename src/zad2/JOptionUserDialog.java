package zad2;
import javax.swing.*;

public class JOptionUserDialog {
    public void printMessage(String message){
        JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.PLAIN_MESSAGE);
    }

    public String enterString(String prompt) {
        return JOptionPane.showInputDialog(null, prompt, "Wprowadź", JOptionPane.QUESTION_MESSAGE);
    }

}
