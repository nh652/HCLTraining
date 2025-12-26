package Assignment02;
import java.util.*;

class StudentManagerQ3 {
    static class Student {
        int roll;
        String name;

        Student(int r, String n) {
            roll = r;
            name = n;
        }
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        list.add(new Student(1, "A"));
        list.add(new Student(2, "B"));

        for (Student s : list)
            System.out.println(s.roll + " " + s.name);

        int r = sc.nextInt();
        list.removeIf(s -> s.roll == r);

        r = sc.nextInt();
        for (Student s : list)
            if (s.roll == r)
                System.out.println(s.name);

        sc.close();
    }
}
