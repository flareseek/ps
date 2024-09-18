#include <iostream>

int main(void) {
    double a, b;
    
    while(std::cin >> a >> b) {
        if (a == 0 || b == 0) {
            std::cout << "AXIS\n";
        } else if (a > 0) {
            if (b > 0) std::cout << "Q1\n";
            else std::cout << "Q4\n";
        } else if (a < 0) {
            if (b > 0) std::cout << "Q2\n";
            else std::cout << "Q3\n";
        }

        if (a == 0 && b == 0) {
            break;
        }
    }
    return 0;
}