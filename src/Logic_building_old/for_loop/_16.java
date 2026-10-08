package Logic_building_old.for_loop;

import java.util.Scanner;

public class _16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Square of " + i + " = " + (i * i));
        }
        sc.close();
    }
}
