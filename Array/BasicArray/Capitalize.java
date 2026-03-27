 import java.util.Scanner;


//first capital letter of the word
 class Capitalize{
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sc.nextLine();
        
        StringBuilder result = new StringBuilder(str);

        if(result.length() > 0){
            result.setCharAt(0, Character.toUpperCase(result.charAt(0)));
        }
        for(int i=1; i<str.length(); i++){
            if(result.charAt(i - 1) == ' '){
                result.setCharAt(i, Character.toUpperCase(result.charAt(i)));
            }
        }

        System.out.println("Capitalized String : "+result);
        sc.close();
     }
 }