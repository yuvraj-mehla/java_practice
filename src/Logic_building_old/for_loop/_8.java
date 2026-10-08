package Logic_building_old.for_loop;

import java.util.Scanner;

public class _8 {
    public static void main(String[] args) {
        System.out.println("Print all prime numbers from 1 to n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}