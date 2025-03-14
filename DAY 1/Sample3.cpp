#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter the number: ";
    cin >> n;

    // Print the number of times 2 divides n
    while (n % 2 == 0) {
        cout << 2 << " ";
        n = n / 2;
    }

    // Check for odd factors from 3 onwards
    for (int i = 3; i * i <= n; i += 2) { // Only check up to sqrt(n)
        while (n % i == 0) {
            cout << i << " ";
            n = n / i;
        }
    }

    // If n is a prime number greater than 2, print it
    if (n > 2) {
        cout << n;
    }

    return 0;
}
