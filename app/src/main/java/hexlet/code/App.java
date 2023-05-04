package hexlet.code;

import java.util.Scanner;
class App {
    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n0 - Exit");
        System.out.print(String.format("Your choice: "));
        int gameNumber = inputScan.nextInt();
        switch (gameNumber) {
            case 1:
                Cli.greeting();
                break;
            case 0:
                break;
        }
    }
}
