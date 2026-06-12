import java.util.*;
public class LinearSearch_character_user_input {

    public static int linear_Search(String arr[], String key){

        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(key)){ //*new* = u cant use = sign in String so use  .equals() built in function
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[] = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Menu you want ");
        for(int i=0; i<menu.length; i++){
            menu[i] = sc.next();
        }
        System.out.println("Enter the Specific item you want ");
        String key = sc.next();

        int index = linear_Search(menu, key);

        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found "+ key +" at index " + index);
        }
    }
}