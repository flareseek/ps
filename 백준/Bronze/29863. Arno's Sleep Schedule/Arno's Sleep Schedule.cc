#include <iostream>

int main(void) {
    int a, b, t;
    std::cin >> a >> b;
    t = a > 10 ? (24-a+b) : (b-a);
    std::cout << t;
    return 0;
}