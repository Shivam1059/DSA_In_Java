import java.util.HashMap;
import java.util.Scanner;

class Test{
    public boolean checkAnagram(String s , String t){
         String s1 = s.toLowerCase();
         String t1 = t.toLowerCase();

         if(s1.length() != t1.length()){
            return false;
         }

         int[]arr = new int[26];
         for(int i=0; i<s1.length(); i++){
            arr[s1.charAt(i) - 'a']++;
         }

         for(int j=0; j<t1.length(); j++){
            arr[t1.charAt(j)-'a']--;
            if( arr[t1.charAt(j)-'a'] < 0){
                return false;
            }
         }
         return true;
    }

    public boolean usingHash(String s , String t){
       
        String  s1 = s.toLowerCase();
        String  t1 = t.toLowerCase(); 
        int n = s1.length();
        int m = t1.length();

         HashMap<Character, Integer> map = new HashMap<>();
        if(n != m){
            return false;
        }

        for(int i=0;i<n; i++){
            char ch = s1.charAt(i);
            char  mh = t1.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
            map.put(mh,map.getOrDefault(mh,0)-1);
        }

        for(int i : map.values()){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}

class Anagram2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the str1 : ");
        String str1 = sc.nextLine();

        System.out.println("Enter the str2 : ");
        String str2 = sc.nextLine();
        
        Test t = new Test();
        // System.out.println("Angaram : "  + t.checkAnagram(str1, str2));
      System.out.println("Anagram: " + t.usingHash(str1, str2)); 

    }
}