import java.util.Scanner;

public class Prime_in_Range {
    public static int isPrime(int n) {
        int isPrime = 1;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = 0;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number to check prime's within that number : ");
        int n = input.nextInt();
        for(int i = 2; i<=n; i++){
            if(isPrime(i) == 1)
                System.out.print(i + " ");
        }

    }

}