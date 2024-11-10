package basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var item = "Shirt";
        var size = "XL";
        var price = 99.99;
        var color = "Purple";

        var template = "Clothing item: %s, size %s, color %s, $%.2f";
        var itemString = String.format(template, item, size, color, price);
        System.out.println(itemString);

        // find length of string
        System.out.println("length of string: " + color.length());

        // get input from user
        var scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        var input = scanner.nextLine();
        System.out.println(input);

        // properly get numbers
        System.out.print("Enter a number: ");
        var number1 = scanner.nextInt();
        var number2 = scanner.nextDouble();
    }

    // Receive a String, return a rounded double number
    static double calculate(String value1, String value2) {
        // Your code goes here.
        var scanner = new Scanner(System.in);
        value1 = scanner.nextLine();
        value2 = scanner.nextLine();

        var result = Double.parseDouble(value1) + Double.parseDouble(value2);
        System.out.println(result);
        scanner.close();
        return 0;
    }
}
