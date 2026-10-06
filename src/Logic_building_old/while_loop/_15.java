package Logic_building_old.while_loop;

import java.util.Scanner;

public class _15 {
    public static void main(String[] args) {
        System.out.println("Armstrong number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int digits = 0;
        int sum = 0;

        int temp = n;

        while(temp > 0){
            digits++;
            temp = temp/10;
        }
        temp = n;
        while(temp > 0){
            int digit = temp%10;
            int power = 1;
            int i =1;

            while(i <= digits){
                power = power*digit;
                i++;
            }
            sum = sum+power;
            temp = temp /10;
        }
        if(sum == original ){
            System.out.println("Armstorng number");

        }
        else{
            System.out.println("Not an armstrong number");
        }

    }
}
