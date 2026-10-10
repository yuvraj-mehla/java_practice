package Logic_building_old.break_continue;

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 5 numbers:");
        for (int i = 1; i <= 5; i++) {
            int num = sc.nextInt();

            if (num == 0) {
                continue;           // skip zeros, go to the next input
            }
            sum += num;
        }

        System.out.println("Sum of the non-zero numbers = " + sum);
        sc.close();
    }
}
