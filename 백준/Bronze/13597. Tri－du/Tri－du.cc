#include <iostream>

int main(void) {
    int a, b;
    std::cin >> a >> b;
    if (a != b) std::cout << (a < b ? b : a);
    else std::cout << a;
    return 0;
}