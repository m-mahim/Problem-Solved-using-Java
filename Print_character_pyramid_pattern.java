import java.util.Scanner;

public class Print_character_pyramid_pattern {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';                             //Inorder to print in character 

        for(int line = 1; line <= n; line++){
            for(int num = 1; num <= line; num++){
                System.out.print(ch);              //printing the character
                ch++;                              //updating to next character

            }
            System.out.println();
        }
     }
}
