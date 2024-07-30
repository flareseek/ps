#include <iostream>

int main(void) {
    int a, b, c;
    int result = 0;
    std::cin >> a >> b >> c;
    while(1) {
        if (a < b) {
            a += c;
            result ++;
        } else break;
    }
    std::cout << result;
    return 0;
}