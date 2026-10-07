package Logic_building_old.while_loop;

import java.util.Scanner;

public class _28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("smallest digit in number");
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int min = Integer.MAX_VALUE;

        while( num != 0){
            int digit = num % 10;
            if(min > digit){
                min = digit;
            }
            num = num /10;
        }
        System.out.println("Smallest digit: "+min);
    }
}
