package Logic_building_old.while_loop;

import java.util.Scanner;

public class _23 {
    public static void main(String[] args) {
        System.out.println("all numbers between a and b that are divisible by 7");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter staring number: ");
        int a = sc.nextInt();
        System.out.println("Enter ending number: ");
        int b =sc.nextInt();

        int i=1;

        while(a <= b){
            if(a % 7 == 0){
                System.out.println(a);
            }
            a++;
        }
    }
}
