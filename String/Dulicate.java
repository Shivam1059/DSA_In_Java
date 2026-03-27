import java.util.Scanner;
class Test{
    public String  Removechar(String str1, String str2){
          String str = "";

          for(int i=0; i<str1.length(); i++){

              boolean found = false;

            for(int j=0; j<str2.length(); j++){
               if(str1.charAt(i) == str2.charAt(j)){
                         found = true;
                         break;
                  }
              }
              if(!found){
                str += str1.charAt(i);
              }
          }
          return str;
    }
}


class Dulicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter the str1 ");
         String str1 = sc.nextLine();


         System.out.println("Enter the str2 ");
         String str2 = sc.nextLine();

         Test t = new Test();

        String result =  t.Removechar(str1, str2);

        System.out.println("Result = "+ result);
    
    }
}