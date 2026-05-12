// Write a program to print the multiplication table of a number N, entered by the user.

import java.util.*;
class MultiplicationTable {
    public static void main(String[] args) {
        int n;
        int mul = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Give Number for Multiplication Table ");
        n = sc.nextInt();
        for ( int i = 1 ;i<=10;i++){
        mul =  n * i; 
        System.out.println(n + "*" + i + " = " + mul);
            
        }
        
    }
}