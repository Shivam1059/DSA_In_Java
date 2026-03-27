
import java.util.Arrays;



 class Anagram{
    public static boolean isAnagram(String s1, String s2){
      if(s1.length() != s2.length()){
        return false;
      }

      char[] a = s1.toCharArray();
      char[] b = s2.toCharArray();

      Arrays.sort(a);
      Arrays.sort(b);

      return Arrays.equals(a,b);

    }
     public static void main(String args[]){
        String str1 = "listen";
        String str2 = "silent";
       
       System.out.println(isAnagram(str1, str2));
    }
 }