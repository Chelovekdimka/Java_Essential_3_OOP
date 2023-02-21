package ex_6;

import java.awt.*;
import java.util.Random;

public class Printer {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String[] COLORS = {
            "\u001B[31m", // red
            "\u001B[32m", // green
            "\u001B[33m", // yellow
            "\u001B[34m", // blue
            "\u001B[35m", // purple
            "\u001B[36m", // cyan
            "\u001B[37m" // white
    };
    private static final Random random = new Random();

    public void print(String value) {
        String color = COLORS[random.nextInt(COLORS.length)];
        System.out.println(color + value + ANSI_RESET);
    }
}
