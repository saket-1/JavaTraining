package JavaCodingQuestion;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int primes[] = {2,3,5,7,11,13,17,19,23};
        String alphabets[]= {"a","b","c","d","e","f"};
        for(int t:primes){
            System.out.println(t);
        }
        for(String a:alphabets){
            System.out.println(a);
        }
    }
}
