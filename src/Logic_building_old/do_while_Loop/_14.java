package Logic_building_old.do_while_Loop;

import java.util.Scanner;

public class _14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of digits");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = Math.abs(num);
        int sum = 0;

        do {
            sum = sum + temp % 10;
            temp = temp / 10;
        } while (temp != 0);

        System.out.println("Sum of digits of " + num + " is: " + sum);
        sc.close();
    }
}