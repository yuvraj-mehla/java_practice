package Logic_building_old.while_loop;

import java.util.Scanner;

public class _19 {
    public static void main(String[] args) {
        System.out.println("Fibonacci series");
        int a = 0 ;
        int b = 1 ;
        int i = 1 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of fibonacci terms : ");
        int n = sc.nextInt();

        while(i <= n){
            System.out.print(a + " ");
            int next = a+b;
            a = b;
            b = next;
            i++;
        }
    }
}
