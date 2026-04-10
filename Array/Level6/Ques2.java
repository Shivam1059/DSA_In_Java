/*  Remove duplicated in sorted order array
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
remove duplicat in sorted order array 

*/

import java.util.Scanner;
class RemoveDup{
  public int[] removeDup(int[]arr){
    int j = 1;
    for(int i=1; i<arr.length; i++) {
           if(arr[i] != arr[i-1]){
                arr[j] = arr[i];
           }
          j++;
        }          
      return j;
      }
}

class Ques2{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size : ");
    int size = sc.nextInt();

     int arr[] = new int[size];

    for(int i=0; i<size; i++){
      System.out.println("Enter the element  : ");
      arr[i] = sc.nextInt();
     }
  
    RemoveDup  rd = new RemoveDup();
     rd.removeDup(arr);

    for(int i : arr){
      System.out.print(i+",");
    }

  }
}
