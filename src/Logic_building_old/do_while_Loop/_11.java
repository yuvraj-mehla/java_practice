package Logic_building_old.do_while_Loop;

import java.util.Scanner;

public class _11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HCF of two numbers");
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Enter positive numbers only");
        } else {
            int i = 1;
            int hcf = 1;

            do {
                if (num1 % i == 0 && num2 % i == 0) {
                    hcf = i;
                }
                i++;
            } while (i <= num1 && i <= num2);

            System.out.println("HCF is: " + hcf);
        }
    }
}
