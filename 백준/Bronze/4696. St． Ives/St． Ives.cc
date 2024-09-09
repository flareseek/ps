#include <iostream>

int main(void) {
    double a;
    while((std::cin >> a) && (a != 0)) {
        std::cout.precision(2);
        std::cout << std::fixed;
        std::cout << ((1) + (a) + (a*a) + (a*a*a) + (a*a*a*a)) << std::endl;
    }
    
    return 0;
}