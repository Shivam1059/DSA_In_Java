import java.util.Scanner;
class Test{
    public void LargestValue(int[]arr){
        int size = arr.length;
        int maxElement = arr[0];
        int index = 0;
        for(int i=1; i<size; i++){
           if(maxElement < arr[i]){
            maxElement = arr[i];
            index = i;
           }
        }
        System.out.println(" Largest elemet : "+ maxElement+" index " + index) ;
    }

}

public class Largest{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the size of array:  ");
    int size = sc.nextInt();

    if(size <= 0){
       System.out.println("Invalid input!");
       return;
    }
    
    int[] arr = new int[size];
    for(int i=0; i<size; i++){
        
        System.out.println("Enter the "+i+" element : ");
        int element = sc.nextInt();
        if(element <= 0){
            System.out.println("Invalid input!");
            return;
        }else{
             arr[i] =element;
        }
      
    }

    Test t = new Test();
    t.LargestValue(arr);
    
    } 
}