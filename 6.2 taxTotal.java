import java.util.*;

public class Main {
    public static void main(String... args){
        float a, b, c ;
        Scanner input = new Scanner(System.in);

        a = input.nextFloat();    //For Int only
        b = input.nextFloat();    //.next() for String
        c = input.nextFloat();

        float total = a + b + c;
        System.out.println("Total cost = " + total);

        float newtotal = total + (total * .18f);
        System.out.println("Total cost = " + newtotal);

    }
}