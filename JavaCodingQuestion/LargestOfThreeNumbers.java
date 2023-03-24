package JavaCodingQuestion;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Enter three integers");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if(x>y && x>z){
            System.out.println("first number is largest"+ x);
        } else if(y>x && y>z){
            System.out.println("Second number is largest "+ y);
        } else if(z>x && z>y){
            System.out.println("Third Number is largest"+z);
        } else{
            System.out.println("Entered Number are not distinct");
        }
    }
}
