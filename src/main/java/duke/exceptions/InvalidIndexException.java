package duke.exceptions;

/**
 * Represents an exception due to an invalid index.
 */
public class InvalidIndexException extends DukeException {
    private static final String MESSAGE = "ERROR: Invalid index!";

    /**
     * Constructs an invalid index exception.
     */
    public InvalidIndexException() {
        super(MESSAGE);
    }
}
