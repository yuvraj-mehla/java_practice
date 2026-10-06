package Logic_building_old.while_loop;

import java.util.Scanner;

public class _20 {
    public static void main(String[] args) {
        System.out.println("Sum of fibonacci series");
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int i =1;
        System.out.print("Enter number of terms: ");
        int num = sc.nextInt();
        int sum = 0;

        while(i <= num){
            System.out.print(a+ " ");
            sum += a;
            int next = a+b;
            a = b;
            b = next;

            i++;
        }
        System.out.println();
        System.out.println("sum of fibonacci series: "+ sum);
    }
}
