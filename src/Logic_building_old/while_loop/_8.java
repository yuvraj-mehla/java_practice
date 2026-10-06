package Logic_building_old.while_loop;

import java.util.Scanner;

public class _8 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of first n odd numbers");
        System.out.print("Enter n number: ");
        n = sc.nextInt();

        int sum = 0;

        while(n != 0){
            if(n % 2 != 0){
                sum += n;
            }
            n--;
        }

        System.out.println("Sum of first n odd number: "+sum
        );
    }
}
