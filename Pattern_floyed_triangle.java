import java.util.Scanner;
public class Pattern_floyed_triangle {
    public static void main(String args[]) {
        System.out.println("Please Enter number of rows and columns: ");
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;
        int n = sc.nextInt();
        //int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j <= i){
                    sum ++;
                    System.out.print(sum + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

    }

}