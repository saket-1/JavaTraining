package JavaCodingQuestion;

import java.util.Scanner;

public class BreakContinueWhileLoop {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter an integer");
            n = sc.nextInt();

            if(n!=0){
                System.out.println("entered "+n);
                continue;
            } else{
                break;
            }
        }
    }
}
