package Logic_building_old.for_loop;

import java.util.Scanner;

public class _17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Cube of " + i + " = " + (i * i * i));
        }
        sc.close();
    }
}
