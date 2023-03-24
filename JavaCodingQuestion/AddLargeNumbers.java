package JavaCodingQuestion;

import java.math.BigInteger;
import java.util.Scanner;

public class AddLargeNumbers {
    public static void main(String[] args) {
        String x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Large Numbers");
        x = sc.nextLine();
        y = sc.nextLine();

        BigInteger first = new BigInteger(x);
        BigInteger second = new BigInteger(y);
        BigInteger sum;
        sum = first.add(second);

        System.out.println("Addition Result "+ sum);


    }
}
