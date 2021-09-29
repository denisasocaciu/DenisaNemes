package ro.sci.s06;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the price without VAT");
        double priceInit = scanner.nextDouble();

        System.out.println("Enter the VAT (%)");
        double vat = scanner.nextDouble();

        CalculatePrice(priceInit, vat);
    }
    public static void CalculatePrice(double priceInit, double vat) {
        double a = priceInit + ((vat * priceInit) / 100);
        System.out.println("THe price with VAT is " + a);
    }
}
