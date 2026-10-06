package Logic_building_old.while_loop;

import java.util.Scanner;

public class _18 {
    public static void main(String[] args) {
        System.out.println("Prime number");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int count = 0;
        int i = 1;
        while(i <= n){
            if( n % i == 0){
                count ++;

            }
            i++;
        }

        if(count == 2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }

    }
}
