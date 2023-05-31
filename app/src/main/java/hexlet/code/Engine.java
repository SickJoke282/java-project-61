package hexlet.code;

public class Engine {
    public static void writeAboutIncorrectAnswers(String userAnswer, int answer) {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%d'.", userAnswer, answer);
        System.out.println();
    }
    public static void writeAboutIncorrectAnswers(String userAnswer) {
        if (userAnswer.equals("yes")) {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
        } else if (userAnswer.equals("no")) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
        } else {
            System.out.println("Your input was incorrect. Try to type 'yes' or 'no'.");
        }
    }
    public static void writeCongratsOrTryAgain(int correctAnswers, String userName) {
        if (correctAnswers == 3) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
