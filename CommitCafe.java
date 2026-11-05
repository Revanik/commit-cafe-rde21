public class CommitCafe {

    private static String barista = "Joe";
    private static String nickname = "J";

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.println("a message");
        
        // STUDENT_TODO_2B: Add a second brew-related improvement

        System.out.println("CoffeeBot brewed " + drink + ". Espresso yourself, then push to main.");
        System.out.println("[BOT CHECK] drink length = " + drink.length());
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}