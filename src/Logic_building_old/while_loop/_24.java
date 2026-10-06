package Logic_building_old.while_loop;

import java.util.Scanner;

public class _24 {
    public static void main(String[] args) {
        System.out.println("All factors");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int i = 1;

        while(i <= num){
            if(num % i == 0){
                System.out.print(i +" ");
            }
            i ++;
        }
    }
}
