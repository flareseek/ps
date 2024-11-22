#include <iostream>

int main(void) {
    float a, b;
    std::cin >> a >> b;
    std::cout << (a >= b/2 ? "E" : "H");
    return 0;
}