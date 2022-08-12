import java.util.Scanner;

public class Duke {
    private static final String indentation = "    ";
    private static final String horizontalLine = indentation + "____________________________________________________________";

    public static void main(String[] args) {
        System.out.println(horizontalLine);
        String logo = indentation + "____        _        \n"
                + indentation + "|  _ \\ _   _| | _____ \n"
                + indentation + "| | | | | | | |/ / _ \\\n"
                + indentation + "| |_| | |_| |   <  __/\n"
                + indentation + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println(indentation + "Hello I'm\n" + logo);
        System.out.println(indentation + "What can I do for you?");
        System.out.println(horizontalLine);

        Scanner scanner = new Scanner(System.in);

        inputLoop:
        while (true) {
            String input = scanner.nextLine();

            System.out.println(horizontalLine);

            switch (input) {
                case "bye":
                    System.out.println(indentation + "Bye, hope to see you soon!");
                    break inputLoop;
                default:
                    System.out.println(indentation + input);
            }

            System.out.println(horizontalLine);
        }
    }
}
