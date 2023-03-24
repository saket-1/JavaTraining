package JavaCodingQuestion;

import java.util.Scanner;

public class FarhenheitToCelsius {
    public static void main(String[] args) {
        float t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        t = sc.nextFloat();
        t=(((t-32)*5)/9);
        System.out.println("The Temperature in celsius is "+t);
    }
}
