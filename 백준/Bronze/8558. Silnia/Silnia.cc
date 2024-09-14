#include <iostream>

int main(void) {
    int n, r = 1;
    std::cin >> n;

    for(int i = 1; i <= n; i++) {
        r *= i;
        r %= 10;
    }
    std::cout << r;
    return 0;
}
