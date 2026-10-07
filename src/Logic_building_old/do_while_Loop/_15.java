package Logic_building_old.do_while_Loop;

import java.util.Scanner;

public class _15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of even and odd digits");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = Math.abs(num);
        int evenSum = 0;
        int oddSum = 0;

        do {
            int digit = temp % 10;

            if (digit % 2 == 0) {
                evenSum = evenSum + digit;
            } else {
                oddSum = oddSum + digit;
            }

            temp = temp / 10;
        } while (temp != 0);

        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
        sc.close();
    }
}