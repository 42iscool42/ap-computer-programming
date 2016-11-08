public class Student {
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    double test1, test2, test3;
    
    public Student(String first, String last, Address home, Address school, double test1, double test2, double test3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }
    
    public Student(String first, String last, Address home, Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        test1 = 0;
        test2 = 0;
        test3 = 0;
    }
    
    public void setTestScore(int testNum, double score) {
        switch (testNum) {
            case 1:
                test1 = score;
                break;
            case 2:
                test2 = score;
                break;
            case 3:
                test3 = score;
                break;
        }
    }
    
    public double getTestScore(int testNum) {
        switch (testNum) {
            case 1:
                return test1;
            case 2:
                return test2;
            case 3:
                return test3;
        }
        return 0.0;
    }
    
    public double average() {
        return (test1 + test2 + test3) / 3.0;
    }
    public String toString() {
        String result;
        result = firstName + " " + lastName + "\n";
        result += "Home address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Scores: " + test1 + ", " + test2 + ", " + test3 + "\n";
        result += "Average Score: " + average();
        return result;
    }
}