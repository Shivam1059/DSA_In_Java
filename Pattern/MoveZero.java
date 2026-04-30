import java.util.Scanner;
class Test{
    public int[]  movezero(int[]arr){
        int j = 0;
        for(int i=0;i<arr.length; i++){
            if(arr[j] != arr[i]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            } 
        }
        return arr;
    }
}
class MoveZero{
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the size of array : ");
       int size = sc.nextInt();

        if(size  <= 0){
            System.out.println("Input is invalid!");
             sc.close();
             return;
        }

        int[]arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }

        Test t = new Test();
        int[]newarr = t.movezero(arr);
        for(int i : newarr){
            System.out.print(i+" ");
        }
    }
}