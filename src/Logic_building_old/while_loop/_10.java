package Logic_building_old.while_loop;

import java.util.Scanner;

public class _10 {
    public static void main(String[] args) {
        System.out.println("Product of digit");
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        n = sc.nextInt();

        int product = 1;
        while (n != 0) {
            int digit = n % 10;
            product *= digit;
            n = n/10;
        }
        System.out.println("Product of digit: "+ product);
    }
}
