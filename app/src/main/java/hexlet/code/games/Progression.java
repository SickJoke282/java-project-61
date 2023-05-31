package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.InputScanner;
import org.apache.commons.lang3.RandomUtils;

public class Progression {
    static final int MAX_NUMBER_IN_PROGRESSION = 10;
    static final int MIN_PROGRESSION_LENGTH = 5;
    static final int MAX_PROGRESSION_LENGTH = 11;
    public static void guessNumberInProgression() {
        String userName = Cli.greeting();
        System.out.println("What number is missing in the progression?");
        int correctAnswers = 0;
        while (correctAnswers < Engine.TOTAL_CORRECT_ANSWERS) {
            System.out.print("Question: ");
            int answer = createProgression();
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
    public static int createProgression() {
        int progressionLength = RandomUtils.nextInt(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
        int firstNumber = RandomUtils.nextInt(1, MAX_NUMBER_IN_PROGRESSION);
        int incremental = RandomUtils.nextInt(2, MAX_NUMBER_IN_PROGRESSION);
        int indexOfHiddenNumber = RandomUtils.nextInt(1, progressionLength);
        int i = 0;
        int temp = firstNumber;
        int answer = 0;
        while (i < progressionLength) {
            if (indexOfHiddenNumber == i) {
                System.out.print(".. ");
                answer = temp;
            } else {
                System.out.printf("%d ", temp);
            }
            temp += incremental;
            i++;
        }
        return answer;
    }
}
