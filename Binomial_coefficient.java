import java.util.Scanner;

public class Binomial_coefficient {
    public static int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter value of r: ");
        int r = sc.nextInt();
        int binomialCoefficient = factorial(n)/(factorial(n-r)*factorial(r));
        System.out.println("Binomial coefficient of " + n + " and " + r + " is " + binomialCoefficient);
     }
}

