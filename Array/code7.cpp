#include <iostream>
using namespace std;

int main() {
    int arr[7] = {2,4,5,7,4,2,5};
    int ans = 0;

    for(int i = 0; i < 7; i++) {
        ans = ans ^ arr[i];
    }

    cout << "Result = " << ans << endl;
    return 0;
}

