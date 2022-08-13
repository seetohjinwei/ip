/**
 * Deadline is a Task that needs to be done before a specific date/time.
 */
public class Deadline extends Task {
    /** Deadline of the deadline. */
    private final String deadline;

    /**
     * Private constructor for a deadline, with a description and deadline.
     * Deadline is set as "not done" when created.
     *
     * @param description Description of a deadline.
     * @param deadline    Deadline of a deadline.
     */
    private Deadline(String description, String deadline) {
        super(description);
        this.deadline = deadline;
    }

    /**
     * Factory Method for a Deadline, with a user input.
     * Deadline is set as "not done" when created.
     *
     * @param input User input that starts with "deadline".
     *
     * @return Deadline object with the given user input.
     */
    public static Deadline create(String input) {
        // Obtain the description and date from the user input.
        String descAndDate = input.substring(9);
        // Split the input into description and date with the separator of "\by".
        String[] split = descAndDate.split(" /by ");
        String description = split[0];
        String deadline = split[1];
        return new Deadline(description, deadline);
    }

    /**
     * Gets the string representation of a deadline.
     *
     * @return String representation of a deadline.
     */
    @Override
    public String toString() {
        return String.format("[D]%s (by: %s)", super.toString(), this.deadline);
    }
}
