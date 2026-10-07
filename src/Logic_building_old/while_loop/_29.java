package Logic_building_old.while_loop;

import java.util.Scanner;

public class _29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Largest digit in number");
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int max = Integer.MIN_VALUE;

        while( num != 0){
            int digit = num % 10;
            if(max < digit){
                max = digit;
            }
            num = num /10;
        }
        System.out.println("Largest digit: "+max);
    }
}
