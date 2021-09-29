package ro.sci.s06;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        int fac=1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");

        int n= scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }

        System.out.println( " Factorial of your number is " +fac);
    }

}
