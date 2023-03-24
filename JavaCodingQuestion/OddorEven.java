package JavaCodingQuestion;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter a integer");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if(x%2 == 0){
            System.out.println("It is even");
        } else{
            System.out.println("It is odd");
        }
    }
}
