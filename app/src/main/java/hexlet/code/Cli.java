package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner inputScan = new Scanner(System.in);
        String userName = inputScan.nextLine();
        System.out.println(String.format("Hello, %s!", userName));
    }
}
