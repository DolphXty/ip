package duke.task;

public class Event extends Task{
        protected String at;

        public Event(String description, String at) {
            super(description);
            this.at = at;
        }
        public String getTask() {
            return "[E]" + super.getTask() + " (at: " + at + ")";
        }
}
