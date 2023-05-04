package hexlet.code;

class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("2 - Even\n1 - Greet\n0 - Exit");
        System.out.print("Your choice: ");
        String gameNumber = InputScanner.returnLine();
        switch (gameNumber) {
            case "2":
                Even.evenNumbers();
                break;
            case "1":
                Cli.greeting();
                break;
            case "0":
                break;
            default:
                break;
        }
    }
}
