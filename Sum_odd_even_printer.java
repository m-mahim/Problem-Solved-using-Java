//Write a program that reads a set of integers, and then prints the sum of the
even and odd integers.

import java.util.Scanner;

public class Sum_odd_even_printer {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evensum = 0;
        int oddsum = 0;
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i]%2==0) {
                evensum += arr[i];
            }else {
                oddsum += arr[i];
            }

        }
        System.out.println("Sum of Odd Numbers : " + oddsum);
        System.out.println("Sum of Even Numbers : " + evensum);
    }
}