package Logic_building_old.break_continue;

import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers (a negative number stops the program):");
        for (;;) {
            int num = sc.nextInt();

            if (num < 0) {
                break;
            }
            System.out.println("You entered: " + num);
        }

        System.out.println("Negative number entered. Loop stopped.");
        sc.close();
    }
}
