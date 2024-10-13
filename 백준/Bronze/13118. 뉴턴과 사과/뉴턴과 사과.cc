#include <iostream>

int main(void) {
    int p1, p2, p3, p4, x, t;
    std::cin >> p1 >> p2 >> p3 >> p4;
    std::cin >> x >> t >> t;
    if (p1 == x) std::cout << 1;
    else if (p2 == x) std::cout << 2;
    else if (p3 == x) std::cout << 3;
    else if (p4 == x) std::cout << 4;
    else std::cout << 0;
    return 0;
}