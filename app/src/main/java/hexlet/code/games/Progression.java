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
            int progressionLength = RandomUtils.nextInt(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
            int firstNumber = RandomUtils.nextInt(1, MAX_NUMBER_IN_PROGRESSION);
            int incremental = RandomUtils.nextInt(2, MAX_NUMBER_IN_PROGRESSION);
            String[] answers = createProgression(progressionLength, firstNumber, incremental);
            rounds[i][0] = answers[0];
            rounds[i][1] = answers[1];
        }
        Engine.doLogicAndInteractWithUser(description, rounds);
    }
    public static String[] createProgression(int progressionLength, int firstNumber, int incremental) {
        int indexOfHiddenNumber = RandomUtils.nextInt(1, progressionLength);
        int temp = firstNumber;
        String[] progression = new String[progressionLength];
        String[] answers = new String[2];
        for (int i = 0; i < progressionLength; i++) {
            progression[i] = Integer.toString(temp);
            temp += incremental;
        }
        String answer = progression[indexOfHiddenNumber];
        progression[indexOfHiddenNumber] = "..";
        answers[0] = String.join(" ", progression);
        answers[1] = answer;
        return answers;
    }
}
