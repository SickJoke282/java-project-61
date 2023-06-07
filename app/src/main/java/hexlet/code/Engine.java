package hexlet.code;

public class Engine {
    public static final int TOTAL_CORRECT_ANSWERS = 3;
    public static final int MAX_RANDOM_NUM = 100;

    public static void doLogic(String description, String[][] rounds) {
        String userName = Cli.greeting();
        System.out.println(description);
        int correctAnswers = 0;
        for (String[] round : rounds) {
            System.out.println(round[0]);
            System.out.print("Your answer: ");
            String userAnswer = InputScanner.returnLine();
            if (round[1].equals(userAnswer)) {
                System.out.println("Correct!");
                correctAnswers += 1;
            } else {
                if (round[1].equals("yes") || round[1].equals("no")) {
                    writeAboutIncorrectAnswers(userAnswer);
                } else {
                    Engine.writeAboutIncorrectAnswers(userAnswer, Integer.parseInt(round[1]));
                }
                break;
            }
        }
        Engine.writeCongratsOrTryAgain(correctAnswers, userName);

    }
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
        if (correctAnswers == TOTAL_CORRECT_ANSWERS) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
