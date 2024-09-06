#include <iostream>

int main(void) {
    int a1, b1, c1, a2, b2, c2;
    std::cin >> a1 >> b1 >> c1 >> a2 >> b2 >> c2;
    int r1 = a1 - a2;
    r1 = r1 >= 0 ? 0 : -r1;
    int r2 = b1 - b2;
    r2 = r2 >= 0 ? 0 : -r2;
    int r3 = c1 - c2;
    r3 = r3 >= 0 ? 0 : -r3;
    
    std::cout << (r1 + r2 + r3);
    return 0;
}