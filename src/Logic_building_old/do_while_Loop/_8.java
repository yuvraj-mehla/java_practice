package Logic_building_old.do_while_Loop;

import java.util.Scanner;

public class _8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Armstrong number check");
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int digits = 0;


        do {
            digits++;
            temp = temp / 10;
        } while (temp != 0);

        temp = num;
        int sum = 0;

        do {
            int digit = temp % 10;
            int power = 1;
            int j = 0;
            do {
                power = power * digit;
                j++;
            } while (j < digits);

            sum = sum + power;
            temp = temp / 10;
        } while (temp != 0);

        if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
