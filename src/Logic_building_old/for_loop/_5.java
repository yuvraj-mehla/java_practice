package Logic_building_old.for_loop;

import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =sc.nextInt();
        for(int i = 1; i<= 10; i++){
            System.out.println(n + " x "+ i +" = " + n*i);
        }
    }
}
