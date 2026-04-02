import java.util.*;
class Test{
    public int[] sortArray(int[]arr){
        int max = arr[0];
         Arrays.sort(arr);
      return arr;
    }
    public int removeDuplicate(int[]arr){
       int i = 1;
       for(int j=1; j<arr.length; j++){
        if(arr[i] != arr[j-1]){
            arr[j] = arr[i];
            i++;
        }
       }
       return i;
    }
}

public class RemoveDup{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter element "+i+" : ");
            arr[i] = sc.nextInt();
        }
        
       Test t = new Test();
       int[] newArr =   t.sortArray(arr);
        System.out.println();
        for(int i : newArr){
            System.out.println(newArr[i]);
        }
    }
}