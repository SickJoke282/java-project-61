package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Calculator {
    static final int MAX_INDEX = 3;
    public static void calcNumbers() {
        String description = "What is the result of the expression?";
        String[][] rounds = new String[3][2];
        String[] operations = {"+", "-", "*"};
        for (int i = 0; i < rounds.length; i++) {
            int randomNum1 = RandomUtils.nextInt(1, Engine.MAX_RANDOM_NUM);
            int randomNum2 = RandomUtils.nextInt(1, Engine.MAX_RANDOM_NUM);
            int indexOfOperator = RandomUtils.nextInt(0, MAX_INDEX);
            String operator = defineAnOperator(operations, indexOfOperator);
            int answer = calculate(operator, randomNum1, randomNum2);
            rounds[i][0] = "Question: " + randomNum1 + " "+ operator + " " + randomNum2;
            rounds[i][1] = Integer.toString(answer);
        }
        Engine.doLogic(description, rounds);
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
