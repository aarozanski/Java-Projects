public class Main {
    public static void main(String[] args) {
        CourseManager courseManager = new CourseManager();

        Student adinai = new Student("Adinai", 21, 1, new String[] {"Math", "Science"}, 0);
        Student yasmin = new Student("Yasmin", 14, 2, new String[] {"History"}, 0);
        Student aisun = new Student("Aisun", 10, 3, new String[] {"Economics", "Art"}, 0);

        courseManager.addStudent(adinai);
        courseManager.addStudent(yasmin);
        courseManager.addStudent(aisun);

        courseManager.displayAllStudents();
    }
}

