package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.InputScanner;
import org.apache.commons.lang3.RandomUtils;

public class Even {
    public static void guessEvenOrOddNumbers() {
        String userName = Cli.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int correctAnswers = 0;
        while (correctAnswers < 3) {
            int randomNum = RandomUtils.nextInt(1, 100);
            System.out.printf("Question: %d", randomNum);
            System.out.println();
            System.out.print("Your answer: ");
            String userAnswer = InputScanner.returnLine();

            if (randomNum % 2 == 0 && userAnswer.equals("yes") || randomNum % 2 != 0 && userAnswer.equals("no")) {
                System.out.println("Correct!");
                correctAnswers += 1;
            } else {
                writeAboutIncorrectAnswers(userAnswer);
                break;
            }
        }
        Engine.writeCongratsOrTryAgain(correctAnswers, userName);
    }

    public static void writeAboutIncorrectAnswers(String userAnswer) {
        if (userAnswer.equals("yes")) {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
        } else if (userAnswer.equals("no")) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
        } else {
            System.out.println("Your input was incorrect. Try to type 'yes' or 'no'.");
        }
    }
}
