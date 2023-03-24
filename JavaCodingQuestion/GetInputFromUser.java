package JavaCodingQuestion;

import java.util.Scanner;

public class GetInputFromUser {
    public static void main(String[] args) {
        int a;
        float b;
        String c;
        Scanner sc = new Scanner(System.in);

      

        System.out.println("Enter a Integer");
        a = sc.nextInt();
        System.out.println("The Integer is " + a);

        System.out.println("Enter a Float");
        b = sc.nextFloat();
        System.out.println("The Float is " + b);

        System.out.println("Enter a String");
        c = sc.nextLine();
        System.out.println("The String is " + c);

        
    }

}
