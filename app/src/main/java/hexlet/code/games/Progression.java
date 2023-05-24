package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.InputScanner;
import org.apache.commons.lang3.RandomUtils;

public class Progression {
    public static void guessNumberInProgression() {
        String userName = Cli.greeting();
        System.out.println("What number is missing in the progression?");
        int correctAnswers = 0;
        while (correctAnswers < 3) {
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
        int progressionLength = RandomUtils.nextInt(5, 11);
        int firstNumber = RandomUtils.nextInt(1, 10);
        int incremental = RandomUtils.nextInt(2, 10);
        int indexOfHiddenNumber = RandomUtils.nextInt(1, progressionLength + 1);
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
