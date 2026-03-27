class CheckAngaram{
     public static  boolean checked(String st1, String st2){

         if(st1.length() != st2.length()) return false;

         String a = st1.toLowerCase();
         String b = st2.toLowerCase();

         int[] freq = new int[26];
         
         for(int i=0; i<a.length(); i++){
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
         }

         for(int i=0; i<26; i++){
            if(freq[i] != 0){
                return false;
            }
         }
        return true;

     }

     public static void main(String args[]){
        String str1 = "geekforgeek";
        String str2 = "keegForKeeg";

        System.out.println(checked(str1, str2));
     }
}