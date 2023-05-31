package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.InputScanner;
import org.apache.commons.lang3.RandomUtils;

public class GCD {
    public static void findGCD() {
        String userName = Cli.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        int correctAnswers = 0;
        while (correctAnswers < 3) {
            int randomNum1 = RandomUtils.nextInt(1, Engine.MAX_RANDOM_NUM);
            int randomNum2 = RandomUtils.nextInt(1, Engine.MAX_RANDOM_NUM);
            int answer = calculateGCD(randomNum1, randomNum2);
            System.out.printf("Question: %d %d", randomNum1, randomNum2);
            System.out.println();
            System.out.print("Your answer: ");
            String userAnswer = InputScanner.returnLine();

            if (answer == Integer.parseInt(userAnswer)) {
                System.out.println("Correct!");
                correctAnswers += 1;
            } else {
                Engine.writeAboutIncorrectAnswers(userAnswer, answer);
                break;
            }
        }
        Engine.writeCongratsOrTryAgain(correctAnswers, userName);
    }
    public static int calculateGCD(int num1, int num2) {
        if (num1 > num2) {
            while (num1 % num2 != 0) {
                num1 = num1 % num2;
                return calculateGCD(num2, num1);
            }
            return num2;
        } else if (num2 > num1) {
            while (num2 % num1 != 0) {
                num2 = num2 % num1;
                return calculateGCD(num1, num2);
            }
            return num1;
        } else {
            return num1;
        }

    }
}
