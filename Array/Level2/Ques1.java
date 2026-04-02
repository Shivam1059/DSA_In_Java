
import java.util.Scanner;
class FindMax{
     public int findMax(int[]arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
     }
}

public class    Ques1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array  : ");
        int size = sc.nextInt();
        if(size <= 0){
            System.out.println("Input invalid!");
        }

        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element "+i);
            arr[i] = sc.nextInt();
        }
        FindMax  m = new  FindMax();

        System.out.println(" Max Element : "+m.findMax(arr));

    }
}