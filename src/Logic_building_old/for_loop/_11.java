package Logic_building_old.for_loop;

import java.util.Scanner;

public class _11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter n :");
        int n = sc.nextInt();

        int a = 0;
        int b =1;
        int sum = 0;

        for (int i = 0 ; i < n ; i++){
            System.out.print(a+" ");
            sum += a;
            int next = a+b;
            a = b;
            b = next;
        }
        System.out.println();
        System.out.println("Sum : "+ sum);
    }
}
