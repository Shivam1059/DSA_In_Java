
import java.util.Arrays;
import java.util.Scanner;

class Test{
    public boolean checkAnagram(String s1, String s2){
      
        if(s1 == null || s2 == null){
            return false;
        }
         s1 = s1.toLowerCase();
         s2 = s2.toLowerCase();

        if(s2.length() != s1.length()){
            return false;
        }

       char[] arr1 = s1.toCharArray();
       char[] arr2 = s2.toCharArray();

       Arrays.sort(arr1);
       Arrays.sort(arr2);

     return  Arrays.equals(arr1, arr2);
    }
}


class Anagram{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string 1 : ");
        String str1 = sc.nextLine();

       System.out.println("Enter the String 2 : ");
       String str2 = sc.nextLine();

       Test t = new Test();
       
     System.out.println(t.checkAnagram(str1, str2)); 
 
    }
}