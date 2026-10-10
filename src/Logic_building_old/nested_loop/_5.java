package Logic_building_old.nested_loop;

import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        long a = 0, b = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                long next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }
        sc.close();
    }
}
