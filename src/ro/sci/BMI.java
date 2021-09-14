package ro.sci;

import java.util.Scanner;

public class BMI {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input weight (kg) ");
        double weight = scanner.nextDouble();
        System.out.print("Input height (cm): ");
        double height = scanner.nextDouble() / 100;
        double BMI = weight / (height * height);
        System.out.print("The Body Mass Index (BMI) is " + BMI + " kg/m2");
        System.out.println();
        if (BMI < 18.49)
            System.out.println("Underweight");
        else if (BMI > 18.5 && BMI < 24.99)
            System.out.println("Normal");
        else if (BMI > 25 && BMI < 29.99)
            System.out.println("Overweight");
        else if (BMI > 30 && BMI < 34.99)
            System.out.println("Obese (I)");
        else if (BMI > 35 && BMI < 39.99)
            System.out.println("Obese (II)");
        else
            System.out.println("morbid obesity");
    }
}

