package hexlet.code;

public class Engine {
    public static final int TOTAL_CORRECT_ANSWERS = 3;
    public static final int MAX_RANDOM_NUM = 100;

    public static void doLogicAndInteractWithUser(String description, String[][] rounds) {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String userName = InputScanner.returnLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);
        for (String[] round : rounds) {
            System.out.println("Question: " + round[0]);
            System.out.print("Your answer: ");
            String userAnswer = InputScanner.returnLine();
            if (round[1].equals(userAnswer)) {
                System.out.println("Correct!");
                continue;
            }
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'. \n", userAnswer, round[1]);
            System.out.println("Let's try again, " + userName + "!");
            return;
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
