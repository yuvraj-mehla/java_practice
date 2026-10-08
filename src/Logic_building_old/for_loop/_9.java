package Logic_building_old.for_loop;

import java.util.Scanner;
import java.util.SortedMap;

public class _9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int count = 0;

        for (int i = 1 ; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println("Prime number");
        }
    }
}
