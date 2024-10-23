import java.util.Scanner;

class Student {
    // Attributes of the Student class
    String name;
    int rollNumber;
    float marks;

    // Method to input student details
    void inputDetails() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        rollNumber = scanner.nextInt();
        System.out.print("Enter marks: ");
        marks = scanner.nextFloat();
        scanner.nextLine(); // Consume newline left-over
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        final int MAX_STUDENTS = 2; // Maximum number of students
        Student[] students = new Student[MAX_STUDENTS]; // Array of Student objects

        // Input details for each student
        for (int i = 0; i < MAX_STUDENTS; i++) {
            System.out.println("\nEntering details for Student " + (i + 1) + ":");
            students[i] = new Student(); // Create a new Student object
            students[i].inputDetails(); // Input student details
        }

        // Display details for each student
        for (int i = 0; i < MAX_STUDENTS; i++) {
            students[i].displayDetails(); // Display student details
        }
    }
}