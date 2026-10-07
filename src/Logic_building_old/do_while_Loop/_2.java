package Logic_building_old.do_while_Loop;

import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int i =1;

        do {
            System.out.println(n+" x "+ i + " = " +n*i);
            i++;
        }
        while (i <= 10);
    }
}
