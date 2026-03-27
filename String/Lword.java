import java.util.*;

class Test{
    public void checkLargest(String str){
       String[] words = str.split(" ");

       String largestword = " ";
       
       for(String word : words){
           if(word.length() > largestword.length()){
              largestword = word;
           }
       }
       System.out.println("Largest word : "+largestword);
    }
}

public class Lword{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the String : ");
     String str = sc.nextLine();
     
     Test t = new Test();
     t.checkLargest(str);
     
    
    }
}