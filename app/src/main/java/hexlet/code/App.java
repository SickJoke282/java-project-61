package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        String gameNumber = InputScanner.returnLine();
        switch (gameNumber) {
            case "6":
                Prime.guessPrimeNumber();
                break;
            case "5":
                Progression.guessNumberInProgression();
                break;
            case "4":
                GCD.findGCD();
                break;
            case "3":
                Calculator.calcNumbers();
                break;
            case "2":
                Even.guessEvenOrOddNumbers();
                break;
            case "1":
                Cli.greeting();
                break;
            case "0":
                break;
            default:
                break;
        }
    }
}
