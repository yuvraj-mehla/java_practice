package Logic_building_old.do_while_Loop;

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int sum =0;

        do {
            System.out.println("Enter number");
            n = sc.nextInt();

            if(n == 0){
                sum = sum + n;
                break;
            }
            sum = sum+n;
        }while (n != 0);

        System.out.println("sum = "+ sum);

    }
}
