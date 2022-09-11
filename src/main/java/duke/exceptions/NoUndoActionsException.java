package duke.exceptions;

/**
 * Represents an exception due to no undo actions.
 */
public class NoUndoActionsException extends DukeException {
    private static final String message = "No actions to undo!";

    /**
     * Constructs a no undo actions left exception.
     */
    public NoUndoActionsException() {
        super(message);
    }
}