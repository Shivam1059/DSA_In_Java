import java.util.Scanner;

class Test{
    public String reverseOnlyChar(String str){
        int left = 0, right = str.length()-1;
        
         char[] ch = str.toCharArray();

        while(left < right){
            if(Character.isLetter(ch[left]) && Character.isLetter(ch[right])){
                char m = ch[left];
                ch[left] = ch[right]; 
                ch[right] = m;
                left++;
                right--;
            }
            else if(!Character.isLetter(left)){
                left++;
            }else{
                right--;
            }
        }
        return new String(ch);
    }
}

class Reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        Test t = new Test();
        System.out.println("New reverse String : "+t.reverseOnlyChar(str));

    }
}