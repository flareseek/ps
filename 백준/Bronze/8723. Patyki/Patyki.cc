#include <iostream>

int main(void) {
    int a, b, c, r;
    std::cin >> a >> b >> c;
    
    if (a == b && b == c) {
        r = 2;
    } else {
        a *= a;
        b *= b;
        c *= c;
        
        if (a+b == c || b+c == a || a+c == b) r = 1;
        else r = 0;
    }
    std::cout << r;
    return 0;
}