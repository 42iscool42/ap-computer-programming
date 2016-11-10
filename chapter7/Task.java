public class Task implements Priority, Complexity, Comparable<Task> {
    String name;
    int priority, complexity;
    
    public Task(String name, int priority, int complexity) {
        this.name = name;
        this.priority = priority;
        this.complexity = complexity;
    }
    
    public Task(String name) {
        this(name, 0, 1);
    }
    
    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    public int getPriority() {
        return priority;
    }
    
    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }
    
    public int getComplexity() {
        return complexity;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public int compareTo(Task t) {
        return priority - t.getPriority();
    }
}