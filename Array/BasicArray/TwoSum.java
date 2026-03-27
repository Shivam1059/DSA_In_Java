
import java.util.ArrayList;
import java.util.Scanner;

class Test {

    public int[] towSum(ArrayList<Integer> list, int target) {
        int n = list.size();
        int i = 0;
        while (i < n) {
            for (int j = i + 1; j < n; j++) {
                int sum = list.get(i) + list.get(j);
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
            i++;
        }
        return new int[]{};
    }
}

public class TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element " + i + " :  ");
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println("Enter the target : ");
        int Target = sc.nextInt();

        Test test = new Test();
        int[] result = test.towSum(list, Target);
        if (result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found");
        }

    }
}
