package Logic_building_old.do_while_Loop;

import java.util.Scanner;

public class _9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Factorial of a number");
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            long fact = 1;
            int i = 1;

            do {
                fact = fact * i;
                i++;
            } while (i <= num);

            System.out.println("Factorial is: " + fact);
        }
    }
}
