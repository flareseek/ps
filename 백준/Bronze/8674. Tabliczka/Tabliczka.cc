#include <iostream>

int main(void) {
    unsigned int a, b;
    std::cin >> a >> b;
    
    if ((a%2) && (b%2)) {
        std::cout << (a < b ? a : b);
    } else {
        std::cout << 0;
    }
    return 0;
}