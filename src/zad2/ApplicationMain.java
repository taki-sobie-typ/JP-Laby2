package zad2;

public class ApplicationMain {
    public static void main(String[] args) {
        Tests tests = new Tests();

        String MESSAGE = "Ile liczb wygenerować i wpisać?:\n-> ";

        JOptionUserDialog jOptionUserDialog = new JOptionUserDialog();
        jOptionUserDialog.printMessage("WITAM!");

        tests.runTests(Integer.parseInt(jOptionUserDialog.enterString(MESSAGE)));
    }

}

