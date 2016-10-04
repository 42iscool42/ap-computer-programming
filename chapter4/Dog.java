package chapter4;

public class Dog {
    private int age;
    private String name;
    
    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getPersonYears() {
        return age * 7;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        return "Dog: " + name + ", Age: " + age;
    }
}