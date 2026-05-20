import java.util.Scanner;

public class DecimalToBainary {

    public static void decToBin(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while(myNum>0) {
            int remaider = myNum % 2;
            binNum = binNum + (remaider * (int)Math.pow(10,pow));
            pow++;
            myNum /= 2;

        }
        System.out.println(binNum);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a decimal number m : ");
        int m = input.nextInt();
        decToBin(m);


    }

}