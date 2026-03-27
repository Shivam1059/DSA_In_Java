
import java.util.Scanner;

class Test{
     public StringBuilder removeVowel(StringBuilder str){
     
        for(int i=0; i<str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch == 'a' ||  ch == 'e'||ch == 'i'||ch  == 'o'||ch == 'u'){
                str.deleteCharAt(i);
                i--;
            }
        }
        return str;
     }
}


class RemoveVowel{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string : ");
      StringBuilder str = new StringBuilder(sc.nextLine());
     
     Test t  = new Test();
     System.out.println(t.removeVowel(str));

    }
}