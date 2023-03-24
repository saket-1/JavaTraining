package JavaCodingQuestion;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        if(s1.compareTo(s2)>0){
              System.out.println("First string is greater than second");
        } else if(s1.compareTo(s2)<0){
            System.out.println("Second String is greater than first");
        } else{
            System.out.println("Both Strings are equal");
        }
    }
}
