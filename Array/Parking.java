import java.util.*;
public class Parking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int one_hours = 100;
        int three_hours = 50;
        int five_hours = 20;

        System.out.println("Enter the Parking time ");
        int time = sc.nextInt();

        int coust = 0;

        if(time <= 0){
            System.out.println("Input is invalid! Enter the correct input ");
        }
        else if(time == 1){
            time *= one_hours;
            coust += time;
        }
        else if(time == 2){
            time *= one_hours;
            coust += time;
        }
        else if(time >= 3 && time < 5){
            time *= three_hours;
            coust += time;
        }else{
            time *= five_hours;
            coust += time;
        }

       System.out.println("Total Parking charge : "+coust);
    }
}