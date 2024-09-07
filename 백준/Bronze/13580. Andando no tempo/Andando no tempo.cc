#include <iostream>

int main(void) {
    int a, b, c;
    std::cin >> a >> b >> c;
    if (a == b || b == c || a == c || (a+b) == c || (a+c) == b || (b+c) == a) {
        std::cout << "S";
    } else {
        std::cout << "N";
    }
    return 0;
}
