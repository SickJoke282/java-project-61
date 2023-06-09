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
                continue;
            }
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'. \n", userAnswer, round[1]);
            System.out.println("Let's try again, " + userName + "!");
            break;
        }
        if (correctAnswers == TOTAL_CORRECT_ANSWERS) System.out.println("Congratulations, " + userName + "!");
    }
}
