package Logic_building_old.while_loop;

import java.util.Scanner;

public class _27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("LCM of two numbers");
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        int i = 1;
        int hcf = 1;

        while (i <= num1 && i <= num2) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;   // keep the latest (largest) common divisor
            }
            i++;
        }
        int lcm = (num1 * num2)/hcf;
        System.out.println("LCM is: " + lcm);
    }
}
