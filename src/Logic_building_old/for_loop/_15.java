package Logic_building_old.for_loop;

import java.util.Scanner;

public class _15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = Math.max(a, b);
        int lcm = 0;

        for (int i = max; i <= a * b; i += max) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }

        System.out.println("LCM of " + a + " and " + b + " = " + lcm);
        sc.close();
    }
}
