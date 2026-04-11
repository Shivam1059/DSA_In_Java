/* one plus 
 Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
*/

import java.util.Scanner;
class Test{
   public int[] onePlus(int[]arr){
     int n = arr.length;
    for(int i=n-1; i>=0; i--){
        if(arr[i] < 9){
           arr[i]++;
           return arr;
       }
         arr[i] = 0;
     }
    int[] result = new int[n+1];
     result[0] = 1;
     return result;
  }
}


class  Ques5{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

   System.out.println("Enter the size : ");
   int size = sc.nextInt();

  if(size <= 0){
    System.out.println("Input is invalid");
  }

  int[]arr = new int[size];
   
  for(int i=0; i<size; i++){
    System.out.println("Enter the element : ");
    arr[i] = sc.nextInt();
  }
  
  for(int i : arr){
  System.out.print(i+" ");
  }
   
  System.out.println();
  Test t = new Test();

  int[] newArr = t.onePlus(arr);

  for(int i : newArr){
    System.out.print(i+" ");
  }
 }
}