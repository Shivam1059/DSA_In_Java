import java.util.Scanner;

class Test{
    public int[] towSum(int[]arr, int target){
    
        int[]list = new int[2];    
        int left = 0, right = arr.length-1;
        while(left < right){
            int currSum = arr[left] + arr[right];
            if(currSum == target){
                list[0] = left;
                list[1] = right;
            }else{
                if(left < right){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return list ;   
    }
}

public class TwoSum{
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        
        for(int i=0; i<size; i++){
            System.out.println("Enter the element "+i+ ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target : ");
        int target = sc.nextInt();
       
       Test t = new Test();
       t.towSum(arr, target);

    }
}