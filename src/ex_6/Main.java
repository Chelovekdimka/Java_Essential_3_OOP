//Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас Printer. У тілі класу створіть метод void print(String value),
//        який виводить на екран значення аргументу. Реалізуйте можливість того, щоб у разі успадкування від даного класу інших класів,
//        та виклику відповідного методу їх екземпляра, рядки, передані як аргументи методів,
//        виводилися різними кольорами. Обязательно используйте приведення типів.

package ex_6;

public class Main {
    public static void main(String[] args) {
        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.print("Red text", "\u001B[31m"); // red text
        colorPrinter.print("Green text", "\u001B[32m"); // green text

    }
}
