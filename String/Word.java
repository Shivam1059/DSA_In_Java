import java.util.Scanner;
class Test{
    public void findLargestWord(String str){
         
         String[] words = str.split("\\s+");
         String longetString = "";
         for(String word : words){
            if(word.length() > longetString.length()){
                longetString = word;
            }
         }

         System.out.println(longetString);
     } 

}
class Word{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sc.nextLine();
        Test t = new Test();
        t.findLargestWord(str);
    }
}