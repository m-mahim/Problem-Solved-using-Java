import java.util.Scanner;

public class Factorial_function {
    public static int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        System.out.println(fact);
        return 1;
    }
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);
     }
}
