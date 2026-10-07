package Logic_building_old.do_while_Loop;

import java.util.Scanner;

public class _6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number");
        n = sc.nextInt();
        int rev = 0;

        do {
            int digit = n % 10;
            rev = rev*10 +digit;
            n = n/10;
        }while (n != 0);

        System.out.println("reverse" + rev);
    }
}
