package JavaCodingQuestion;

import java.util.Scanner;

public class SwapNumbersWithout {
    public static void main(String[] args) {
        int x,y;
        System.out.println("Enter the Numbers");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("x = "+ x +" y = "+ y);
        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("x = "+ x +" y = "+ y);
    }
}
