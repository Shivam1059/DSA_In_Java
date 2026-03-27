
import java.util.Scanner;

class Test{
      public void countVowelandConstant(String str){
        int countVowel = 0;
        int countConstant = 0;
           for(int i=0; i<str.length(); i++){
              char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z' ){
               if(ch == 'a'|| ch == 'e'||ch == 'i'||ch=='o'||ch == 'u'){
                  countVowel++;
               }else{
                countConstant++;
               }
            }
           }
           System.out.println("Count vowel : "+countVowel); 
           System.out.println("Count constant : "+countConstant); 
      }
}

class Count{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the String");
         String str = sc.nextLine();

         String newStr = str.toLowerCase();
         Test t = new Test();
         t.countVowelandConstant(str);
    }
}