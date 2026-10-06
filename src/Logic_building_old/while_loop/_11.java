package Logic_building_old.while_loop;

import java.util.Scanner;

public class _11 {
    public static void main(String[] args) {
        System.out.println("Count of digit");
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        n = sc.nextInt();

        int count = 0;
        while (n != 0) {
            int digit = n % 10;
            count++;
            n = n/10;
        }
        System.out.println("count of digit: "+ count);
    }
}
