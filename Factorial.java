// Write a program to find the factorial of any number entered by the user

import java.util.*;
class Factorial {
    public static void main(String[] args) {
        int n;
        int sum = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Give Number to factorize ");
        n = sc.nextInt();
        for ( int i = n ;i>=1;i--){
            sum = sum * i; 
        }
        System.out.println("Factorial of "+ n + " is " + sum);
    }
}