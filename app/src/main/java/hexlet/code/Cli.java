package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May i have your name? ");
        String userName = scanner.next();
        System.out.print("Hello, " + userName + "! ");
        scanner.close();
    }
}
