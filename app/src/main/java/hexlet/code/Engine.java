package hexlet.code;

public class Engine {
    public static void writeCongratsOrTryAgain(int correctAnswers, String userName) {
        if (correctAnswers == 3) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}