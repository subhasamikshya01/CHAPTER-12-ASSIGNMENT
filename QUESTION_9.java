import java.util.ArrayList;
import java.util.List;

// Interface representing the enrollment system
interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);
    void dropStudent(Student student, Course course);
    void displayEnrollmentDetails();
}

// Student class
class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Getters and setters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}

// Course class
class Course {
    private String courseId;
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Getters
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    // Method to enroll a student
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    // Method to drop a student
    public void dropStudent(Student student) {
        enrolledStudents.remove(student);
    }
}

// Enrollment class implementing EnrollmentSystem interface
class Enrollment implements EnrollmentSystem {
    private List<Student> students;
    private List<Course> courses;

    public Enrollment() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    // Method to enroll a student in a course
    @Override
    public void enrollStudent(Student student, Course course) {
        if (!students.contains(student)) {
            students.add(student);
        }
        course.enrollStudent(student);
    }

    // Method to drop a student from a course
    @Override
    public void dropStudent(Student student, Course course) {
        if (students.contains(student)) {
            course.dropStudent(student);
        }
    }

    // Method to display enrollment details
    @Override
    public void displayEnrollmentDetails() {
        for (Course course : courses) {
            System.out.println("Course: " + course.getCourseName());
            System.out.println("Enrolled Students:");
            for (Student student : course.getEnrolledStudents()) {
                System.out.println("Student ID: " + student.getStudentId() + ", Name: " + student.getName());
            }
            System.out.println();
        }
    }

    // Method to add a course
    public void addCourse(Course course) {
        courses.add(course);
    }
}

// Main class to demonstrate the functionality
public class Main {
    public static void main(String[] args) {
        // Creating enrollment system
        EnrollmentSystem enrollmentSystem = new Enrollment();

        // Creating students
        Student student1 = new Student("101", "Alice");
        Student student2 = new Student("102", "Bob");

        // Creating courses
        Course course1 = new Course("C101", "Java Programming");
        Course course2 = new Course("C102", "Data Structures");

        // Adding courses to the enrollment system
        ((Enrollment) enrollmentSystem).addCourse(course1);
        ((Enrollment) enrollmentSystem).addCourse(course2);

        // Enrolling students in courses
        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course1);
        enrollmentSystem.enrollStudent(student2, course2);

        // Displaying enrollment details
        System.out.println("Enrollment Details:");
        enrollmentSystem.displayEnrollmentDetails();

        // Dropping a student from a course
        enrollmentSystem.dropStudent(student2, course1);

        // Displaying updated enrollment details
        System.out.println("Updated Enrollment Details:");
        enrollmentSystem.displayEnrollmentDetails();
    }
}
