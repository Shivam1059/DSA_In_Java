import java.util.*;

class Intersection{

     public static void main(String[] args){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {3,4,5};

        List<Integer>list = new ArrayList<>();
        int j = 0;
        for(int i=0; i<arr1.length; i++){
          if(arr2[j] == arr1[i]){
            list.add(arr2[j]);
            j++;
          }
        }

        for(int e : list){
            System.out.println(e);
        }
     }
}