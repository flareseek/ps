#include <iostream>

int main(void) {
    int n;
    std::cin >> n;
    std::cout << std::fixed;
    std::cout.precision(2);
    std::cout << (n/4.0);
    return 0;
}