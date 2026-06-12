import java.util.*;
public class LinearSearch_character_argumentbased {

    public static int linear_Search(String arr[], String key){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == key ){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[] = {"pizza", "berger", "momo"};
        String key = "momo";

        int index = linear_Search(menu, key);

        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found at index " + index);
        }
    }
}