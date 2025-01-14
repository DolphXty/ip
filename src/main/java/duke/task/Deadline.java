package duke.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * Represents a deadline task
 */
public class Deadline extends Task{
    protected LocalDateTime by;
    private DateTimeFormatter parseFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HHmm");
    private DateTimeFormatter printFormat = DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a");
    /**
     * Constructor for Deadline
     *
     * @param description
     *            the description of the deadline
     * @param by
     *            the datetime deadline of the task given in yyyy-MM-dd HHmm format
     */
    public Deadline(String description, String by) {
        super(description);
        this.by = LocalDateTime.from(parseFormat.parse(by));
    }

    public Deadline(String description, boolean isDone, String by) {
        super(description, isDone);
        this.by = LocalDateTime.from(parseFormat.parse(by));
    }

    public String getTask() {
        return "[D]" + super.getTask() + " (by: " + this.by.format(printFormat) + ")";
    }
}

