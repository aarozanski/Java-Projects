import java.util.ArrayList;

public class CourseManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudents() {
        System.out.println("List of all students:");
        for (Student student : students) {
            student.displayDetails();
        }
    }
}

