import java.util.*;

public class simpleAvg {
    public static void main(String... args){
        int a, b, c ;
        Scanner input = new Scanner(System.in);

        a = input.nextInt();    //For Int only
        b = input.nextInt();    //.next() for String
        c = input.nextInt();

        int avg = (a+b+c)/3;
        System.out.println("Avarage of these the numbers = " + avg);
        
    }
}