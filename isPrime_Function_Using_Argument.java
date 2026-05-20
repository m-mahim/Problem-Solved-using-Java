import java.util.Scanner;

public class isPrime_Function_Using_Argument {
    public static void isPrime(int n) {
        boolean isPrime = true;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
    public static void main(String[] args) {
        isPrime(7);

    }
}