import java.util.Scanner;

class Test{
    public int findMax(int[] arr,int k){
        int n = arr.length; 
        int windowSum = 0;

        for(int i=0; i<k; i++){
            windowSum += arr[i];
        }

        int maxSum = windowSum;
        for(int j=k; j<n; j++){
            windowSum += arr[j];
            windowSum -= arr[j-k];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
class Q18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        System.out.println("Enter the k : ");
        int k = sc.nextInt();

        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the  element : ");
            arr[i] = sc.nextInt();
        }

        Test t = new Test();
        System.out.println("Max Element : "+t.findMax(arr, k));

    }
}