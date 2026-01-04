package MiniProjects.MiniProject3;

import java.util.Scanner;

class Login {
    public static boolean authenticate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String u = sc.next();
        System.out.print("Password: ");
        String p = sc.next();

        return u.equals("admin") && p.equals("admin");
    }
}
