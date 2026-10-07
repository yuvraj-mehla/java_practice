package Logic_building_old.do_while_Loop;

import java.util.Scanner;

public class _10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci series");
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive number");
        } else {
            long a = 0;
            long b = 1;
            int i = 1;

            do {
                System.out.print(a + " ");
                long next = a + b;
                a = b;
                b = next;
                i++;
            } while (i <= n);
        }
    }
}
