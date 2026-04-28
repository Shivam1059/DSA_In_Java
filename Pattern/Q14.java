import java.util.Scanner;

class  Test{
    public int[] removeDuplicate(int[]arr, int val){
        int k =0; 
        for(int i=0; i<arr.length; i++){
            if(arr[i] != val){
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.print("Count : "+k);
        return arr;
    }
}
class Q14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        

        int[]arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }

       Test t = new Test();
       t.removeDuplicate(arr, val);
    }
}