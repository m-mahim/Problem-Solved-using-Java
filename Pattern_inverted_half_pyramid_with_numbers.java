import java.util.Scanner;
public class Pattern_inverted_half_pyramid_with_numbers {
    public static void main(String args[]) {
        System.out.println("Please Enter number of rows and columns: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j < n-i){
                    System.out.print(j+1 + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

    }

}