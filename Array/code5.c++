//find the missing number 
#include<iostream>
#include <algorithm>
#include<unordered_set>
#include<vector>
using namespace std;

int main(){
     vector<int>nums = {4,3,2,7,8,2,3,1};
     vector<int>ans;
     unordered_set<int> s;
     int n  = nums.size();

     for(int num : nums){
        s.insert(num);
     }

     for(int i=1; i<n ; i++){
        if(s.find(i) == s.end())
         ans.push_back(i);
     }
     
     for(int j : ans){
        cout<<j<<endl;
     }
    return 0;
}

