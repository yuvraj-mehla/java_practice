package Logic_building_old.while_loop;

import java.util.Scanner;

public class _12 {
    public static void main(String[] args) {

        System.out.println("Revere of a number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int rev = 0;

        while(n != 0){
            int digit = n % 10;
            rev = rev*10 + digit;
            n = n/10;
        }
        System.out.println("Reverse of number "+ rev);
    }
}
