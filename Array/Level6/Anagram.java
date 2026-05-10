
import java.util.*;

class Test{
      public boolean checkAnagram(String r, String p){
         if(r.length()-1 != p.length()-1) return false;
         int n = r.length();
         int m = p.length();
      

         HashMap<Character, Integer> map = new HashMap<>();

         for(int i=0; i<n; i++){
            char ch = r.charAt(i);
              map.put(ch, map.getOrDefault(ch, 0)+1);
         }

        for(int j=0; j<m; j++){
            char hm = p.charAt(j);
            if(map.containsKey(hm)){
             map.put(hm, map.get(hm) - 1);
            }else{
               return false;
            }
         }
       
       for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
      }
}
class Anagram{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Str1 : ");
         String s = sc.nextLine();

         System.out.println("Enter the Str2 : ");
         String k = sc.nextLine();

         Test t = new Test();
         System.out.println("Check the Anagram :   "+t.checkAnagram(s, k));
         
     }
}