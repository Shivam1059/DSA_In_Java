/*  Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 

*/
import java.util.*;
class  MaxProfit{
   public int maximumProfit(int[]arr){
   int maxProfit = 0;
   int j = 0;
   for(int i=0; i<arr.length; i++){
        int price = arr[i] - arr[j];
        maxProfit = Math.max(maxProfit, price);
        if(arr[i] < arr[j]){
           j = i;
        }
   }
    return maxProfit;
  }
   public int maxProfit(int[]arr){
     int minPrice = Integer.MAX_VALUE;
     int maxProfit = 0;
     for(int i=0; i<arr.length; i++){
         if(minPrice  > arr[i]){
            minPrice = arr[i];
         }else{
           int price = arr[i] - minPrice;
           maxProfit = Math.max(maxProfit, price);

        }
     }
      return maxProfit;
   }
}

class Ques11{
   public static void  main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   System.out.print("Enter the size of array : ");
   int size = sc.nextInt();

   if(size <= 0){
     System.out.println("Input is invalid");
     sc.close();
     return;
   }

   int[]arr = new int[size];
   for(int i=0; i<size; i++){
     System.out.print("Enter the stack price "+i+": ");
     arr[i] = sc.nextInt();
  }
  
   MaxProfit mp = new MaxProfit();
  // System.out.println("Max Profit :  "+mp.maxProfit(arr));
     System.out.println("Max Profit :  "+mp.maximumProfit(arr));
  }  
}