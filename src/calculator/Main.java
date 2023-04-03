package calculator;

import java.util.Scanner;

public class Main extends Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Calculator obj = new Calculator();

        char program = 'Y';

        while (program == 'Y' || program == 'y') {
            System.out.println("Enter number 1 : ");
            int a = sc.nextInt();

            System.out.println("Enter number 2 : ");
            int b = sc.nextInt();

            System.out.println("Enter any symbol +,-,*,/: ");
            char symbol = sc.next().charAt(0);
            obj.calculateResult(a,b,symbol);

            System.out.println("Would you like to do more calculation? Please enter 'Y' or 'N' :  ");

            program = sc.next().charAt(0);

        }
        System.out.println("Program Terminated ");
        // while loop ends here
        sc.close();
    }
 }
