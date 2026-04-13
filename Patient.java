package Hospital1Project;

public class Patient implements Comparable<Patient> {
	String name;
    String condition;
    int priority;

    public Patient(String name, String condition, int priority) {
        this.name = name;
        this.condition = condition;
        this.priority = priority;
    }

    @Override
    public int compareTo(Patient other) {
        // Lower number = higher priority
        return this.priority - other.priority;
    }
    
    @Override
    public String toString() {
        return name + " (" + condition + ", Priority: " + priority + ")";
    }
}