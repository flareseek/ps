#include <iostream>

int main(void) {
    int a, b, c;
    std::cin >> a >> b >> c;
    std::cout << (a+b==c ? "correct!" : "wrong!");
    return 0;
}