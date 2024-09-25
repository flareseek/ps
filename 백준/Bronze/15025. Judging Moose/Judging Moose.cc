#include <iostream>

int main(void) {
    int a, b;
    std::cin >> a >> b;
    if (a == 0 && b == 0) std::cout << "Not a moose";
    else if (a == b) std::cout << "Even " << (a*2);
    else std::cout << "Odd " << (a < b ? b*2 : a*2);
    
    return 0;
}