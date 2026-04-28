//print the uniqec char in String

import java.util.Scanner;

class Ques22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the String : ");
       String str = sc.nextLine();
       int count = 0;
      for(int i=0; i<str.length(); i++){
         boolean alreadyseen = false;
         for(int j=0; j<i;j++){
            if(str.charAt(i) ==str.charAt(j)){
                alreadyseen = true;
                break;
            }
         }

         if(!alreadyseen){
             count++;
         }
      }
              System.out.println("Total distinct characters: " + count);
       
    }
}  