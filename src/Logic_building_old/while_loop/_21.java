package Logic_building_old.while_loop;

import java.util.Scanner;

public class _21 {
    public static void main(String[] args) {
        System.out.println("Square of each n number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth number");
        int num = sc.nextInt();
        int i =1;

        while(i <= num ){
            System.out.println("Square of "+i+" = "+ i*i);
            i++;

        }
    }
}
