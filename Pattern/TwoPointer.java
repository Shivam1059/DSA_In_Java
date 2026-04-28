class TwoPointer{
    public static void main(String args[]){
        int arr[] = {17,-3,10,-6,-4,2,8,6,-5};

        for(int i=0, j=0; i<arr.length; i++){
            if( i > 0 && arr[i]>0){
                j=i;
                while(arr[j-1] < 0){
                   int temp = arr[j-1];
                   arr[j-1] = arr[j];
                   arr[j] = temp;
                   j--;
                }
            }
        }
        for(int k : arr){
            System.out.print(k+",");
        }
    }
}