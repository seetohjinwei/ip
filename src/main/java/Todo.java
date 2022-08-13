/**
 * Todo is a Task without any date/time attached to it.
 */
public class Todo extends Task {
    public final static DukeException emptyDescription = new DukeException("Description of Todo cannot be empty!");

    /**
     * Private constructor for a Todo, with a description.
     * Todo is set as "not done" when created.
     *
     * @param description Description of a todo.
     */
    private Todo(String description) {
        super(description);
    }

    /**
     * Factory Method for a Todo, with a user input.
     * Todo is set as "not done" when created.
     *
     * @param description Description of Todo.
     *
     * @return Todo object with the given user input.
     */
    public static Todo create(String description) throws DukeException {
        if (description.length() < 1) {
            throw Todo.emptyDescription;
        }
        return new Todo(description);
    }

    /**
     * Gets the string representation of a todo.
     *
     * @return String representation of a todo.
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}