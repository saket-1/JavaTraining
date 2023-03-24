package JavaCodingQuestion;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while((n = sc.nextInt())!=0){
            System.out.println("Entered "+ n);
            System.out.println("Input new integer");
        }
        System.out.println("out of loop");
    }
}
