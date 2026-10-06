package Logic_building_old.while_loop;

import java.util.Scanner;

public class _13 {
    public static void main(String[] args) {

        System.out.println("Palindrome ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int rev = 0;

        while(n != 0){
            int digit = n % 10;
            rev = rev*10 + digit;
            n = n/10;
        }
        if(original == rev){
            System.out.println("Palindrome");

        }
        else{
            System.out.println("Not  a palindrome");
        }
    }
}
