package duke.exceptions;

/**
 * Represents an exception due to bad save data.
 */
public class BadDataException extends DukeException {
    private static final String message = "Bad tasks data!";

    /**
     * Constructs a bad save data exception.
     */
    public BadDataException() {
        super(message);
    }
}