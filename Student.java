package WK_7;

public class Student {
    // Attributes (fields)
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Optional: toString() for easy printing
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a Student object
        Student s1 = new Student("Alice", 20);

        // Print details
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

        // Or use toString()
        System.out.println(s1);
    }
}