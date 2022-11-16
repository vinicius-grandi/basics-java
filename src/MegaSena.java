import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        System.out.println(ANSI_RED + "Please type your name:" + ANSI_RESET);
        // System.in stops the script from running and capture all the typed text
        Scanner scanner = new Scanner(System.in);

        // it advances to the next line and returns the value from the current one
        String name = scanner.nextLine();

        System.out.println(String.format("Hello %s, are you fine?", name));
    }
}
