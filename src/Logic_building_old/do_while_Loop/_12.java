package Logic_building_old.do_while_Loop;

import java.util.Scanner;

public class _12 {

    static int hcf(int a, int b) {
        int i = 1;
        int hcf = 1;
        while (i <= a && i <= b) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
            i++;
        }
        return hcf;
    }

    static boolean isArmstrong(int num) {
        int temp = num;
        int digits = 0;

        do {
            digits++;
            temp = temp / 10;
        } while (temp != 0);

        temp = num;
        int sum = 0;

        do {
            int digit = temp % 10;
            int power = 1;
            int j = 0;
            while (j < digits) {
                power = power * digit;
                j++;
            }
            sum = sum + power;
            temp = temp / 10;
        } while (temp != 0);

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. HCF of two numbers");
            System.out.println("2. LCM of two numbers");
            System.out.println("3. Armstrong number check");
            System.out.println("4. Factorial");
            System.out.println("5. Fibonacci series");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    if (a <= 0 || b <= 0) {
                        System.out.println("Enter positive numbers only");
                    } else {
                        System.out.println("HCF is: " + hcf(a, b));
                    }
                    break;
                }
                case 2: {
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    if (a <= 0 || b <= 0) {
                        System.out.println("Enter positive numbers only");
                    } else {
                        long lcm = ((long) a / hcf(a, b)) * b;
                        System.out.println("LCM is: " + lcm);
                    }
                    break;
                }
                case 3: {
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    if (num < 0) {
                        System.out.println("Enter a non-negative number");
                    } else if (isArmstrong(num)) {
                        System.out.println(num + " is an Armstrong number");
                    } else {
                        System.out.println(num + " is not an Armstrong number");
                    }
                    break;
                }
                case 4: {
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    if (num < 0) {
                        System.out.println("Factorial is not defined for negative numbers");
                    } else if (num > 20) {
                        System.out.println("Number too large (max 20 for long)");
                    } else {
                        long fact = 1;
                        int i = 1;
                        while (i <= num) {
                            fact = fact * i;
                            i++;
                        }
                        System.out.println("Factorial is: " + fact);
                    }
                    break;
                }
                case 5: {
                    System.out.print("Enter number of terms: ");
                    int n = sc.nextInt();
                    if (n <= 0) {
                        System.out.println("Enter a positive number");
                    } else {
                        long a = 0;
                        long b = 1;
                        int i = 1;
                        do {
                            System.out.print(a + " ");
                            long next = a + b;
                            a = b;
                            b = next;
                            i++;
                        } while (i <= n);
                        System.out.println();
                    }
                    break;
                }
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, please enter 1 to 6");
            }
        } while (choice != 6);

        sc.close();
    }
}