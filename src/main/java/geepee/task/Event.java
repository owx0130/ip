package geepee.task;

public class Event extends Task {

    private String from;
    private String to;

    public Event(String description, String from, String to) {
        super(description);
        this.from = from;
        this.to = to;
    }

    public Event(String description, String from, String to, boolean isDone) {
        super(description);
        this.from = from;
        this.to = to;
        this.isDone = isDone;
    }

    public String toString() {
        return String.format("[E]" + super.toString() + " (from: " + from + " to: " + to + ")");
    }

    public String toFileFriendlyString() {
        return String.format("E;" + super.toFileFriendlyString() + ";" + from + ";" + to);
    }
}
