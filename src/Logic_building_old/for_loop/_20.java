package Logic_building_old.for_loop;

import java.util.Scanner;

public class _20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("Sum of even numbers from 1 to " + n + " = " + sum);
        sc.close();
    }
}
