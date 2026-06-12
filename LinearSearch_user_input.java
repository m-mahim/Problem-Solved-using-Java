import java.util.*;
public class LinearSearch_user_input {

    public static int linear_Search(int arr[], int key){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){ //*new* = u cant use = sign in String so use  .equals() built in function
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers you want ");
        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the Specific item you want ");
        int key = sc.nextInt();

        int index = linear_Search(num,key);

        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found "+ key +" at index " + index);
        }
    }
}