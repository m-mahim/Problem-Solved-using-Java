import java.util.Scanner;
public class Pattern_inverted_rotated_half_pyramid {
    public static void main(String args[]) {
        System.out.println("Please Enter number of rows and columns: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j > n-i){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

    }

}