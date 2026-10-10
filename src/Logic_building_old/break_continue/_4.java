package Logic_building_old.break_continue;

import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        System.out.print("How many numbers will you enter? ");
        int n = sc.nextInt();

        boolean found = false;
        System.out.println("Enter the numbers:");
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();

            if (num == target) {
                found = true;
                System.out.println(target + " found at position " + i);
                break;
            }
        }

        if (!found) {
            System.out.println(target + " was not found in the list.");
        }
        sc.close();
    }
}
