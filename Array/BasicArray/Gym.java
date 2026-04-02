// First Coding Question:
// Gym fees calculator
// 1 month=2000
// 3 months 5000
// 6months 9000
// 9months 12000
// 12months 15000
// Input: 12 Output: 150000
// Input: 24 Output: 30000

import java.util.Scanner;

class Test {

    public int calculateGymFee(int months) {
      final int month_1 = 2000;
       int month_3 = 5000;
       int month_6 = 9000;
       int month_9 = 12000;
       int month_12 = 15000;

        int totalFee = 0;
        while(months > 0){
           if(months >= 12){
              totalFee += month_12;
              months -= 12;
           }
           else if(months >= 9){
             totalFee += month_9;
             months -= 9;
           }
           else if(months >= 6){
             totalFee += month_6;
             months -= 6;
           }
          else if(months >= 3){
            totalFee += month_3;
            months -= 3;
          }
          else{
             totalFee += month_1;
             months -= 1;
          }
        }
        return totalFee;
    }
}

public class Gym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int months = 0;

        while (true) {
            try {
                System.out.println("Enter the number of month: ");
                months = sc.nextInt();
                if (months <= 0) {
                    System.out.println("Invalid input! Please enter the correct input : ");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input!  Please enter the correct input : ");
                sc.nextLine();
            }
        }

        Test t = new Test();
        System.out.println("Total FEES : " + t.calculateGymFee(months));
    }
}
