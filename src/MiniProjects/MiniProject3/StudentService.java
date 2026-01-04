package MiniProjects.MiniProject3;

import java.util.*;

class StudentService {

    private ArrayList<Student> list = new ArrayList<>();

    public void addStudent(Student s) {
        for (Student st : list)
            if (st.getEno() == s.getEno())
                throw new RuntimeException("Enrollment number must be unique");

        if (s.getPercentage() <= 0)
            throw new RuntimeException("Percentage must be positive");

        list.add(s);
    }

    public void displayAll() {
        if (list.isEmpty())
            System.out.println("No students found");
        else
            list.forEach(System.out::println);
    }

    public Student search(int eno) {
        for (Student s : list)
            if (s.getEno() == eno)
                return s;
        return null;
    }

    public void updateBranch(int eno, String branch) {
        if (branch.isEmpty())
            throw new RuntimeException("Branch cannot be empty");

        Student s = search(eno);
        if (s == null)
            throw new RuntimeException("Student not found");

        s.setBranch(branch);
    }

    public void delete(int eno) {
        boolean removed = list.removeIf(s -> s.getEno() == eno);
        if (!removed)
            throw new RuntimeException("Student not found");
    }

    public void sortStudents() {
        list.sort(Comparator.comparingDouble(Student::getPercentage).reversed());
        System.out.println("Students sorted by percentage");
    }
}
