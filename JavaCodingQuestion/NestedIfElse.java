package JavaCodingQuestion;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        int marksobtained,passingmark=40;
        char grade;
        System.out.println("Enter Marks obtained");
        Scanner sc = new Scanner(System.in);
        marksobtained = sc.nextInt();
        if(marksobtained>=passingmark){
            if(marksobtained > 90){
                grade = 'A';
            }  else if( marksobtained > 75){
                grade = 'B';
            }   else if( marksobtained>60){
                grade = 'C';
            }   else{
                grade = 'D';
            }
            System.out.println("You passed the exam with grade "+grade);
        } else{
                grade = 'E';
                System.out.println("You Failed the exam with grade "+ grade);
        }
    }
}
