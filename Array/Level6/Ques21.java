//Remove the duplicate element of the array   nums = [0,0,1,1,1,2,2,3,3,4]
import java.util.Scanner;


class duplicate{
    public void uniquec(int[]arr){
        for(int i=0; i<arr.length; i++){
              int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(arr[i]+", ");
            }
        }
    }
    
    public void removeDup(int[]arr){
        for(int i=0; i<arr.length; i++){
            boolean result = false;
            for(int j=0; j<i;j++){
                if(arr[j] == arr[i]){
                    result = true;
                    break;
                }
            }
            if(!result){
                System.out.print(arr[i]+", ");
            }

        }

    }

    public void removeDupSorted(int[]arr){
       int length =  arr.length;
       System.out.print(arr[0]+",");
       for(int i=1; i<length; i++){
          if(arr[i] != arr[i-1]){
            System.out.print(arr[i]+" ,");
          }
       }
    }

}
class Ques21{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      System.out.println("Enter the size of array : ");
      int size = sc.nextInt();

     int arr[] = new int[size];
      for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
      }
     
    duplicate d = new duplicate();
    // d.removeDup(arr);
    // d.removeDup(arr);
    d.removeDupSorted(arr);

    }
}