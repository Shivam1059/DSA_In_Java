//single number find
// #include<iostream>
// using namespace std;

// int findUnique(int arr[], int n){

//     for(int i=0; i<n; i++){
//         int count = 0;
//         for(int j=0; j<n; j++){
//             if(arr[i] == arr[j]){
//                 count++;
//             }
//         }
//         if(count == 1){
//            int  uniquce = arr[i];
//             return uniquce;
//         }
//     }
//     return -1;
// }
// int main(){
//     int arr[] = {4,4,8, 2,3,2,3};
//     int ans = findUnique(arr, 5);

//     cout<<ans<<endl;
//     return 0;
// }



#include<iostream>
using namespace std;

int main(){
    int arr[] = {2,3,4,2,3,4,9};
   int ans = 0;
   for(int i=0; i<7; i++){
       ans = ans ^ arr[i];
   }
   cout<<ans<<endl;
   return 0;
}