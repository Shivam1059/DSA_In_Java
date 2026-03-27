
//string to integer conversion

#include<iostream>
using namespace std;

int stringToInt(string s){
    int result = 0;
    for(int i=0; i<s.length(); i++){
        int digit = s[i]-'0';
        result = result * 10 + digit;
    }
    return result;
}
int main(){
    string num = "123";
    cout<<stringToInt(num)<<endl;
    return 0;
}