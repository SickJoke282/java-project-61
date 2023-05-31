package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.InputScanner;
import org.apache.commons.lang3.RandomUtils;

public class Calculator {
    public static void calcNumbers() {
        String userName = Cli.greeting();
        System.out.println("What is the result of the expression?");
        int correctAnswers = 0;
        String operator = "";
        while (correctAnswers < 3) {
            int answer = 0;
            int randomNum1 = RandomUtils.nextInt(1, 100);
            int randomNum2 = RandomUtils.nextInt(1, 100);
            int indexOfOperator = RandomUtils.nextInt(1, 4);
            switch (indexOfOperator) {
                case 1 -> {
                    operator = "+";
                    answer = randomNum1 + randomNum2;
                }
                case 2 -> {
                    operator = "-";
                    answer = randomNum1 - randomNum2;
                }
                case 3 -> {
                    operator = "*";
                    answer = randomNum1 * randomNum2;
                }
            }
            System.out.printf("Question: %d %s %d", randomNum1, operator, randomNum2);
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
}
