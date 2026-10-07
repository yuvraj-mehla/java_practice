package Logic_building_old.do_while_Loop;

import java.util.Scanner;

public class _13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (enter a negative number to stop)");

        int num;
        int count = 0;

        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();

            if (num > 0) {
                count++;
            }
        } while (num >= 0);

        System.out.println("Positive numbers entered: " + count);
        sc.close();
    }
}