package JavaCodingQuestion;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Factorial {
    public static void main(String[] args) {
        int n,fact =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        if(n<0){
            System.out.println("Number should be non negative");
        } else{
            for(int i=1;i<=n;i++){
                fact = fact *i;
            }

            System.out.println("Factorial is "+ fact);
        }
    }
}
