#include <iostream>

int main(void) {
    int a, b, c, d;
    std::cin >> a >> b >> c >> d;

    if (a < b && b < c && c < d) {
        std::cout << "Fish Rising";
    } else if (a > b && b > c && c > d) {
        std::cout << "Fish Diving";
    } else if (a == b && b == c && c == d) {
        std::cout << "Fish At Constant Depth";
    } else {
        std::cout << "No Fish";
    }
    return 0;
}
