#include <iostream>

int main(void) {
    int a, b;
    std::cin >> a >> b;
    if ((12 <= a && a <= 16) && b == 0) {
        std::cout << 320;
    } else {
        std::cout << 280;
    }
    return 0;
}