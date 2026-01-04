package Assignments.Assignment1;
import java.util.Scanner;

class ArrayOpsQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int pos = sc.nextInt();
                int val = sc.nextInt();
                for (int i = n - 1; i >= pos; i--)
                    arr[i] = arr[i - 1];
                arr[pos - 1] = val;
                break;

            case 2:
                int del = sc.nextInt();
                for (int i = del - 1; i < n - 1; i++)
                    arr[i] = arr[i + 1];
                break;

            case 3:
                int key = sc.nextInt();
                for (int i = 0; i < n; i++)
                    if (arr[i] == key)
                        System.out.println(i);
                break;

            case 4:
                int k = sc.nextInt();
                int l = 0, r = n - 1;
                while (l <= r) {
                    int m = (l + r) / 2;
                    if (arr[m] == k) break;
                    if (arr[m] < k) l = m + 1;
                    else r = m - 1;
                }
                break;

            case 5:
                int max = arr[0];
                for (int i = 1; i < n; i++)
                    if (arr[i] > max) max = arr[i];
                System.out.println(max);
                break;

            case 6:
                int even = 0, odd = 0;
                for (int i : arr)
                    if (i % 2 == 0) even++;
                    else odd++;
                System.out.println(even + " " + odd);
                break;

            case 7:
                for (int i = 0; i < n; i++)
                    for (int j = i + 1; j < n; j++)
                        if (arr[i] > arr[j]) {
                            int t = arr[i];
                            arr[i] = arr[j];
                            arr[j] = t;
                        }
                break;
        }
        sc.close();
    }
}
