package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner inputScan = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = inputScan.nextLine();
        System.out.println(String.format("Hello, %s!", userName));

        inputScan.close();
    }
}
