import java.util.Scanner;
class ReverseArray{
    public int[] reverseArray(int[]arr){
        int start = 0, end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
public class Ques2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size 0f array : ");
        int size = sc.nextInt();

        if(size <= 0){
            System.out.println("Input is invalid!");
        }

        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element "+i);
            arr[i] = sc.nextInt();
        }
        ReverseArray rs = new ReverseArray();
        int [] newArr = rs.reverseArray(arr);
        
        for(int k : newArr){
            System.out.print(" "+k);
        }

    }
}