package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Even {
    public static void guessEvenOrOddNumbers() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rounds = new String[Engine.TOTAL_CORRECT_ANSWERS][2];
        for (int i = 0; i < rounds.length; i++) {
            int randomNum = RandomUtils.nextInt(1, Engine.MAX_RANDOM_NUM);
            rounds[i][0] = "Question: " + randomNum;
            if (randomNum % 2 == 0) {
                rounds[i][1] = "yes";
            } else {
                rounds[i][1] = "no";
            }
        }
        Engine.doLogic(description, rounds);
    }
}
