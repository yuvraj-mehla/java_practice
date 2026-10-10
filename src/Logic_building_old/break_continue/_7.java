package Logic_building_old.break_continue;

import java.util.Scanner;

public class _7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (stops when sum > 100):");
        for (;;) {
            int num = sc.nextInt();
            sum += num;
            System.out.println("Current sum = " + sum);

            if (sum > 100) {
                break;              // limit crossed: exit the loop
            }
        }

        System.out.println("Final sum = " + sum + " (greater than 100)");
        sc.close();
    }
}
