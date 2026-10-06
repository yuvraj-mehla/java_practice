package Logic_building_old.while_loop;

import java.util.Scanner;

public class _9 {
    public static void main(String[] args) {
        System.out.println("Factorial of a number");
        int n;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int fact = 1;

        while(n != 0){
            fact *= n;
            n--;
        }
        System.out.println("Factorial of number: "+fact);
    }
}
