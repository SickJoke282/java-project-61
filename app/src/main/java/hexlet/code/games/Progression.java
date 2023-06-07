package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Progression {
    static final int MAX_NUMBER_IN_PROGRESSION = 10;
    static final int MIN_PROGRESSION_LENGTH = 5;
    static final int MAX_PROGRESSION_LENGTH = 11;
    public static void guessNumberInProgression() {
        String description = "What number is missing in the progression?";
        String[][] rounds = new String[Engine.TOTAL_CORRECT_ANSWERS][2];
        for (int i = 0; i < rounds.length; i++) {
            String[] answers = createProgression();
            rounds[i][0] = "Question: " + answers[0];
            rounds[i][1] = answers[1];
        }
        Engine.doLogic(description, rounds);
    }
    public static String[] createProgression() {
        int progressionLength = RandomUtils.nextInt(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
        int firstNumber = RandomUtils.nextInt(1, MAX_NUMBER_IN_PROGRESSION);
        int incremental = RandomUtils.nextInt(2, MAX_NUMBER_IN_PROGRESSION);
        int indexOfHiddenNumber = RandomUtils.nextInt(1, progressionLength);
        int i = 0;
        int temp = firstNumber;
        int answer = 0;
        String progression = "";
        String[] answers = new String[2];
        while (i < progressionLength) {
            if (indexOfHiddenNumber == i) {
                progression += ".. ";
                answer = temp;
            } else {
                progression += temp + " ";
            }
            temp += incremental;
            i++;
        }
        answers[0] = progression;
        answers[1] = Integer.toString(answer);
        return answers;
    }
}
