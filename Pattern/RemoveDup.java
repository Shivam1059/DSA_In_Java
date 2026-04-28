import java.util.Scanner;

class Test{
    public int removeElement(int[]arr, int val){
        int k  = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != val){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
}
class RemoveDup{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();

    if(size <= 0){
        System.out.println("Input is invlalid!");
    }
     System.out.println("Enter the val ");
    int val = sc.nextInt();

    int[]arr = new int[size];
    for(int i=0; i<size; i++){
        System.out.println("Enter the element : ");
        arr[i] = sc.nextInt();
    }
   
    Test  t = new Test();

    System.out.println("Count : "+ t.removeElement(arr, val));
    }
}