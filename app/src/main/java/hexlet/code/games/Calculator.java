package hexlet.code.games;
//using apache-commons-lang
import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Calculator {
    static final int MAX_INDEX = 3;
    public static void calcNumbers() throws Exception {
        String description = "What is the result of the expression?";
        String[][] rounds = new String[Engine.TOTAL_CORRECT_ANSWERS][2];
        String[] operations = {"+", "-", "*"};
        for (int i = 0; i < rounds.length; i++) {
            int randomNum1 = RandomUtils.nextInt(1, Engine.MAX_RANDOM_NUM);
            int randomNum2 = RandomUtils.nextInt(1, Engine.MAX_RANDOM_NUM);
            int indexOfOperator = RandomUtils.nextInt(0, MAX_INDEX);
            String operator = operations[indexOfOperator];
            int answer = calculate(operator, randomNum1, randomNum2);
            rounds[i][0] = randomNum1 + " " + operator + " " + randomNum2;
            rounds[i][1] = Integer.toString(answer);
        }
        Engine.doLogicAndInteractWithUser(description, rounds);
    }
    static int calculate(String operator, int randomNum1, int randomNum2) throws Exception {
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
            default -> throw new Exception("Unknown operator");
        }
    }
}
