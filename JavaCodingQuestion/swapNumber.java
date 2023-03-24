package JavaCodingQuestion;

import java.util.Scanner;

public class swapNumber {
    public static void main(String[] args) {
        int x,y,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Variables");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("x = "+ x +" y = "+ y);
        temp = x;
        x = y;
        y=temp;

        System.out.println("x = "+ x +" y = "+ y);

    }
}
