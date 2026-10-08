package Logic_building_old.for_loop;

import java.util.Scanner;

public class _18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Numbers divisible by 7 between " + a + " and " + b + ":");
        for (int i = a; i <= b; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
