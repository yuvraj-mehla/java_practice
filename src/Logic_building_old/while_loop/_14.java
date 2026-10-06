package Logic_building_old.while_loop;

import java.util.Scanner;

public class _14 {
    public static void main(String[] args) {
        System.out.println("Sum of digits");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        while(n != 0){
            int digit = n % 10;
            sum = sum + digit;
            n = n/10;
        }
        System.out.println("Sum of digit "+ sum);
    }
}
