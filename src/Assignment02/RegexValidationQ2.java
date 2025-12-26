package Assignment02;
import java.util.Scanner;


class RegexValidationQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 5) break;

            String input = sc.nextLine();
            boolean valid = false;

            if (ch == 1)
                valid = input.matches("[6-9][0-9]{9}");

            if (ch == 2)
                valid = input.matches("[a-zA-Z0-9._]+@[a-z]+\\.[a-z]+");

            if (ch == 3)
                valid = input.matches("[a-zA-Z0-9_]{5,}");

            if (ch == 4)
                valid = input.matches("(?=.*[A-Z])(?=.*[0-9]).{6,}");

            System.out.println(valid ? "Welcome" : "Invalid Input");
        }
        sc.close();
    }
}
