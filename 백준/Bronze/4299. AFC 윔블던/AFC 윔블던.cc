#include <iostream>

int main(void) {
    int a, b, c, d;
    std::cin >> a >> b;
    if ((a+b)%2 != 0 || a < b) {
        std::cout << "-1";
        return 0;
    }
    c = (a+b)/2;
    d = (a-b)/2;
    if (c > d)
        std::cout << c << " " << d;
    else
        std::cout << d << " " << c;
    
    return 0;
}