import java.util.Scanner;

public class IsPrime_Optimised_Function_Input {
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
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number to check prime : ");
        int n = input.nextInt();

    }
}