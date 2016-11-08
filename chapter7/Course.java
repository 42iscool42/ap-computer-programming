import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Student> students;
    
    public Course(String name) {
        this.name = name;
        students = new ArrayList<Student>();
    }
    
    public void addStudent(Student s) {
        students.add(s);
    }
    
    public double average() {
        double average = 0.0;
        for (Student s : students) {
            average += s.average();
        }
        return average / students.size();
    }
    
    public void roll() {
        for (Student s : students) {
            System.out.println(s + "\n");
        }
    }
}