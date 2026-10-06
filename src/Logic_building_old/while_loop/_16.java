package Logic_building_old.while_loop;

import java.util.Scanner;

public class _16 {
    public static void main(String[] args) {
        System.out.println("Perfect number ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        int i = 1;
        while( i < num){
            if(num % i == 0){
                sum = sum + i;
            }
            i++;
        }
        if(original == sum ){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}
