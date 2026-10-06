package Logic_building_old.while_loop;

import java.util.Scanner;

public class _17 {
    public static void main(String[] args) {
        System.out.println(" all prime numbers between 1 and 100");
        //Scanner sc = new Scanner(System.in);
        int n = 1;


        while( n <= 100){
            int count = 0;
            int i = 1;
            while( i <= n){
                if( n % i == 0){
                    count++;
                }
                i++;
            }
            if(count == 2){
                System.out.println(n);
            }
            n++;
        }
    }
}
