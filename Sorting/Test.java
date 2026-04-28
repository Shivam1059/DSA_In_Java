import java.util.Scanner;


class Bubblesort{
    public int[] bubblesort(int[]arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int c = 0;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    c++;
                }
            }
            if(c==0){
                break;
            }
        }
        return arr;
    }


    public int[] selectionSort(int[]arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                      minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}



class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int[]arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }
         
         Bubblesort bs = new Bubblesort();
        //  int[]newarr =  bs.bubblesort(arr);
        int[]newarr = bs.selectionSort(arr);

         for(int i : newarr){
            System.out.print(i+"  ");
         }
    }
}