#include <iostream>

using namespace std;

bool isPerfect(int num) {
    int sum = 1; 

    
    for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
            sum += i;
        }
    }

    return sum == num && num != 1; 
}

int main() {
    int num;
    cout << "Enter a number: ";
    cin >> num;

    if (isPerfect(num))
        cout << num << " is a Perfect Number." << endl;
    else
        cout << num << " is NOT a Perfect Number." << endl;

    return 0;
}
