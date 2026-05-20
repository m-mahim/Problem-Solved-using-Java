import java.util.Scanner;

public class Product_function {
    public static int product(int a, int b) {
        System.out.println( "Product of "+ a +" and " + b + " is : "   + a*b);
        return 1;
    }
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        product(n, m);
     }
}

