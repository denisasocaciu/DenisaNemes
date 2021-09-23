package ro.sci;
import java.util.Scanner;

public class greetings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your name");
        String name = scanner.nextLine();

        if (!name.equals("")) {
            System.out.println("Hello " + name);
        } else {
            System.out.println("Hello stranger");
        }
    }
}
