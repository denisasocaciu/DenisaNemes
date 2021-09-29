package ro.sci;

import java.util.Scanner;

public class prim {
    public static void main(String [] args) {
        System.out.println("Input a number to verify if it is prime or composite");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean check = false;
        for (int i = 2; i < number; i++) {
            if (number % i==0) {
                check = true;
                break;
            }
        }
        if (!check)
            System.out.println(number + " is prime number");
        else
            System.out.println(number + " is composite number");
    }
}
