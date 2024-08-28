#include <iostream>

int main(void) {
    int a, b, c;
    std::cin >> a >> b >> c;
    std::cout << (b == c ? "Anything" : (b < c ? "Bus" : "Subway"));
    return 0;
}
