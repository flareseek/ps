#include <iostream>

int main(void) {
    int n, sum = 0;
    std::cin >> n;
    while(n--) {
        int a;
        std::cin >> a;
        sum += a;
    }
    std::cout << sum;
}