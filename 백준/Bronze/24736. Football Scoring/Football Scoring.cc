#include <iostream>

int main(void) {
    for(int i = 0; i < 2; i++) {
        int a, b, c, d, e;
        std::cin >> a >> b >> c >> d >> e;
        std::cout << (a*6 + b*3 + c*2 + d + e*2) << " ";
    }
    return 0;
}