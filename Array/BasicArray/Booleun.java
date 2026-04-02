
import java.util.*;

class Test {

    public void maxPeopleAccommdet(int[] list, int capacity) {
        int maxSum = 0;
        int count = 0;

        Arrays.sort(list);
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + " ");
        }
        System.out.println();

        for (int i = 0; i < list.length; i++) {
            int currSum = list[i];
            if (maxSum + currSum < capacity) {
                maxSum += currSum;
                count++;
            } else {
                break;
            }
        }

        System.out.println("Total People Accommdet by boolean : " + count);
    }
}

public class Booleun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of people in boolean");
        int n = sc.nextInt();

        int[] list = new int[n];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter the weight of " + i + 1 + " people ");
            int weight = sc.nextInt();
            list[i] = weight;
        }

        System.out.println("Enter the total capacity of boolean that care weight : ");
        int capacity = sc.nextInt();

        Test t = new Test();
        t.maxPeopleAccommdet(list, capacity);
    }
}
