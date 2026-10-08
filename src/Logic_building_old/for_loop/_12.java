package Logic_building_old.for_loop;

import java.util.Scanner;

public class _12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter n :");
        int n = sc.nextInt();

        System.out.println("Fators are: ");
        for (int i = 1 ; i <= n ; i++){
           if(n % i == 0){
               System.out.println(i);
           }
        }
    }
}
