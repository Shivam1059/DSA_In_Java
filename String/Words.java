import java.util.Scanner;
import java.util.*;
class Words{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the str1 : ");
        String s = sc.nextLine();

        System.out.println("Enter the str1 : ");
        String t = sc.nextLine();
        sc.nextLine();

        char[]arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();


        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<arr2.length; i++){
             if(map.containsKey(arr2[i])){
                map.put(arr1[i], -1);
              }
              map.put(arr1[i], map.put(arr2[i],1));
        }
      for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 0) { 
       
      }
}


    }
}