package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.InputScanner;
import org.apache.commons.lang3.RandomUtils;

public class Calculator {
    static final int MAX_INDEX = 3;
    public static void calcNumbers() {
        String userName = Cli.greeting();
        System.out.println("What is the result of the expression?");
        int correctAnswers = 0;
        String[] operations = {"+", "-", "*"};
        while (correctAnswers < Engine.TOTAL_CORRECT_ANSWERS) {
            int randomNum1 = RandomUtils.nextInt(1, Engine.MAX_RANDOM_NUM);
            int randomNum2 = RandomUtils.nextInt(1, Engine.MAX_RANDOM_NUM);
            int indexOfOperator = RandomUtils.nextInt(0, MAX_INDEX);
            String operator = defineAnOperator(operations, indexOfOperator);
            int answer = calculate(operator, randomNum1, randomNum2);
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
    static int calculate(String operator, int randomNum1, int randomNum2) {
        switch (operator) {
            case "+" -> {
                return randomNum1 + randomNum2;
            }
            case "-" -> {
                return randomNum1 - randomNum2;
            }
            case "*" -> {
                return randomNum1 * randomNum2;
            }
            default -> {
                return 0;
            }
        }
    }
    static String defineAnOperator(String[] operations, int indexOfOperator) {
        String operator = "";
        switch (indexOfOperator) {
            case 0:
                operator = operations[0];
                break;
            case 1:
                operator = operations[1];
                break;
            case MAX_INDEX - 1:
                operator = operations[MAX_INDEX - 1];
            default:
        }
        return operator;
    }
}
