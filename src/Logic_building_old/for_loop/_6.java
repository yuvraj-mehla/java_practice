package Logic_building_old.for_loop;

import java.util.Scanner;

public class _6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int fact = 1;

        for (int i = 1 ; i <= 5; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
