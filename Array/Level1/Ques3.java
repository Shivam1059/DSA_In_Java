import java.util.*;
class Ques3{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the size of array : ");
      int size = sc.nextInt();

      int[]arr = new int[size];
      for(int i=0; i<size; i++){
        System.out.println("Enter the element :"+i);
        arr[i] = sc.nextInt();
      }  

    int mul = 1;
     for(int i: arr ){
        System.out.print(i+" ");
        mul = mul*i;
     }

     System.out.println("Multiplication : "+mul);
    }
}