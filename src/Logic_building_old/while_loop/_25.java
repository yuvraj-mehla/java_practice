package Logic_building_old.while_loop;

import java.util.Scanner;

public class _25 {
    public static void main(String[] args) {
        System.out.println("sum of all factors");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int i = 1;

        int sum = 0;
        while(i <= num){
            if(num % i == 0){
                System.out.print(i+" " );
                sum += i;
            }
            System.out.println();
            i ++;
        }
        System.out.println("Sum of factors: "+ sum);
    }
}
