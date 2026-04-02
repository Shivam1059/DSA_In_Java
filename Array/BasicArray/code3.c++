#include<iostream>
using namespace std;

int stringToint(string s){
    int result = 0;
    for(int i=0; i<s.length(); i++){
        int digit = s[i]-'0';
        result = result*10 + digit;
    }
    return result;
}

int main(){
    string a = "11";
    string b = "1";

   int num1 = stringToint(a);
   int num2 = stringToint(b);

   cout<<num1+num2<<endl;
    return 0;
}