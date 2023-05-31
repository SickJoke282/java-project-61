package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.InputScanner;

public class Prime {
    public static void guessPrimeNumber() {
        String userName = Cli.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int correctAnswers = 0;
        while (correctAnswers < Engine.TOTAL_CORRECT_ANSWERS) {
            System.out.print("Question: ");
            int number = RandomUtils.nextInt(2, Engine.MAX_RANDOM_NUM);
            boolean answer = isNumberPrime(number);
            System.out.print("Your answer: ");
            String userAnswer = InputScanner.returnLine();

            if (answer && userAnswer.equals("yes") || !answer && userAnswer.equals("no")) {
                System.out.println("Correct!");
                correctAnswers += 1;
            } else {
                Engine.writeAboutIncorrectAnswers(userAnswer);
                break;
            }
        }
        Engine.writeCongratsOrTryAgain(correctAnswers, userName);
    }
    public static boolean isNumberPrime(int number) {
        System.out.println(number);
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

