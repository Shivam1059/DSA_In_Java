
class Movezero{
    public static void main(String[] args) {
        int  arr[] = {0,1,0,2,12};
        int i = 0;
        for(int j=0; j<arr.length; j++){
            if(arr[j] != 0){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i++;
            }
        }
        for(int k : arr){
            System.out.println(k);
        }
    }
}