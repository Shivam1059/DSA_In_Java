import java.util.HashSet;
import java.util.Scanner;
class Test{
    public int[] intersection(int[]a, int[]b){
        int n = a.length;
        int m = b.length;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i] == b[j]){
                     set.add(a[i]);
                }
            }
        }
         int size = set.size();
         int[]arr  = new int[size];
         int k = 0;
         for(int i: set){
            arr[k++] = i;
         }
        return arr;
      }
    }

class Intersection{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the  size of array : ");
       int size = sc.nextInt();

       int a[] = new int[size];
       for(int i=0; i<size; i++){
        System.out.print("Enter  the element : ");
        a[i] = sc.nextInt();
       }

     System.out.println("Enter the  size of array2 : ");
     int sizes = sc.nextInt();

      int b[] = new int[sizes];
      for(int j=0; j<sizes; j++){
        System.out.println("Enter the element : ");
        b[j] = sc.nextInt();
      }

     Test t = new Test();
    int[] num = t.intersection(a, b);
    for(int i : num){
        System.out.print(i+" ");
    }
    
    }
}