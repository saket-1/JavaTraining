package JavaCodingQuestion;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialLargeNumber {
    public static void main(String[] args) {
        int n;
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }

        System.out.println("Factorial is"+fact);
    }
}
