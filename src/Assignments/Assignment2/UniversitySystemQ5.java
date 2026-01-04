package Assignments.Assignment2;
import java.util.*;

class UniversitySystemQ5 {
    static class Student {
        int id;
        String course;
        int marks;

        Student(int i, String c, int m) {
            id = i;
            course = c;
            marks = m;
        }
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "CS", 80));
        list.add(new Student(2, "IT", 70));

        list.sort((a, b) -> b.marks - a.marks);

        for (Student s : list)
            System.out.println(s.id + " " + s.course + " " + s.marks);

        Set<String> courses = new HashSet<>();
        for (Student s : list)
            courses.add(s.course);

        System.out.println(courses);
    }
}
