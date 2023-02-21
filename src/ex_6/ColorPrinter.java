package ex_6;

public class ColorPrinter extends Printer {
    private static final String ANSI_RESET = "\u001B[0m";

    public void print(String value, String color) {
        System.out.println(color + value + ANSI_RESET);
    }
}
