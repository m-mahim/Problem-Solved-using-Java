import java.util.Scanner;
public class Pattern_hollow_square {
    public static void main(String args[]) {
        System.out.println("Please Enter number of : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i == 1||i == n){
                    System.out.print("* ");
                }else{
                    if( j==1|| j == n){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }

                }

            }
            System.out.println();

        }

    }

}