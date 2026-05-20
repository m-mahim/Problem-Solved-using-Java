import java.util.Scanner;

public class Num_swap {
    public static int swap(int a, int b) {
        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swaping a and b: ");
        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);
        return 1;
    }
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        swap(n, m);
     }
}