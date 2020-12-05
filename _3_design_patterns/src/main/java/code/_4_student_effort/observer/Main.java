package code._4_student_effort.observer;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student1 = new Student("Popescu");
        Student student2 = new Student("Ionescu");
        Student student3 = new Student("Dragomirescu");

        student1.listenTo(teacher);
        student2.listenTo(teacher);
        student3.listenTo(teacher);

        String[] javaTopics = new String[]{"basics", "oo", "design patterns"};
        for (String javaTopic : javaTopics)
            teacher.teach(javaTopic);
    }
}
