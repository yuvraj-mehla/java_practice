package Logic_building_old.while_loop;

import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {
        System.out.println("Multiplication table");
        int n ;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i = 1;
        while(i <= 10){
            System.out.println(n + " x " + i + " = "+ (n*i));
            i++;
        }
    }
}
