package Assignments.Assignment1;

import java.util.Scanner;

class MatrixOpsQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();

        int choice = sc.nextInt();

        if (choice == 1)
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    System.out.print(a[i][j] + b[i][j] + " ");

        if (choice == 2)
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    System.out.print(a[i][j] - b[i][j] + " ");

        if (choice == 3)
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    System.out.print(a[i][j] * b[i][j] + " ");

        if (choice == 4)
            for (int i = 0; i < c; i++)
                for (int j = 0; j < r; j++)
                    System.out.print(a[j][i] + " ");

        if (choice == 5)
            System.out.println(r == c);

        if (choice == 6) {
            boolean d = true;
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    if (i != j && a[i][j] != 0) d = false;
            System.out.println(d);
        }

        if (choice == 7) {
            boolean id = true;
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    if ((i == j && a[i][j] != 1) || (i != j && a[i][j] != 0))
                        id = false;
            System.out.println(id);
        }

        sc.close();
    }
}

