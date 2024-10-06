#include <iostream>

int main(void) {
    int h, m;
    std::cin >> h >> m;
    std::cout << ((h-9)*60 + m);
    return 0;
}