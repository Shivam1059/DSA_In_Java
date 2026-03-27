import java.util.*;
class Palindrom{
    public boolean isPalindrom(String str){
        int start = 0, end = str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}


public class largestPalindrom{
        // Method to check if string contains numbers
    public static boolean containsNumbers(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrom p = new Palindrom();
        
        System.out.println("Enter the String : ");
        String input ;
         
        do {
            System.out.println("Enter a valid string (e.g., 'hello'):");
            input = myScan.nextLine();
            if (input.trim().isEmpty() || containsNumbers(input)) {
                System.out.println("Invalid input. Please enter a correct string.");
            }
        } while (input.trim().isEmpty() || containsNumbers(input));
        System.out.println("You entered: " + input);
    }

        String str = input.toLowerCase();
        boolean valid =   p.isPalindrom(str);
        
        if(valid){
            System.out.println("Palindrom");
        }else{
            System.out.println("not Palindrom");
        }
    }
}