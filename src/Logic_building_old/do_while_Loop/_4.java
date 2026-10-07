package Logic_building_old.do_while_Loop;

import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int max = Integer.MIN_VALUE;

        do {
            System.out.println("Enter number");
            n = sc.nextInt();
            if(max < n){
                max = n;
            }
        }while (n != 0);

        System.out.println("max = "+ max);
    }
}
