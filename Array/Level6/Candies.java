import java.util.*;

class Test{
    public List<Boolean> kidwithCandies(int[]arr, int extr){
        List<Boolean> list = new ArrayList<>();
       for(int i=0; i<arr.length; i++){
          int ans = arr[i]+ extr;
            int max = 0;
           for(int j=0; j<arr.length; j++){
               if(max < arr[j]){
                 max = arr[j];
               }
           }

           if(ans > max){
            list.add(true);
           }else{
             list.add(false);
           }
       }

       return list;
    } 
}
class Candies{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int[]candies = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the condies : ");
            candies[i] = sc.nextInt();
        }

        System.out.println("ENter the extra candies : ");
        int  extra = sc.nextInt();
        Test t = new  Test();
        t.kidwithCandies(candies, extra);
    }
}