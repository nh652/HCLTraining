package MiniProjects.MiniProject3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        if (!Login.authenticate()) {
            System.out.println("Invalid login");
            return;
        }

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n1.Add Student");
            System.out.println("2.Display All Students");
            System.out.println("3.Search Student by Eno");
            System.out.println("4.Update Student Branch");
            System.out.println("5.Delete Student by Eno");
            System.out.println("6.Display Sorted Students");
            System.out.println("7.Exit");

            int ch = sc.nextInt();

            try {
                switch (ch) {
                    case 1:
                        System.out.print("Eno Name Branch Sem Percentage: ");
                        service.addStudent(new Student(
                                sc.nextInt(),
                                sc.next(),
                                sc.next(),
                                sc.nextInt(),
                                sc.nextDouble()));
                        break;

                    case 2:
                        service.displayAll();
                        break;

                    case 3:
                        System.out.print("Enter Eno: ");
                        Student s = service.search(sc.nextInt());
                        System.out.println(s != null ? s : "Student not found");
                        break;

                    case 4:
                        System.out.print("Eno NewBranch: ");
                        service.updateBranch(sc.nextInt(), sc.next());
                        break;

                    case 5:
                        System.out.print("Enter Eno: ");
                        service.delete(sc.nextInt());
                        break;

                    case 6:
                        service.sortStudents();
                        service.displayAll();
                        break;

                    case 7:
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
