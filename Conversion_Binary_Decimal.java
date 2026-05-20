import java.util.Scanner;

public class Conversion_Binary_Decimal {
    public static void binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;

        while(binNum>0) {
            int lastDigit = binNum % 10;
                    decNum = decNum + (lastDigit * (int)Math.pow(2,pow));

                    pow++;
                    binNum /= 10;

        }
        System.out.println(decNum);
    }
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
        System.out.println("Give a binary number n : ");
        int n = input.nextInt();
        binToDec(n);

        System.out.println("Give a decimal number m : ");
        int m = input.nextInt();
        decToBin(m);


    }

}