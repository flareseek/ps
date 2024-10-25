#include <iostream>

int main(void) {
    int a;
    while(std::cin >> a) {
        if (a == 9) {
            std::cout << "F";
            return 0;
        }
    }
    std::cout << "S";
    return 0;
}