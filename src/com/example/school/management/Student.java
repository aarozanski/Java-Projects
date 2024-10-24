import java.util.ArrayList;

public class Student extends Person {
    private int studentID;
    private ArrayList<String> enrolledCourses = new ArrayList<>();
    private double tuition;

    public Student(String name, int age, int studentID, String[] enrolledCoursesArray, double tuition) {
        super(name, age);
        this.studentID = studentID;
        for (String course : enrolledCoursesArray) {
            this.enrolledCourses.add(course);
        }
        this.tuition = tuition;
    }

    public void enrollCourses(String[] courses) {
        for (String course : courses) {
            enrolledCourses.add(course);
        }
        updateTuition();
    }

    public void enrollCourses(String course) {
        enrolledCourses.add(course);
        updateTuition();
    }

    public void updateTuition() {
        setTuition(enrolledCourses.size() * 500);
    }

    private void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public double getTuition() {
        return tuition;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Current tuition: $" + tuition);
    }
}

