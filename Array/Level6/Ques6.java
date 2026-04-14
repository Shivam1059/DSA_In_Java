/* Add Binary
Given two binary strings a and b, return their sum as a binary string.
Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

*/
import java.util.Scanner;
class Test{
  public String reverseString(String strs){
    char[] str = strs.toCharArray();
    int start = 0;
   int  end  = str.length -1;
   while(start < end){
      char temp = str[start];
      str[start] = str[end];
      str[end] = temp;

      start++;
      end--;
   }
  String result = new String(str);
   return result;
  }
  public String decimalToBinary(int a){
   String str = "";
   while( a > 0){
   int digit = a % 2;
     str += digit;
      a = 1*a/2;
   }
   String reverseStr = reverseString(str);
   return reverseStr;
  }

}

class Ques6{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

  System.out.println("Enter the value a : ");
  int a = sc.nextInt();

  System.out.println("Enter the value b : ");
  int b = sc.nextInt();

  Test t = new Test();
  System.out.println(t.decimalToBinary(a));

  }
}