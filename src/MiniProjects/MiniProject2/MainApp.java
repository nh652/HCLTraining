package MiniProjects.MiniProject2;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        if (!Login.authenticate()) {
            System.out.println("Invalid login");
            return;
        }

        Scanner sc = new Scanner(System.in);
        EmployeeService es = new EmployeeService();

        while (true) {
            System.out.println("\n1.Add 2.Display 3.Search 4.Update Salary 5.Delete 6.Exit");
            int ch = sc.nextInt();

            try {
                switch (ch) {
                    case 1:
                        System.out.print("ID Name Dept Salary: ");
                        es.add(new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble()));
                        break;
                    case 2:
                        es.display();
                        break;
                    case 3:
                        System.out.print("ID: ");
                        System.out.println(es.search(sc.nextInt()));
                        break;
                    case 4:
                        System.out.print("ID Salary: ");
                        es.updateSalary(sc.nextInt(), sc.nextDouble());
                        break;
                    case 5:
                        System.out.print("ID: ");
                        es.delete(sc.nextInt());
                        break;
                    case 6:
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
