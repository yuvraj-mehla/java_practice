package Logic_building_old.do_while_Loop;

import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number");
        n = sc.nextInt();
        int count = 0;

        do {
            count ++;
            n = n/10;
        }while (n != 0);

        System.out.println("count ="+count);
    }
}
