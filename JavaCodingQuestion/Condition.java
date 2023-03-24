package JavaCodingQuestion;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        boolean flying;
        Scanner sc = new Scanner(System.in);
        flying = sc.nextBoolean();
        if(flying){
            System.out.println("It is a bird");
        } else{
            System.out.println("It's not a bird");
        }
    }
}
