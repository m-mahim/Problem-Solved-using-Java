//Method overloading using parametersA
import java.util.Scanner;

public class method_overloading_using_parameters {
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
    public static float sum(float a, float b, float c) {
        float sum = a + b + c;
        return sum;
    }
    public static void main(String[] args) {

        System.out.println(sum(6.2f,5.8f,6));
        System.out.println(sum(6,5,6));
        System.out.println(sum(6,5));
        System.out.println("Give Three Inputs : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        float s = sum(a,b,c);
        System.out.println(sum(a,b,c));

    }
}